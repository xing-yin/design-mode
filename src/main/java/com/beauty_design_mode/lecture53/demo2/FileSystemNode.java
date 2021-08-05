package com.beauty_design_mode.lecture53.demo2;

/**
 * @author Alan Yin
 * @date 2020/8/28
 */

public abstract class FileSystemNode {

    protected String path;

    public FileSystemNode(String path) {
        this.path = path;
    }

    public abstract int countNumOfFiles();

    public abstract long countSizeOfFiles();

    public String getPath() {
        return path;
    }
}
