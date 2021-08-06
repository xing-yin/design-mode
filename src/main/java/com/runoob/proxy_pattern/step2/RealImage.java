package com.runoob.proxy_pattern.step2;

import com.runoob.proxy_pattern.step1.Image;

/**
 * Created by yinxing on 2018/8/28.
 */

/**
 * 步骤 2
 * 创建实现接口的实体类。
 */
public class RealImage implements Image {

    private String fileName;

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
}
