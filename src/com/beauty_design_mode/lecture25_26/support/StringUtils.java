package com.beauty_design_mode.lecture25_26.support;

/**
 * @author Alan Yin
 * @date 2020/10/14
 */

public class StringUtils {

    public static boolean isBlank(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }
}
