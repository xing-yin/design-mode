package com.beauty_design_mode.lecture62.apply;

/**
 * @author Alan Yin
 * @date 2020/3/30
 */

public interface ISensitiveWordFilter {

    /**
     * 过滤方法
     *
     * @param content
     * @return
     */
    boolean doFilter(Content content);
}
