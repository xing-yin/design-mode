package com.beauty_design_mode.lecture18.demo2;

import lombok.Data;

import java.util.Collection;

/**
 * @author Alan Yin
 * @date 2021/8/11
 */
@Data
public class GoodStatistics {

    private Long max;

    private Long min;

    private Long average;

    private Long sum;

    private Long percentile99;

    private Long percentile999;

    private Long max(Collection<Long> dateSet) {
        // 省略计算代码
        return null;
    }

    private Long min(Collection<Long> dateSet) {
        // 省略计算代码
        return null;
    }

    // 省略其他代码

}
