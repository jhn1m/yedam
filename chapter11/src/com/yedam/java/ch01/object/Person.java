package com.yedam.java.ch01.object;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Person implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;

	public Person(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	public Person getPerson() {
		Person cloned = null;
		try {
			cloned = (Person) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 얕은 복제
		Person cloned = (Person) super.clone();
		// 각 참조 타입별로 복제
//		System.arraycopy(this.scores, 0, cloned.scores, 0, this.scores.length);
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
		return cloned;
	}
}
