package com.headfirst.command.remote;

//
// This is the invoker(调用者)
// 实现遥控器
//
public class RemoteControl {

    /**
     * 此时，遥控器处理7个开与关的命令，使用相应数组记录这些命令
     */
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        // 在构造器中，只需实例化并初始化着两个开与关的数组
        onCommands = new Command[7];
        offCommands = new Command[7];

        /**
         * NoCommand对象是一个空对象的例子
         * 有的时候空对象本身也被看作是一种设计模式
         */
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    /**
     * 这些命令记录在开关数组中对应的插槽位置，以稍后使用
     *
     * @param slot:       插槽的位置
     * @param onCommand:  开的命令
     * @param offCommand: 关的命令
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * 当按下开或关的按钮，硬件就会负责调用对应的方法
     *
     * @param slot
     */
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
