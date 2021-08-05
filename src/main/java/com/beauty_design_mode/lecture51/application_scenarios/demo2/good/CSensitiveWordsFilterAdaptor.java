package com.beauty_design_mode.lecture51.application_scenarios.demo2.good;

import com.beauty_design_mode.lecture51.application_scenarios.demo2.CSensitiveWordsFilter;

/**
 * @author Alan Yin
 * @date 2020/8/13
 */

public class CSensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {

    private CSensitiveWordsFilter cSensitiveWordsFilter;

    @Override
    public String filter(String text) {
        String maskedText = cSensitiveWordsFilter.filter(text, "****");
        return maskedText;
    }
}
