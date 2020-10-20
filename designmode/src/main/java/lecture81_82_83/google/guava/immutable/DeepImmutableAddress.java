package lecture81_82_83.google.guava.immutable;

/**
 * @author Alan Yin
 * @date 2020/10/20
 */

public class DeepImmutableAddress {

    private String province;

    private String city;

    public DeepImmutableAddress(String province, String city) {
        this.province = province;
        this.city = city;
    }

    /**
     * 只有 getter 方法，没有 setter 方法
     */
    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }
}
