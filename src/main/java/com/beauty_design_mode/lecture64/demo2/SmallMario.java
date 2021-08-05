package com.beauty_design_mode.lecture64.demo2;

import com.beauty_design_mode.lecture64.demo1.State;

/**
 * @author Alan Yin
 * @date 2020/3/30
 */

public class SmallMario implements IMario {

    private static final SmallMario instance = new SmallMario();

    private SmallMario() {
    }

    public static SmallMario getInstance() {
        return instance;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine marioStateMachine) {
        marioStateMachine.setCurrentState(SuperMario.getInstance());
        marioStateMachine.setScore(marioStateMachine.getScore() + 100);
    }

    @Override
    public void obtainCape(MarioStateMachine marioStateMachine) {
        // ...
    }

    @Override
    public void obtainFireFlower(MarioStateMachine marioStateMachine) {
        // ...
    }

    @Override
    public void meetMonster(MarioStateMachine marioStateMachine) {
        // ...
    }

    @Override
    public State getName() {
        return State.SMALL;
    }
}
