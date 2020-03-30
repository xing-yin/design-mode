package com.beauty_design_mode.lecture64.demo1.impl2;

import com.beauty_design_mode.lecture64.demo1.State;

import static com.beauty_design_mode.lecture64.demo1.State.*;

/**
 * 实现2:查表法
 *
 * @author Alan Yin
 * @date 2020/3/30
 */

public class MarioStateMachine {

    private int score;

    private State currentState;

    private static final State[][] transitionTable = {
            {SUPER, CAPE, FIRE, SMALL},
            {SUPER, CAPE, FIRE, SMALL},
            {CAPE, CAPE, CAPE, SMALL},
            {FIRE, FIRE, FIRE, SMALL}
    };

    private static final int[][] actionTable = {
            {+100, +200, +300, +0},
            {+0, +200, +300, -100},
            {+0, +0, +0, -200},
            {+0, +0, +0, -300}
    };

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = State.SMALL;
    }

    public void obtainMushRoom() {
        executeEvent(Event.GOT_MUSHROOM);
    }

    public void obtainCape() {
        executeEvent(Event.GOT_CAPE);
    }

    public void obtainFireFlower() {
        executeEvent(Event.GOT_FIRE);
    }

    public void meetMonster() {
        executeEvent(Event.MEET_MONSTER);
    }

    private void executeEvent(Event event) {
        int stateEvent = currentState.getValue();
        int eventValue = event.getValue();
        this.currentState = transitionTable[stateEvent][eventValue];
        this.score = actionTable[stateEvent][eventValue];
    }

    public int getScore() {
        return score;
    }

    public State getCurrentState() {
        return currentState;
    }
}
