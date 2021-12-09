package com.yedam.java.content;

// 1)
// 나이가 40살, 이름이 James라는 남자가 있다.
// 이 남자는 결혼을 했고, 자식이 셋 있다.
// 
// 출력결과
// 이 사람의 나이
// 이 사람의 이름
// 이 사람의 결혼 여부
// 이 사람의 자녀수

public class Quiz {
	public static void main(String[] args) {
		Human human = new Human();
		human.setAge(40);
		human.setName("James");
		human.setMarried(true);
		human.setChildren(3);

		// human.age = 40;
		// human.name = "James";
		// human.married = true;
		// human.children = 3;

		System.out.println("이 사람의 나이 : " + human.getAge());
		System.out.println("이 사람의 이름 : " + human.getName());
		System.out.println("이 사람의 결혼 여부 : " + human.isMarried());
		System.out.println("이 사람의 자녀 수 : " + human.getChildren());
	}
}
