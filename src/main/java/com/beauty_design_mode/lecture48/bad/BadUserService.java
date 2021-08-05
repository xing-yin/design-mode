package com.beauty_design_mode.lecture48.bad;

import com.beauty_design_mode.lecture39_40.v3.model.RequestInfo;
import com.beauty_design_mode.lecture39_40.v5.MetricsCollector;

/**
 * 坏代码：
 * <p>
 * 第一，性能计数器框架代码侵入到业务代码中，跟业务代码高度耦合。如果未来需要替换这个框架，那替换的成本会比较大。
 * 第二，收集接口(MetricsCollector)请求的代码跟业务代码无关，本就不应该放到一个类中。业务类最好职责更加单一，只聚焦业务处理。
 *
 * @author Alan Yin
 * @date 2021/3/3
 */

public class BadUserService {

    private MetricsCollector metricsCollector; // 依赖注入

    public BadUserService(MetricsCollector metricsCollector) {
        this.metricsCollector = metricsCollector;
    }

    public UserVo login(String username, String password) {
        long startTime = System.currentTimeMillis();
        // 省略 login 逻辑
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTime);
        metricsCollector.recordRequest(requestInfo);

        // 返回 UserVo 数据
        return null;
    }

    public UserVo register(String username, String password) {
        long startTime = System.currentTimeMillis();
        // 省略 register 逻辑
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        RequestInfo requestInfo = new RequestInfo("register", responseTime, startTime);
        metricsCollector.recordRequest(requestInfo);

        // 返回 UserVo 数据
        return null;
    }

}
