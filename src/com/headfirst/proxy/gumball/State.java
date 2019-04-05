package com.headfirst.proxy.gumball;

import java.io.*;

/**
 * 方便网络传输，必须可序列化
 */
public interface State extends Serializable {
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
