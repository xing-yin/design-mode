package com.headfirst.command.undo;

public class CeilingFanHighCommand implements Command {
	CeilingFan ceilingFan;
	/**
	 * 局部变量追踪之前的速度
	 */
	int prevSpeed;

	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	public void execute() {
		// 在改变吊扇的速度之前，先记录之前的状态
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}

	/**
	 * 将吊扇的速度设置为之前的值
	 */
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		} else if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		} else if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}
}
