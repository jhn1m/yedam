package com.yedam.java.check;

public class MainExample {

	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		// 385쪽, 문제 3번
		printSound(new Cat());
		printSound(new Dog());
		// 403쪽, 문제 3번
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
}
