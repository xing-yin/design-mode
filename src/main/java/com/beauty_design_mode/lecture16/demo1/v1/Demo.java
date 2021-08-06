package com.beauty_design_mode.lecture16.demo1.v1;

/**
 * @author Alan Yin
 * @date 2021/8/6
 */

public class Demo {

    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo();
        // 模拟设置 apiStatInfo 的代码
        apiStatInfo.setApi("test_api");
        apiStatInfo.setDurationOfSeconds(20);
        apiStatInfo.setRequestCount(20000);
        apiStatInfo.setErrorCount(1000);
        // 改动四：设置 timeoutCount 值
        apiStatInfo.setTimeoutCount(289);
        ApplicationContext.getInstance().getAlert().check(apiStatInfo);
    }
}
