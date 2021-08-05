package com.beauty_design_mode.lecture62.apply.bad;

import com.beauty_design_mode.lecture62.apply.Content;

/**
 * 反例:敏感词过滤(性、广告、政治)
 *
 * @author Alan Yin
 * @date 2020/3/30
 */

public class BadSensitiveWordFilter {

    /**
     * 敏感词过滤
     *
     * @param content
     * @return return true if content does not contain sensitive word
     */
    public boolean filter(Content content) {
        if (!filterSexyWord(content)) {
            return false;
        }

        if (!filterAdsWord(content)) {
            return false;
        }

        if (!filterPoliticalWord(content)) {
            return false;
        }

        return true;
    }

    private boolean filterSexyWord(Content content) {
        // ...
        return false;
    }

    private boolean filterAdsWord(Content content) {
        // ...
        return false;
    }

    private boolean filterPoliticalWord(Content content) {
        // ...
        return false;
    }


}
