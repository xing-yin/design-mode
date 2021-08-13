package com.beauty_design_mode.lecture19.demo1.ioc;

import com.beauty_design_mode.lecture18.demo1.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * 控制反转演示
 *
 * @author Alan Yin
 * @date 2021/8/13
 */

public class JunitApplication {

    private static final List<TestCase> TEST_CASES = new ArrayList<>();

    public static void register(TestCase testCase) {
        TEST_CASES.add(testCase);
    }

    public static void main(String[] args) {
        // 注册操作可以通过配置的方式来实现，不需要程序员显示调用register()
        JunitApplication.register(new UserServiceTest());
        for (TestCase testCase : TEST_CASES) {
            testCase.doTest();
        }
    }

}
