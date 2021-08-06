package com.runoob.proxy_pattern.step2;

import com.runoob.proxy_pattern.step1.Image;

/**
 * Created by yinxing on 2018/8/28.
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }
}
