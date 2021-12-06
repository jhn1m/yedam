package com.yedam.java.ch01.object;

public class Key {
	private int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key key = (Key) obj;
			if (number == key.number) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return number;
	}

}
