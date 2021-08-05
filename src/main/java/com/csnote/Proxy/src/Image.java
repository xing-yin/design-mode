package com.csnote.Proxy.src;

/**
 * 以下是一个虚拟代理的实现，模拟了图片延迟加载的情况下使用与图片大小相等的临时内容去替换原始图片，直到图片加载完成才将图片显示出来
 */
public interface Image {
    void showImage();
}