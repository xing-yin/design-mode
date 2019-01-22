package com.headfirst.singleton.subclass;

/**
 * 验证产生的实例是单例
 */
public class SingletonTestDrive {
	public static void main(String[] args) {
		Singleton foo = CoolerSingleton.getInstance();
		Singleton bar = HotterSingleton.getInstance();
		System.out.println(foo);
		System.out.println(bar);
 	}
}
