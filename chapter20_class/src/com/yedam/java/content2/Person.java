package com.yedam.java.content2;

public class Person {
	// 필드
	String name;
	float height;
	float weight;

	// 기본 생성자
	Person() {
		this.name = "홍길동";
	}

	Person(String name) {
		this.name = name;
	}

	// 키만 값을 받아오는 생성자
	// 몸무게만 값을 받아오는 생성자
	// 타입이 같으면 불가능

	// 키, 몸무게 값을 받아오는 생성자
	// 이름, 키, 몸무게 모두 값을 받아오는 생성자
	// 이름이 무조건 유명수
	Person(float height, float weight) {
		this.height = height;
		this.weight = weight;
	}

	Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
}
