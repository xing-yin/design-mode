package com.beauty_design_mode.lecture64.demo1.impl1;

import com.beauty_design_mode.lecture64.demo1.State;

/**
 * 实现1:分支逻辑法
 * <p>
 * 对于简单的状态机来说，分支逻辑这种实现方式是可以接受的。
 * 但是，对于复杂的状态机来说，这种实现方式极易漏写或者错写某个状态转移。
 *
 * @author Alan Yin
 * @date 2020/3/30
 */

/**
 * 最简单直接的实现方式是，参照状态转移图，将每一个状态转移，原模原样地直译成代码。
 * 这样编写的代码会包含大量的 if-else 或 switch-case 分支判断逻辑，甚至是嵌套的分支判断逻辑，
 * 所以，我把这种方法暂且命名为分支逻辑法。
 */
public class MarioStateMachine {

    private int score;

    private State currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = State.SMALL;
    }

    public void obtainMushRoom() {
        if (currentState.equals(State.SMALL)) {
            this.currentState = State.SUPER;
            score += 100;
        }
    }

    public void obtainCape() {
        if (currentState.equals(State.SMALL) || currentState.equals(State.SUPER)) {
            this.currentState = State.CAPE;
            score += 200;
        }
    }

    public void obtainFireFlower() {
        if (currentState.equals(State.SMALL) || currentState.equals(State.SUPER)) {
            this.currentState = State.FIRE;
            score += 300;
        }
    }

    public void meetMonster() {
        if (currentState.equals(State.SUPER)) {
            this.currentState = State.SMALL;
            score -= 100;
            return;
        }

        if (currentState.equals(State.CAPE)) {
            this.currentState = State.SMALL;
            score -= 200;
            return;
        }

        if (currentState.equals(State.FIRE)) {
            this.currentState = State.SMALL;
            score -= 300;
            return;
        }
    }

    public int getScore() {
        return score;
    }

    public State getCurrentState() {
        return currentState;
    }
}
