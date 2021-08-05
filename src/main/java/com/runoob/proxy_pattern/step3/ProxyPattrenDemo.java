package com.runoob.proxy_pattern.step3;

/**
 * Created by yinxing on 2018/8/28.
 */

import com.runoob.proxyPattern.step1.Image;
import com.runoob.proxyPattern.step2.ProxyImage;

/**
 * 步骤 3
 * 当被请求时，使用 ProxyImage 来获取 RealImage 类的对象。
 */
public class ProxyPattrenDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        // 图像从磁盘中加载
        image.display();
        System.out.println("\n");
        // 图像不需要磁盘中加载
        image.display();
    }
}
