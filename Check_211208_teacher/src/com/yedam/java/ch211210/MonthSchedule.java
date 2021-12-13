package com.yedam.java.ch211210;

import java.util.Scanner;

public class MonthSchedule {
	private Day[] days;
	private Scanner sc;

	public MonthSchedule(int day) {
		this.days = new Day[day];
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}
		sc = new Scanner(System.in);
	}

	private void input() {
		System.out.printf("날짜(1 ~ %d) ?", days.length);
		int day = sc.nextInt();
		System.out.print("할 일 (빈칸없이 입력)?");
		String work = sc.next();
		day--;
		if (day < 0 || day > days.length - 1) {
			System.out.println("날짜를 잘못 입력하였습니다.");
			return;
		}
		days[day].set(work);
	}

	private void view() {
		System.out.printf("날짜(1 ~ %d) ?", days.length);
		int day = sc.nextInt();
		day--;
		if (day < 0 || day > days.length - 1) {
			System.out.println("날짜를 잘못 입력하였습니다.");
			return;
		}
		System.out.print((day + 1) + "일의 할 일은");
		days[day].show();
	}

	private void finish() {
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

	public void run() {
		System.out.println("이번 달 스케줄 관리 프로그램");
		while (true) {
			System.out.printf("할일(입력 : 1, 보기 : 2, 끝내기 : 3) >>");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				return;
			}
		}
	}

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}
