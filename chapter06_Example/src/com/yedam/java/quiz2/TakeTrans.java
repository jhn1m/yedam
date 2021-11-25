package com.yedam.java.quiz2;

public class TakeTrans {
	public static void main(String[] args) {
		Student james = new Student("james", 5000);
		Student tomas = new Student("tomas", 10000);
		Student edward = new Student("edward", 20000);
		
		Bus bus100 = new Bus(100);
		james.take(bus100);
		
		Subway subwayGreen = new Subway("2호선");
		tomas.take(subwayGreen);
		
		Taxi taxi1234 = new Taxi("11가2222");
		edward.take(taxi1234);
		
		james.showInfo();
		tomas.showInfo();
		edward.showInfo();
		
		bus100.showInfo();
		subwayGreen.showInfo();
		taxi1234.showInfo();
		
	}
}
