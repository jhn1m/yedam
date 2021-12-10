package com.yedam.java.ch01;

public class CustomerTest {
	public static void main(String[] args) {
//		Customer lee = new Customer();
//		lee.setCustomerId("10010");
//		lee.setCustomerName("이고객");
//		lee.bonusPoint = 1000;
//		System.out.println("지불금액 : " + lee.calcPrice(1000));
//		System.out.println(lee.showCustomerInfo());
//
//		VIPCustomer kim = new VIPCustomer();
//		kim.setCustomerId("10020");
//		kim.setCustomerName("김고객");
//		kim.bonusPoint = 10000;
//		System.out.println("지불금액 : " + kim.calcPrice(1000));
//		System.out.println(kim.showCustomerInfo());	
		showInfo(new Customer("10010", "이김김"));
		showInfo(new Customer("10020", "김이이"));
		
	}
	
	public static void showInfo(Customer customer) {
		System.out.println("지불금액 : " + customer.calcPrice(10000));
		System.out.println(customer.showCustomerInfo());
	}
	
}
