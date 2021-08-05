package com.beauty_design_mode.lecture64.demo1.impl3;

import com.beauty_design_mode.lecture64.demo1.State;

/**
 * @author Alan Yin
 * @date 2020/3/30
 */

public class MarioStateMachine {

    private int score;

    private IMario currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = new SmallMario(this);
    }

    public void obtainMushRoom() {
        currentState.obtainMushRoom();
    }

    public void obtainCape() {
        currentState.obtainCape();
    }

    public void obtainFireFlower() {
        currentState.obtainFireFlower();
    }

    public void meetMonster() {
        currentState.meetMonster();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setCurrentState(IMario currentState) {
        this.currentState = currentState;
    }
}
