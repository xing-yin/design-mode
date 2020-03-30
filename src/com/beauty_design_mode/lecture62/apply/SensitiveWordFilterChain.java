package com.beauty_design_mode.lecture62.apply;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alan Yin
 * @date 2020/3/30
 */

public class SensitiveWordFilterChain {

    private List<ISensitiveWordFilter> filters = new ArrayList<>();

    public void addFilter(ISensitiveWordFilter filter) {
        filters.add(filter);
    }

    public boolean filter(Content content) {
        for (ISensitiveWordFilter filter : filters) {
            if (!filter.doFilter(content)) {
                return false;
            }
        }
        return true;
    }
}
