package com.csnote.Builder.src;

import java.util.Arrays;

public class AbstractStringBuilder {

    protected char[] value;

    protected int count;

    public AbstractStringBuilder(int capacity) {
        count = 0;
        value = new char[capacity];
    }


    public AbstractStringBuilder append(char c) {
        // 追加前先判断容量是否超出数组大小
        ensureCapacityInternal(count + 1);
        value[count++] = c;
        return this;
    }

    /**
     * 确保内部容量
     *
     * @param minimumCapacity
     */
    private void ensureCapacityInternal(int minimumCapacity) {
        // overflow-conscious code
        if (minimumCapacity - value.length > 0)
            expandCapacity(minimumCapacity);
    }

    /**
     * 扩展容量
     *
     * @param minimumCapacity
     */
    void expandCapacity(int minimumCapacity) {

        int newCapacity = value.length * 2 + 2;

        // 如果扩容 2 倍再加 2 依然不够，直接扩容到 minimumCapacity
        if (newCapacity - minimumCapacity < 0) {
            newCapacity = minimumCapacity;
        }

        // newCapacity < 0 说明已经溢出了
        if (newCapacity < 0) {
            // overflow
            if (minimumCapacity < 0) {
                throw new OutOfMemoryError();
            }
            newCapacity = Integer.MAX_VALUE;
        }

        value = Arrays.copyOf(value, newCapacity);
    }
}
