package com.beauty_design_mode.lecture61.demo1;

/**
 * @author Alan Yin
 * @date 2020/3/24
 */

public class SortingTool {

    public static void main(String[] args) {
        BadSorter sorter = new BadSorter();
        sorter.sortFile(args[0]);
    }
}
