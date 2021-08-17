package com.beauty_design_mode.lecture21.demo1.support;

import lombok.Data;

/**
 * @author Alan Yin
 * @date 2021/8/17
 */
@Data
public class HtmlRequest {

    private String address;

    private String content;

    public HtmlRequest(String url) {
    }

}
