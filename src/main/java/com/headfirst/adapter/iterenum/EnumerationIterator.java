package com.headfirst.adapter.iterenum;

import java.util.*;

public class EnumerationIterator implements Iterator<Object> {
	Enumeration<?> enumeration;

	public EnumerationIterator(Enumeration<?> enumeration) {
		this.enumeration = enumeration;
	}

	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	public Object next() {
		return enumeration.nextElement();
	}

	/**
	 * 枚举不能支持迭代器的remove()方法，这里处理是抛出异常
	 */
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
