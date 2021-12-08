package com.yedam.java.test04;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

//문제4) 아래와 같이 데이터가 주어졌을 경우 남녀 수와 만 20세 이하인 인원을 구하세요.
//String[] persons = {"010302-2","991203-1","969513-2","881125-1","050105-2"};
//
//- 실행결과
//남 2, 여 3
//만 20세 이하 2

public class MainExample {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String[] persons = { "010302-2", "991203-1", "969513-2", "881125-1", "050105-2" };
		String[] gender = new String[persons.length];
		String[] personsYear = new String[persons.length];
		int nowYear =Integer.valueOf(sdf.format(now).substring(0, 2)) +100;
		int nowYear2 =Integer.valueOf(sdf.format(now).substring(0, 2));
		int ageTest;
		int ageTest2 = 0;
		
		int man = 0;
		int woman = 0;
		for (int i = 0; i < persons.length; i++) {
			gender[i] = String.valueOf(persons[i].charAt(7));
			if (gender[i].equals("1")) {
				gender[i] = "남";
				man++;
			} else if (gender[i].equals("2")) {
				gender[i] = "여";
				woman++;
			}
		}

		for (int i = 0; i < persons.length; i++) {
			if(Integer.valueOf(persons[i].substring(0, 2)) > nowYear2) {
				ageTest = nowYear - Integer.valueOf(persons[i].substring(0, 2));
			}else {
				ageTest = nowYear2 - Integer.valueOf(persons[i].substring(0, 2));
				ageTest2++;
			}
		}

		System.out.println("남 " + man + ", 여 " + woman);
		System.out.println("만 20세 이하 " + ageTest2);
	}
}
