package com.runoob.adapter_pattern.step2;

import com.runoob.adapterPattern.step1.AdvancedMediaPlayer;

/**
 * Created by yinxing on 2018/8/23.
 */

/**
 * 步骤 2
 * 创建实现了 AdvancedMediaPlayer 接口的实体类
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 file. Name:" + fileName);
    }
}
