package com.beauty_design_mode.lecture28.testV1;

/**
 * 自定义断言类
 *
 * @author Alan Yin
 * @date 2021/8/27
 */

public class Assert {

    public static void assertEquals(Integer expectedValue, Integer actualValue) {
        if (!actualValue.equals(expectedValue)) {
            String message = String.format(
                    "Test failed,expected: %d,actual:%d.", expectedValue, actualValue);
            System.out.println(message);
        } else {
            System.out.println("Test succeeded.");
        }
    }

    public static boolean assertNull(Integer actualValue) {
        boolean isNull = actualValue == null;
        if (isNull) {
            System.out.println("Test succeeded.");
        } else {
            System.out.println("Test failed, the value is not null:" + actualValue);
        }
        return isNull;
    }

}
