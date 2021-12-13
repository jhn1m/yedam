package com.yedam.java.test04;

import java.text.SimpleDateFormat;
import java.util.Date;

// [문제4] 아래와 같이 자료가 주어졌을 경우 남녀 수를 구하세요.(20점)

// String[] arr = {"010102-4", "991012-1", "960304-1", "881012-2", "040403-3" };

// <<실행결과>>
// 남 3 여 2

public class Exam4 {
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String[] persons = { "010102-4", "991012-1", "960304-1", "881012-2", "040403-3" };
		String[] gender = new String[persons.length];

		int man = 0;
		int woman = 0;
		for (int i = 0; i < persons.length; i++) {
			gender[i] = String.valueOf(persons[i].charAt(7));
			if (gender[i].equals("1") || gender[i].equals("3")) {
				gender[i] = "남";
				man++;
			} else if (gender[i].equals("2") || gender[i].equals("4")) {
				gender[i] = "여";
				woman++;
			}
		}

		System.out.println("남 " + man + " 여 " + woman);
	}
}
