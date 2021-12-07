package com.yedam.java.ch07.arrays;

import java.util.Arrays;

public class MainExample {

	public static void main(String[] args) {
		// 배열복사

		char[] arr1 = { 'J', 'A', 'V', 'A' };

		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3) + "\n");

		// 배열항목비교
		int[][] original = { { 1, 2 }, { 3, 4 } };

		// 얕은 복사 후 비교
		System.out.println("=== 얕은 복제 후 비교 ===");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("배열 번지 비교 : " + original.equals(cloned1));
		System.out.println("1차 배열 항목값 비교 : " + Arrays.equals(original, cloned1));
		System.out.println("중첩 배열 항목 비교 : " + Arrays.deepEquals(original, cloned1) + "\n");

		// 깊은 복사 후 비교
		System.out.println("=== 깊은 복제 후 비교 ===");
		// 1차원 배열도 복사를 해야 한다.
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("배열 번지 비교 : " + original.equals(cloned2));
		System.out.println("1차 배열 항목값 비교 : " + Arrays.equals(original, cloned2));
		System.out.println("중첩 배열 항목 비교 : " + Arrays.deepEquals(original, cloned2) + "\n");

		// 배열 항목 정렬
		// 기본 타입 또는 String 배열은 자동으로 오름차순 정렬
		// 사용자 정의 클래스 타입은 클래스 내에 Comparable 인터페이스를 구현
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores) + "\n");

		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		System.out.println(Arrays.toString(names) + "\n");

		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		Member[] members = { m1, m2, m3 };
		Arrays.sort(members);
		for (int i = 0; i < members.length; i++) {
			System.out.println("members[" + i + "] : " + members[i].name);
		}

		// 배열 항목 검색
		int[] scores1 = { 99, 97, 98 };
		Arrays.sort(scores1);
		int index = Arrays.binarySearch(scores1, 99);
		System.out.println("\n찾은 인덱스 : " + index);

		String[] names1 = { "홍길동", "박동수", "김미수" };
		Arrays.sort(names1);
		int index1 = Arrays.binarySearch(names1, "박동수");
		System.out.println("찾은 인덱스 : " + index1);

		Member m4 = new Member("홍길동");
		Member m5 = new Member("박동수");
		Member m6 = new Member("김미수");
		Member[] memberList = { m4, m5, m6 };
		Arrays.sort(memberList);
		index = Arrays.binarySearch(memberList, m6);
	}
}