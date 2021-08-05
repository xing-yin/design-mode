package com.beauty_design_mode.lecture61.demo2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Alan Yin
 * @date 2020/3/24
 */

/**
 * 当我们添加新的排序算法的时候，还是需要修改代码，并不完全符合开闭原则。有什么办法让我们完全满足开闭原则呢？
 * <p>
 * 对于 Java 语言来说，我们可以通过反射来避免对策略工厂类的修改。
 * 具体是这么做的：我们通过一个配置文件或者自定义的 annotation 来标注都有哪些策略类；
 * 策略工厂类读取配置文件或者搜索被 annotation 标注的策略类，然后通过反射了动态地加载这些策略类、创建策略对象；
 * 当我们新添加一个策略的时候，只需要将这个新添加的策略类添加到配置文件或者用 annotation 标注即可。
 */
public class GoodSoter2 {

    private static final long GB = 1000 * 1000 * 1000;

    private static final List<AlgRange> ALG_RANGES = new ArrayList<>();

    static {
        ALG_RANGES.add(new AlgRange(0, 6 * GB, SortAlgFacrory.getSortAlg("QuickSort")));
        ALG_RANGES.add(new AlgRange(6 * GB, 10 * GB, SortAlgFacrory.getSortAlg("ExternalSort")));
        ALG_RANGES.add(new AlgRange(10 * GB, 100 * GB, SortAlgFacrory.getSortAlg("ConcurrentExternalSort")));
        ALG_RANGES.add(new AlgRange(100 * GB, Long.MAX_VALUE, SortAlgFacrory.getSortAlg("MapReduceSort")));
    }

    public void sortFile(String filePath) {
        // 省略校验逻辑
        File file = new File(filePath);
        long fileSize = file.length();
        ISortAlg sortAlg = null;
        for (AlgRange algRange : ALG_RANGES) {
            if (algRange.inRange(fileSize)) {
                sortAlg = algRange.getiSortAlg();
                break;
            }
        }
        sortAlg.sort(filePath);
    }

    private static class AlgRange {
        private long start;
        private long end;
        private ISortAlg iSortAlg;

        public AlgRange(long start, long end, ISortAlg iSortAlg) {
            this.start = start;
            this.end = end;
            this.iSortAlg = iSortAlg;
        }

        public ISortAlg getiSortAlg() {
            return iSortAlg;
        }

        public boolean inRange(long size) {
            return size >= start && size < end;
        }

    }
}
