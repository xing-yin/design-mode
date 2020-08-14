package com.beauty_design_mode.lecture51.application_scenarios.demo2.good;

import java.util.ArrayList;
import java.util.List;

/**
 * 扩展性更好，更加符合开闭原则，如果添加一个新的敏感词过滤系统，这个类完全不需要改动；
 * 而且基于接口而非实现编程，代码的可测试性更好。
 *
 * @author Alan Yin
 * @date 2020/8/13
 */

public class RiskManagement {

    private List<ISensitiveWordsFilter> filters = new ArrayList<>();

    public void addSensitiveWordsFilter(ISensitiveWordsFilter filter) {
        this.filters.add(filter);
    }

    public String filterSensitiveWords(String text) {
        String maskedText = text;
        for (ISensitiveWordsFilter filter : filters) {
            maskedText = filter.filter(maskedText);
        }
        return maskedText;
    }
}
