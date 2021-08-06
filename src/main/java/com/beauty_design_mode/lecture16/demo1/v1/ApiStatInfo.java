package com.beauty_design_mode.lecture16.demo1.v1;

import lombok.Data;

/**
 * 1.将方法中很多参数（相关的、内聚的）封装成对象
 *
 * @author Alan Yin
 * @date 2021/8/6
 */
@Data
public class ApiStatInfo {

    private String api;

    private long requestCount;

    private long errorCount;

    private long durationOfSeconds;

    /**
     * 改动一：添加新字段
     */
    private long timeoutCount;

}
