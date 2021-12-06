package com.yedam.java.ch01.object;

import java.util.Date;
import java.util.HashMap;

public class MainExample {
	public static void main(String[] args) {
		// 객체 동등 비교

		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}

		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		}

		System.out.println();

		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		hashMap.put(new Key(1), "홍길동");

		String value = hashMap.get(new Key(1));
		System.out.println(value);

		Object obj4 = new Object();
		System.out.println(obj4.toString());

		Date obj5 = new Date();
		System.out.println(obj5);

		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		String strObj = myPhone.toString();
		System.out.println(strObj);

		System.out.println();

		Member original = new Member("blue", "홍길동", "12345", 25, true);
		Member cloned = original.getMember();
		cloned.password = "67890";

		System.out.println("===복제 객체의 필드 값===");
		System.out.println("id : " + cloned.id);
		System.out.println("name : " + cloned.name);
		System.out.println("password : " + cloned.password);
		System.out.println("age : " + cloned.age);
		System.out.println("adult : " + cloned.adult);
		System.out.println();

		System.out.println("===원본 객체의 필드 값===");
		System.out.println("id : " + original.id);
		System.out.println("name : " + original.name);
		System.out.println("password : " + original.password);
		System.out.println("age : " + original.age);
		System.out.println("adult : " + original.adult);
		System.out.println();

		Person originalPerson = new Person("홍길동", 25, new int[] { 90, 90 }, new Car("소나타"));
		Person clonedPerson = originalPerson.getPerson();
		clonedPerson.car.model = "그랜져";
		System.out.println("===복제 객체의 필드 값===");
		System.out.println("name : " + clonedPerson.name);
		System.out.println("age : " + clonedPerson.age);
		System.out.println("score : " + clonedPerson.scores[0] + ", " + clonedPerson.scores[1]);
		System.out.println("car : " + clonedPerson.car.model);
		System.out.println();

		System.out.println("===원본 객체의 필드 값===");
		System.out.println("name : " + originalPerson.name);
		System.out.println("age : " + originalPerson.age);
		System.out.println("score : " + originalPerson.scores[0] + ", " + originalPerson.scores[1]);
		System.out.println("car : " + originalPerson.car.model);
		System.out.println();
		
	}
}
