package com.yedam.java.test04;

public class MainExample {
	public static void main(String[] args) {
		String[] persons = { "010302-2", "991203-1", "969513-2", "881125-1", "050105-2" };
		int male = 0;
		int female = 0;
		int underage = 0;

		for (String person : persons) {
			// 남녀 수
			char gender = person.charAt(7);

			if (gender == '1') {
				male++;
			} else if (gender == '2') {
				female++;
			}

			// 만 20세 이하
			String strTear = person.substring(0, 2);
			int year = Integer.parseInt(strTear);
			if (year <= 21) {
				year += 2000;
			} else {
				year += 1900;
			}

			int age = 2021 - year;
			if (age <= 20) {
				underage++;
			}
			System.out.println("남 " + male + ", 여 " + female);
			System.out.println("만 20세 이하 " + underage);
		}
	}
}
