package com.beauty_design_mode.lecture64.demo1.impl3;

import com.beauty_design_mode.lecture64.demo1.State;

/**
 * @author Alan Yin
 * @date 2020/3/30
 */

public class FireMario implements IMario {

    private MarioStateMachine stateMachine;

    public FireMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void obtainMushRoom() {
        stateMachine.setCurrentState(new SuperMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 100);
    }

    @Override
    public void obtainCape() {
        stateMachine.setCurrentState(new CapeMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 200);
    }

    @Override
    public void obtainFireFlower() {
       //...
    }

    @Override
    public void meetMonster() {
       //...
    }

    @Override
    public State getName() {
        return State.SMALL;
    }
}
