package com.yedam.java.ch02.objects;

import java.util.Objects;

public class MainExample {

	public static void main(String[] args) {
		// java.util.Objects

		Student s1 = new Student(1);
		Student s2 = new Student(2);
		Student s3 = new Student(3);

		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		result = Objects.compare(s3, s1, new StudentComparator());
		System.out.println(result);
		System.out.println();

		// 객체 동등 비교
		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println(o1 == o2);
		System.out.println(Objects.equals(o1, o2)); // 얕은복제 < 내부 값만 비교
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		System.out.println(Objects.deepEquals(o1, o2));

		System.out.println();

		Integer[] arr1 = { 1, 2 };
		Integer[] arr2 = { 1, 2 };
		System.out.println(arr1 == arr2);
		System.out.println(Objects.equals(arr1, arr2)); // 얕은복제 < 내부 값만 비교
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(null, null));

		System.out.println();

		Student s4 = new Student(1, "홍길동");
		Student s5 = new Student(1, "홍길동");
		System.out.println(s4 == s5);
		System.out.println(s4.hashCode());
		System.out.println(Objects.hash(s5));

		System.out.println();

		String str1 = "홍길동";
		String str2 = null;
		System.out.println(Objects.isNull(str1));
		System.out.println(Objects.nonNull(str2));
		System.out.println(Objects.requireNonNull(str1));
		try {
			String name = Objects.requireNonNull(str2, "이름이 없습니다.");
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
