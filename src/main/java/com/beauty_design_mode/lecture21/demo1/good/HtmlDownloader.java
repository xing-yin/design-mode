package com.beauty_design_mode.lecture21.demo1.good;

import com.beauty_design_mode.lecture21.demo1.support.Html;
import com.beauty_design_mode.lecture21.demo1.support.HtmlRequest;

/**
 * @author Alan Yin
 * @date 2021/8/17
 */

public class HtmlDownloader {

    private NetworkTransporter transporter;

    public HtmlDownloader(NetworkTransporter transporter) {
        this.transporter = transporter;
    }

    public Html downloadHtml(String url) {
        HtmlRequest request = new HtmlRequest(url);
        Byte[] rawHtml = transporter.send(request.getAddress(), request.getContent().getBytes());
        return new Html(rawHtml);
    }
}
