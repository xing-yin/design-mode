package com.runoob.adapter_pattern.step5;

/**
 * Created by yinxing on 2018/8/23.
 */

import com.runoob.adapterPattern.step4.AudioPlayer;

/**
 * 步骤 5
 使用 AudioPlayer 来播放不同类型的音频格式
 */
public class AdapterPattrernDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","music1.mp3");
        audioPlayer.play("mp4","music2.mp4");
        audioPlayer.play("vlc","music3.vlc");
        audioPlayer.play("avi","music4.avi");
    }
}
