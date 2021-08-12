package com.beauty_design_mode.lecture18.demo2;

import lombok.Data;

import java.util.Collection;

/**
 * @author Alan Yin
 * @date 2021/8/11
 */
@Data
public class BadStatistics {

    private Long max;

    private Long min;

    private Long average;

    private Long sum;

    private Long percentile99;

    private Long percentile999;

    public BadStatistics count(Collection<Long> dateSet) {
        BadStatistics statistics = new BadStatistics();
        // 省略计算逻辑
        return statistics;
    }

}
