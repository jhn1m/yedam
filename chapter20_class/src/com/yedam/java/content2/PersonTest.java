package com.yedam.java.content2;

public class PersonTest {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person("안안오");
		Person person3 = new Person("이이이김", 170, 60);
		
		System.out.println(person1.name);
		System.out.println(person2.name);
		System.out.println(person3.name);
	}
}
