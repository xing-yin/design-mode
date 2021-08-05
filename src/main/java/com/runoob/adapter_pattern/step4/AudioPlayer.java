package com.runoob.adapter_pattern.step4;

import com.runoob.adapterPattern.step1.MediaPlayer;
import com.runoob.adapterPattern.step3.MediaAdapter;

/**
 * Created by yinxing on 2018/8/23.
 */

/**
 * 步骤 4
 * 创建实现了 MediaPlayer 接口的实体类
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        // 播放mp3音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name:" + fileName);
        }
        // mediaAdapter提供了其他文件格式的支持
        else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media." + audioType + " format not support");
        }
    }
}
