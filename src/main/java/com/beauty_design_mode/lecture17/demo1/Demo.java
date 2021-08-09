package com.beauty_design_mode.lecture17.demo1;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHttpRequest;

/**
 * @author Alan Yin
 * @date 2021/8/9
 */

public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        // 里式替换原则
        demo.testFunction(new SecurityTransporter(new DefaultHttpClient(), "app-1234556", "app-secret"));
    }

    public void testFunction(Transporter transporter) {
        HttpRequest request = new BasicHttpRequest("get", "/api/get");
        // 省略设置 request 参数的代码
        HttpResponse response = transporter.senRequest(request);
        // 省略其他逻辑
    }

}
