package com.beauty_design_mode.lecture76.demo3;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * 装饰器模式在 Collections 类中的应用
 *
 * @author Alan Yin
 * @date 2020/9/10
 */

public class MyUmodifiableCollection<E> implements Collection<E>, Serializable {

    final Collection<? extends E> c;

    public MyUmodifiableCollection(Collection<? extends E> c) {
        if (c == null) {
            throw new NullPointerException();
        }
        this.c = c;
    }

    @Override
    public int size() {
        return c.size();
    }

    @Override
    public boolean isEmpty() {
        return c.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return c.contains(o);
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private final Iterator<? extends E> i = c.iterator();

            @Override
            public boolean hasNext() {
                return i.hasNext();
            }

            @Override
            public Object next() {
                return i.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override
            public void forEachRemaining(Consumer action) {
                i.forEachRemaining(action);
            }
        };
    }

    @Override
    public Object[] toArray() {
        return c.toArray();
    }

    @Override
    public Object[] toArray(Object[] a) {
        return c.toArray(a);
    }

    @Override
    public boolean add(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection c) {
        return c.containsAll(c);
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }
}
