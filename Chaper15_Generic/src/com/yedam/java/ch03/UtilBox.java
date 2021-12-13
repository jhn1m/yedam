package com.yedam.java.ch03;

import com.yedam.java.ch02.Box;

public class UtilBox {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}