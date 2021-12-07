package com.yedam.java.ch07.arrays;

public class Member implements Comparable<Member> {
	String name;

	Member(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
		// 관례
		// 오름차순 > 자신이 매개값보다 낮을경우 음수, 같을 경우 0, 높을경우 양수
		// 내림차순 > 자신이 매개값보다 낮을경우 양수, 같을 경우 0, 높을경우 음수
		return 0;
	}
}
