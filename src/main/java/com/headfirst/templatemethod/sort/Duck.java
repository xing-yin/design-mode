package com.headfirst.templatemethod.sort;

public class Duck implements Comparable<Duck> {
	String name;
	int weight;

	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String toString() {
		return name + " weighs " + weight;
	}

	/**
	 * 关键:实现 compareTo() 方法
	 * @param object
	 * @return
	 */
	public int compareTo(Duck object) {

		Duck otherDuck = object;

		if (this.weight < otherDuck.weight) {
			return -1;
		} else if (this.weight == otherDuck.weight) {
			return 0;
		} else { // this.weight > otherDuck.weight
			return 1;
		}
	}
}
