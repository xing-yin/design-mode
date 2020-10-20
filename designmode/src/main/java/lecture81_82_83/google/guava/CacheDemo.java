package lecture81_82_83.google.guava;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.TimeUnit;

/**
 * Guava 的 Builder 模式
 *
 * @author Alan Yin
 * @date 2020/10/20
 */

public class CacheDemo {

    public static void main(String[] args) {
        Cache<String, String> cache = CacheBuilder.newBuilder()
                .initialCapacity(100)
                .maximumSize(1000)
                .expireAfterWrite(10, TimeUnit.MINUTES)
                .build();

        cache.put("key1", "value1");
        String value = cache.getIfPresent("key1");
        System.out.println(value);
    }
}
