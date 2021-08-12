package com.beauty_design_mode.lecture18.demo3.bad;

import java.util.Map;

/**
 * Config 接口相当于同时拥有：
 * com.beauty_design_mode.lecture18.demo3.good.Viewer 和 com.beauty_design_mode.lecture18.demo3.good.Updater
 * 接口的功能定义，不满足接口隔离原则
 *
 * @author Alan Yin
 * @date 2021/8/12
 */

public interface Config {

    void update();

    String outputInPlainText();

    Map<String, String> output();
}
