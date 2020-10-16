package com.beauty_design_mode.lecture37.v5.exception;

/**
 * 自定义运行时异常
 *
 * @author Alan Yin
 * @date 2020/10/16
 */

public class IdGenerationFailureException extends RuntimeException {

    public IdGenerationFailureException() {
    }

    public IdGenerationFailureException(String message) {
        super(message);
    }
}
