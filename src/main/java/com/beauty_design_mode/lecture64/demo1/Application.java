package com.beauty_design_mode.lecture64.demo1;

import com.beauty_design_mode.lecture64.demo1.impl2.MarioStateMachine;

/**
 * @author Alan Yin
 * @date 2020/3/30
 */

public class Application {

    public static void main(String[] args) {
        MarioStateMachine stateMachine = new MarioStateMachine();
        stateMachine.obtainMushRoom();
        int score = stateMachine.getScore();
        State state = stateMachine.getCurrentState();
        System.out.println("mario score is:" + score + ";state is:" + state);
    }
}
