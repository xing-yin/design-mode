package com.beauty_design_mode.lecture48.demo2;

import com.beauty_design_mode.lecture39_40.v3.RedisMetricsStorage;
import com.beauty_design_mode.lecture39_40.v3.model.RequestInfo;
import com.beauty_design_mode.lecture39_40.v5.MetricsCollector;
import com.beauty_design_mode.lecture48.bad.UserVo;

/**
 * 如果原始类并没有定义接口，并且原始类代码并不是我们开发维护的（比如它来自一个第三方的类库），我们也没办法直接修改原始类，给它重新定义一个接口。
 * <p>
 * 对于这种外部类的扩展，一般采用继承的方式。即代理类继承原始类，然后扩展附加功能。
 *
 * @author Alan Yin
 * @date 2021/3/3
 */

public class UserServiceProxy extends UserService {

    private MetricsCollector metricsCollector; // 依赖注入

    public UserServiceProxy() {
        this.metricsCollector = new MetricsCollector(new RedisMetricsStorage());
    }

    @Override
    public UserVo login(String username, String password) {
        long startTime = System.currentTimeMillis();
        UserVo userVo = super.login(username, password);
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTime);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }

    @Override
    public UserVo register(String username, String password) {
        long startTime = System.currentTimeMillis();
        UserVo userVo = super.register(username, password);
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        RequestInfo requestInfo = new RequestInfo("register", responseTime, startTime);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }

}
