package com.beauty_design_mode.lecture51.application_scenarios.demo2.bad;

import com.beauty_design_mode.lecture51.application_scenarios.demo2.ASensitiveWordsFilter;
import com.beauty_design_mode.lecture51.application_scenarios.demo2.BSensitiveWordsFilter;
import com.beauty_design_mode.lecture51.application_scenarios.demo2.CSensitiveWordsFilter;

/**
 * 未使用适配器模式之前的代码：代码的可测试性、扩展性不好
 *
 * @author Alan Yin
 * @date 2020/8/13
 */

public class RiskManagement {

    private ASensitiveWordsFilter aFilter = new ASensitiveWordsFilter();

    private BSensitiveWordsFilter bFilter = new BSensitiveWordsFilter();

    private CSensitiveWordsFilter cFilter = new CSensitiveWordsFilter();

    public String filterSensitiveWords(String text) {
        String maskedText = aFilter.filterSexWords(text);
        maskedText = aFilter.filterPoliticalWords(maskedText);
        maskedText = bFilter.filter(maskedText);
        maskedText = cFilter.filter(maskedText, "****");
        return maskedText;
    }

}
