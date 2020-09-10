package com.beauty_design_mode.lecture53.demo1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件系统节点: 适合简单场景，不适合大型系统
 *
 * @author Alan Yin
 * @date 2020/8/28
 */

public class BadFileSystemNode {

    private String path;

    private boolean isFile;

    private List<BadFileSystemNode> subNodes = new ArrayList<>();

    public BadFileSystemNode(String path, boolean isFile) {
        this.path = path;
        this.isFile = isFile;
    }

    public int countNumOfFiles() {
        if (isFile) {
            return 1;
        }
        int numOfFiles = 0;
        for (BadFileSystemNode node : subNodes) {
            numOfFiles += node.countNumOfFiles();
        }
        return numOfFiles;
    }

    public long countSizeOfFiles() {
        if (isFile) {
            File file = new File(path);
            if (!file.exists()) {
                return 0;
            }
            return file.length();
        }
        long sizeOfFiles = 0;
        for (BadFileSystemNode node : subNodes) {
            sizeOfFiles += node.countSizeOfFiles();
        }
        return sizeOfFiles;
    }

    public String getPath() {
        return path;
    }

    public void addSubNode(BadFileSystemNode fileOrDir) {
        subNodes.add(fileOrDir);
    }

    public void removeSubNode(BadFileSystemNode fileOrDir) {
        int size = subNodes.size();
        int i = 0;
        for (; i < size; ++i) {
            if (subNodes.get(i).getPath().equalsIgnoreCase(fileOrDir.getPath())) {
                break;
            }
        }
        if (i < size) {
            subNodes.remove(i);
        }
    }
}
