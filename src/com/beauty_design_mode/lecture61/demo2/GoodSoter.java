package com.beauty_design_mode.lecture61.demo2;

import java.io.File;

/**
 * Sorter 类中的 sortFile() 函数还是有一堆 if-else 逻辑。这里的 if-else 逻辑分支不多、也不复杂，这样写完全没问题。
 *
 * @author Alan Yin
 * @date 2020/3/24
 */

/**
 * 但如果你特别想将 if-else 分支判断移除掉，那也是有办法的。见 GoodSoter2
 * 实际上，这也是基于查表法来解决的，其中的“algs”就是“表”。
 */
public class GoodSoter {

    private static final long GB = 1000 * 1000 * 1000;

    public void sortFile(String filePath) {
        // 省略校验逻辑
        File file = new File(filePath);
        long fileSize = file.length();
        ISortAlg sortAlg = null;
        if (fileSize < 6 * GB) {
            sortAlg = new QuickSort();
        } else if (fileSize < 10 * GB) {
            sortAlg = new ExternalSort();
        } else if (fileSize < 100 * GB) {
            sortAlg = new ConcurrentExternalSort();
        } else {
            sortAlg = new MapReduceSort();
        }
        sortAlg.sort(filePath);
    }
}
