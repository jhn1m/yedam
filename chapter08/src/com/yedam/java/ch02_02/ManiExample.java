package com.yedam.java.ch02_02;

public class ManiExample {
	public static void main(String[] args) {
		Driver driver = new Driver();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		driver.drive(bus);
		driver.drive(taxi);
		System.out.println();
		
		Vehicle vehicle = new Bus();
		vehicle.run();
//		vehicle.checkFare();
		
		Bus bus1 = (Bus)vehicle;
		bus1.run();
		bus1.checkFare();
		System.out.println();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
