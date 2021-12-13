package com.yedam.java.test01;

//[문제1] 다음의 조건을 만족하는 Person 클래스를 선언하세요.(20점)
// - 필드로 주민등록번호(ssn), 이름(name), 주소(address)를 가진다.
// - 두 개의 생성자를 가지며 각각의 정의는 다음과 같다. 
// 1) 기본 생성자로, 필드를 초기화 하지 않는다. 
// 2) 주민등록번호, 이름, 주소를 매개변수로 받아 필드를 초기화한다. 
// - 각 필드의 getter, setter를 가진다.

public class Person {
	String ssn;
	String name;
	String address;

	Person() {

	}

	Person(String ssn, String name, String address) {
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
