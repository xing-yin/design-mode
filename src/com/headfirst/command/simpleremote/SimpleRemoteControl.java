package com.headfirst.command.simpleremote;

//
// This is the invoker
//
public class SimpleRemoteControl {
	/**
	 * 有一个插槽持有命令，控制着一个装置
	 */
	Command slot;

	public SimpleRemoteControl() {}

	public void setCommand(Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}
}
