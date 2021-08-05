package com.runoob.iterator_pattern.step2;

/**
 * Created by yinxing on 2018/8/28.
 */

import com.runoob.iteratorPattern.step1.Container;
import com.runoob.iteratorPattern.step1.Iterator;

/**
 * 步骤 2
 * 创建实现了 Container 接口的实体类。该类有实现了 Iterator 接口的内部类 NameIterator。
 */
public class NameRepository implements Container {

    public String names[] = {"a", "b", "c", "d"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }

}
