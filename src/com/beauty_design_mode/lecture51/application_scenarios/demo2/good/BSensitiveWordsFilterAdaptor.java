package com.beauty_design_mode.lecture51.application_scenarios.demo2.good;

import com.beauty_design_mode.lecture51.application_scenarios.demo2.BSensitiveWordsFilter;

/**
 * @author Alan Yin
 * @date 2020/8/13
 */

public class BSensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {

    private BSensitiveWordsFilter bSensitiveWordsFilter;

    @Override
    public String filter(String text) {
        String maskedText = bSensitiveWordsFilter.filter(text);
        return maskedText;
    }
}
