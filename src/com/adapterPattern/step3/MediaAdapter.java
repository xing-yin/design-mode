package com.adapterPattern.step3;

/**
 * Created by yinxing on 2018/8/23.
 */

import com.adapterPattern.step1.AdvancedMediaPlayer;
import com.adapterPattern.step1.MediaPlayer;
import com.adapterPattern.step2.Mp4Player;
import com.adapterPattern.step2.VlcPlayer;

/**
 * 步骤 3
 * 创建实现了 MediaPlayer 接口的适配器类
 */
public class MediaAdapter implements MediaPlayer {

    protected AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
