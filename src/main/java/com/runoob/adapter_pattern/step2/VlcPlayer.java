package com.runoob.adapter_pattern.step2;

import com.runoob.adapter_pattern.step1.AdvancedMediaPlayer;

/**
 * Created by yinxing on 2018/8/23.
 */

/**
 * 步骤 2
 * 创建实现了 AdvancedMediaPlayer 接口的实体类
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
