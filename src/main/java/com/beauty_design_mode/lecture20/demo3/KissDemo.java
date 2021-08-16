package com.beauty_design_mode.lecture20.demo3;

/**
 * KMP 字符串匹配算法的代码实现
 * <p>
 * 而 KMP 算法本身具有逻辑复杂、实现难度大、可读性差的特点。本身就是复杂的问题，用复杂的方法解决，并不违背 KISS 原则
 *
 * @author Alan Yin
 * @date 2021/8/16
 */

public class KissDemo {

    // KMP algorithm: a, b分别是主串和模式串；n, m分别是主串和模式串的长度。
    public static int kmp(char[] a, int n, char[] b, int m) {
        int[] next = getNexts(b, m);
        int j = 0;
        for (int i = 0; i < n; ++i) {
            while (j > 0 && a[i] != b[j]) { // 一直找到a[i]和b[j]
                j = next[j - 1] + 1;
            }
            if (a[i] == b[j]) {
                ++j;
            }
            if (j == m) { // 找到匹配模式串的了
                return i - m + 1;
            }
        }
        return -1;
    }

    // b表示模式串，m表示模式串的长度
    private static int[] getNexts(char[] b, int m) {
        int[] next = new int[m];
        next[0] = -1;
        int k = -1;
        for (int i = 1; i < m; ++i) {
            while (k != -1 && b[k + 1] != b[i]) {
                k = next[k];
            }
            if (b[k + 1] == b[i]) {
                ++k;
            }
            next[i] = k;
        }
        return next;
    }
}
