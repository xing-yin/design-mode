package lecture81_82_83.google.guava.immutable;

/**
 * 深度不变模式：对象中包含的引用对象也不可以改变
 *
 * @author Alan Yin
 * @date 2020/10/20
 */

public class DeepImmutableUser {

    private String name;

    private int age;

    private NormalImmutableAddress address;

    public DeepImmutableUser(String name, int age, NormalImmutableAddress address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 只有 getter 方法，没有 setter 方法
     */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public NormalImmutableAddress getAddress() {
        return address;
    }
}
