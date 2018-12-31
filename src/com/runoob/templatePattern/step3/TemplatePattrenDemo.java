package com.runoob.templatePattern.step3;

/**
 * Created by yinxing on 2018/8/24.
 */

import com.runoob.templatePattern.step1.Game;
import com.runoob.templatePattern.step2.Cricket;
import com.runoob.templatePattern.step2.Football;

/**
 * 步骤 3
 * 使用 Game 的模板方法 play() 来演示游戏的定义方式。
 */
public class TemplatePattrenDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println("\n");
        game = new Football();
        game.play();
    }
}
