package com.beauty_design_mode.lecture64.demo1.impl3;

import com.beauty_design_mode.lecture64.demo1.State;

/**
 * @author Alan Yin
 * @date 2020/3/30
 */

public class SuperMario implements IMario {

    private MarioStateMachine stateMachine;

    public SuperMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void obtainMushRoom() {
        // do nothing
    }

    @Override
    public void obtainCape() {
        stateMachine.setCurrentState(new CapeMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 200);
    }

    @Override
    public void obtainFireFlower() {
        stateMachine.setCurrentState(new FireMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 300);
    }

    @Override
    public void meetMonster() {
        stateMachine.setCurrentState(new SmallMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() - 100);
    }

    @Override
    public State getName() {
        return State.SUPER;
    }
}
