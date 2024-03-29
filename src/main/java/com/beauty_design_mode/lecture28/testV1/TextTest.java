package com.beauty_design_mode.lecture28.testV1;

import com.beauty_design_mode.lecture28.Text;

/**
 * 利用自定义 Assert 测试
 *
 * @author Alan Yin
 * @date 2021/8/27
 */

public class TextTest {

    public void testToNumber() {
        Text text = new Text("123");
        Assert.assertEquals(123, text.toNumber());
    }

    public void testToNumber_nullorEmpty() {
        Text text1 = new Text(null);
        Assert.assertNull(text1.toNumber());

        Text text2 = new Text("");
        Assert.assertNull(text2.toNumber());
    }

    public void testToNumber_containsLeadingAndTrailingSpaces() {
        Text text1 = new Text(" 123");
        Assert.assertEquals(123, text1.toNumber());

        Text text2 = new Text("123 ");
        Assert.assertEquals(123, text2.toNumber());

        Text text3 = new Text(" 123 ");
        Assert.assertEquals(123, text3.toNumber());
    }

    public void testToNumber_containsMultiLeadingAndTrailingSpaces() {
        Text text1 = new Text("  123");
        Assert.assertEquals(123, text1.toNumber());

        Text text2 = new Text("123  ");
        Assert.assertEquals(123, text2.toNumber());

        Text text3 = new Text("  123  ");
        Assert.assertEquals(123, text3.toNumber());
    }

    public void testToNumber_containsInvalidCharaters() {
        Text text1 = new Text("123a4");
        Assert.assertNull(text1.toNumber());

        Text text2 = new Text("123 4");
        Assert.assertNull(text2.toNumber());
    }
}
