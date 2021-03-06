package com.yedam.java.ch02.set;

public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return super.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return (member.name.equals(this.name) && (member.age == this.age));
		} else {
			return false;
		}

	}

}
