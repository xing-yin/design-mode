package com.headfirst.command.undo;

/**
 * 让所有的命令对象实现命令接口
 */
public interface Command {

    public void execute();

    public void undo();
}
