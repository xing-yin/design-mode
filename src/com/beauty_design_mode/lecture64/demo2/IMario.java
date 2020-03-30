package com.beauty_design_mode.lecture64.demo2;

import com.beauty_design_mode.lecture64.demo1.State;

/**
 * 对 demo1-impl3 的代码优化
 * <p>
 * 我们可以通过函数参数将 MarioStateMachine 传递进状态类。
 * 根据这个设计思路，我们对上面的代码进行重构
 *
 * @author Alan Yin
 * @date 2020/3/30
 */

public interface IMario {

    void obtainMushRoom(MarioStateMachine marioStateMachine);

    void obtainCape(MarioStateMachine marioStateMachine);

    void obtainFireFlower(MarioStateMachine marioStateMachine);

    void meetMonster(MarioStateMachine marioStateMachine);

    State getName();
}
