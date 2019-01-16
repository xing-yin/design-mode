package com.runoob.iteratorPattern.step3;

/**
 * Created by yinxing on 2018/8/28.
 */

import com.runoob.iteratorPattern.step1.Iterator;
import com.runoob.iteratorPattern.step2.NameRepository;

/**
 * 步骤 3
 * 使用 NameRepository 来获取迭代器，并打印名字。
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println("Name:" + name);
        }
    }
}
