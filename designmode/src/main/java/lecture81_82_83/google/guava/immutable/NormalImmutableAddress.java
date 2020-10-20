package lecture81_82_83.google.guava.immutable;

/**
 * @author Alan Yin
 * @date 2020/10/20
 */

public class NormalImmutableAddress {

    private String province;

    private String city;

    public NormalImmutableAddress(String province, String city) {
        this.province = province;
        this.city = city;
    }

    /**
     * 有 getter 方法，也有 setter 方法
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
