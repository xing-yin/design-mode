package com.beauty_design_mode.lecture21.demo1.not_good;

import com.beauty_design_mode.lecture21.demo1.support.Html;

/**
 * @author Alan Yin
 * @date 2021/8/17
 */

public class Document {

    private Html html;

    private String url;

    public Document(String url) {
        this.url = url;
        HtmlDownloader downloader = new HtmlDownloader();
        this.html = downloader.downloadHtml(url);
    }

    /**
     * 这个类的问题比较多，主要有三点：
     *
     * 第一，构造函数中的 downloader.downloadHtml() 逻辑复杂，耗时长，不应该放到构造函数中，会影响代码的可测试性。
     * 第二，HtmlDownloader 对象在构造函数中通过 new 来创建，违反了基于接口而非实现编程的设计思想，也会影响到代码的可测试性。
     * 第三，从业务含义上来讲，Document 网页文档没必要依赖 HtmlDownloader 类，违背了迪米特法则。
     */
}
