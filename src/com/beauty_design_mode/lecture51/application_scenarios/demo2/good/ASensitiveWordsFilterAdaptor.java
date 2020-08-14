package com.beauty_design_mode.lecture51.application_scenarios.demo2.good;

import com.beauty_design_mode.lecture51.application_scenarios.demo2.ASensitiveWordsFilter;

/**
 * 适用场景2: 统一多个类的接口设计
 * <p>
 * 某个功能的实现依赖多个外部系统（或者说类）。通过适配器模式，将它们的接口适配为统一的接口定义，然后我们就可以使用多态的特性来复用代码逻辑。
 *
 * @author Alan Yin
 * @date 2020/8/13
 */

public class ASensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {

    private ASensitiveWordsFilter aSensitiveWordsFilter;

    @Override
    public String filter(String text) {
        // 利用组合的方式调用对应的方法
        String maskedText = aSensitiveWordsFilter.filterSexWords(text);
        maskedText = aSensitiveWordsFilter.filterPoliticalWords(maskedText);
        return maskedText;
    }
}
