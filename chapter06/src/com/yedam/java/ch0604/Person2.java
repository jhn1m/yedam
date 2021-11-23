package com.yedam.java.ch0604;

public class Person2 {
	// 문제1) 나이가 40살, 이름이 james라는 남자가 있습니다.
	// 이 남자는 결혼을 했고, 자식이 셋 있습니다.
	// <<출력결과>>
	// 이 사람의 나이
	// 이 사람의 이름
	// 이 사람의 결혼 여부
	// 이 사람의 자녀 수
	// 교수님 풀이

	// 필드
	String name;
	int age;
	String gender;
	boolean isMarried;
	int children;

	public Person2(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// 메서드

	public void isMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public int getChildren() {
		return children;
	}

}
