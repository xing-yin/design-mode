package com.beauty_design_mode.lecture19.demo1.ioc;

/**
 * 第三方利用框架的扩展点扩展实现（这就实现了控制反转）
 *
 * @author Alan Yin
 * @date 2021/8/13
 */

public class UserServiceTest extends TestCase {

    @Override
    public boolean doTest() {
        System.out.println("第三方自己扩展的实现");
        return false;
    }
}
