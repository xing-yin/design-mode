package com.beauty_design_mode.lecture58.demo3;

/**
 * @author Alan Yin
 * @date 2020/3/23
 */

public class AbstractList {

    /**
     * 在 Java AbstractList 类中，addAll() 函数可以看作模板方法，add() 是子类需要重写的方法，
     * 尽管没有声明为 abstract 的，但函数实现直接抛出了 UnsupportedOperationException 异常。
     * 前提是，如果子类不重写是不能使用的。
     */

    /**
     *
     public boolean addAll(int index, Collection<? extends E> c) {
         rangeCheckForAdd(index);
         boolean modified = false;
         for (E e : c) {
         add(index++, e);
         modified = true;
         }
         return modified;
     }

     public void add(int index, E element) {
        throw new UnsupportedOperationException();
     }
     */
}
