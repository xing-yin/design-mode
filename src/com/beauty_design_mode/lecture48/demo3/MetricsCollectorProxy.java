package com.beauty_design_mode.lecture48.demo3;

import com.beauty_design_mode.lecture39_40.v3.RedisMetricsStorage;
import com.beauty_design_mode.lecture39_40.v3.model.RequestInfo;
import com.beauty_design_mode.lecture39_40.v5.MetricsCollector;
import com.beauty_design_mode.lecture48.demo1.IUserService;
import com.beauty_design_mode.lecture48.demo1.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Alan Yin
 * @date 2021/3/3
 */

public class MetricsCollectorProxy {

    private MetricsCollector metricsCollector;

    public MetricsCollectorProxy() {
        this.metricsCollector = new MetricsCollector(new RedisMetricsStorage());
    }

    public Object createProxy(Object proxyObject) {
        Class<?>[] interfaces = proxyObject.getClass().getInterfaces();
        DynamicProxyHandler handler = new DynamicProxyHandler(proxyObject);
        return Proxy.newProxyInstance(proxyObject.getClass().getClassLoader(), interfaces, handler);
    }

    private class DynamicProxyHandler implements InvocationHandler {

        private Object proxyObject;

        public DynamicProxyHandler(Object proxyObject) {
            this.proxyObject = proxyObject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            long startTime = System.currentTimeMillis();

            // 执行原始类的逻辑 todo 注意这里是 proxyObject
            Object result = method.invoke(proxyObject, args);

            long endTime = System.currentTimeMillis();
            long responseTime = endTime - startTime;
            String apiName = proxyObject.getClass().getName() + ":" + method.getName();
            RequestInfo requestInfo = new RequestInfo(apiName, responseTime, startTime);
            metricsCollector.recordRequest(requestInfo);
            return result;
        }
    }

    public static void main(String[] args) {
        MetricsCollectorProxy collectorProxy = new MetricsCollectorProxy();
        IUserService userService = (IUserService) collectorProxy.createProxy(new UserService());
        userService.login("test", "123456");
    }
}
