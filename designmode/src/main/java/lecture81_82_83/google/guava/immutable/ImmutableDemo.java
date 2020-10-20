package lecture81_82_83.google.guava.immutable;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * jdk vs Guava 的 Immutable 对象
 *
 * @author Alan Yin
 * @date 2020/10/20
 */

public class ImmutableDemo {

    public static void main(String[] args) {
        List<String> originalList = new ArrayList<String>();
        originalList.add("a");
        originalList.add("b");
        originalList.add("c");

        List<String> jdkUnmodifiableList = Collections.unmodifiableList(originalList);
        List<String> guavaImmutableList = ImmutableList.copyOf(originalList);

        // jdkUnmodifiableList.add("d"); // 抛出 UnsupportedOperationException
        // guavaImmutableList.add("d"); // 抛出 UnsupportedOperationException

        originalList.add("d");
        print(originalList);         // a b c d
        print(jdkUnmodifiableList); // a b c d  =====>jdk 的不可变在后续原始数据变化时还会变化(普通不变模式)
        print(guavaImmutableList);  // a b c    =====>guava 的不可变在后续原始数据变化时不会变化(深度不变模式)
    }

    private static void print(List<String> list) {
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
