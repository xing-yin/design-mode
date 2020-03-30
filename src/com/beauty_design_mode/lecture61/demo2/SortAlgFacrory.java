package com.beauty_design_mode.lecture61.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alan Yin
 * @date 2020/3/24
 */

public class SortAlgFacrory {

    private static final Map<String, ISortAlg> sortAlgs = new HashMap<>();

    static {
        sortAlgs.put("QuickSort", new QuickSort());
        sortAlgs.put("ExternalSort", new ExternalSort());
        sortAlgs.put("ConcurrentExternalSort", new ConcurrentExternalSort());
        sortAlgs.put("MapReduceSort", new MapReduceSort());
    }

    public static ISortAlg getSortAlg(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type can not be null");
        }
        return sortAlgs.get(type);
    }
}
