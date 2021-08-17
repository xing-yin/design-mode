package com.beauty_design_mode.lecture21.demo1.good;

import com.beauty_design_mode.lecture21.demo1.support.Html;

/**
 * 通过一个工厂方法来创建Document
 *
 * @author Alan Yin
 * @date 2021/8/17
 */

public class DocumentFactory {

    private HtmlDownloader downloader;

    public DocumentFactory(HtmlDownloader downloader) {
        this.downloader = downloader;
    }

    public Document creatDocument(String url) {
        Html html = downloader.downloadHtml(url);
        return new Document(html, url);
    }
}
