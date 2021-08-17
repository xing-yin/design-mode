package com.beauty_design_mode.lecture21.demo1.not_good;

import com.beauty_design_mode.lecture21.demo1.support.Html;
import com.beauty_design_mode.lecture21.demo1.support.HtmlRequest;

/**
 * @author Alan Yin
 * @date 2021/8/17
 */

public class HtmlDownloader {

    private NetworkTransporter networkTransporter;

    public HtmlDownloader(NetworkTransporter networkTransporter) {
        this.networkTransporter = networkTransporter;
    }

    public HtmlDownloader() {
    }

    public Html downloadHtml(String url){
        Byte[] rawHtml = networkTransporter.send(new HtmlRequest(url));
        return new Html(rawHtml);
    }
}
