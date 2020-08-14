package com.beauty_design_mode.lecture51.application_scenarios.demo4;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;

/**
 * 适用场景4: 兼容老版本接口
 * <p>
 * 在做版本升级的时候，对于一些要废弃的接口，我们不直接将其删除，而是暂时保留，并且标注为 deprecated，
 * 并将内部实现逻辑委托为新的接口实现。这样做的好处是，让使用它的项目有个过渡期，而不是强制进行代码修改。
 *
 * @author Alan Yin
 * @date 2020/8/14
 */

public class Collections {

//    public static Emueration emumeration(final Collection c) {
//        return new Enumeration() {
//            Iterator i = c.iterator();
//
//            public boolean hasMoreElments() {
//                return i.hashNext();
//            }
//
//            public Object nextElement() {
//                return i.next():
//            }
//        }
//    }
}
