package com.beauty_design_mode.lecture61.demo1;

import java.io.File;

/**
 * 反例演示:(代码优化见 demo2)
 * 1.为了避免 sortFile() 函数过长，我们把每种排序算法从 sortFile() 函数中抽离出来，拆分成 4 个独立的排序函数。
 * 2.所有排序算法的代码实现都堆在 Sorter 一个类中，这就会导致这个类的代码很多
 * 3.所有的排序算法都设计成 Sorter 的私有函数，也会影响代码的可复用性。
 *
 * @author Alan Yin
 * @date 2020/3/24
 */

public class BadSorter {

    private static final long GB = 1000 * 1000 * 1000;

    public void sortFile(String filePath) {
        // 省略校验逻辑
        File file = new File(filePath);
        long fileSize = file.length();
        if (fileSize < 6 * GB) {
            quickSort(filePath);
        } else if (fileSize < 10 * GB) {
            externalSort(filePath);
        } else if (fileSize < 100 * GB) {
            concurrentExternalSort(filePath);
        } else {
            mapreduceSort(filePath);
        }
    }

    private void mapreduceSort(String filePath) {
        // 利用MapReduce多机排序
    }

    private void concurrentExternalSort(String filePath) {
        // 多线程外部排序
    }

    private void externalSort(String filePath) {
        // 外部排序
    }

    private void quickSort(String filePath) {
        // 快速排序
    }


}
