package com.yedam.java.ch01;

public class MainExample {

	public static void main(String[] args) {
		Customer[] list = new Customer[3];
		
		list[0] = new Customer("10010", "홍길동");
		list[1] = new GoldCustomer("10020", "이김김");
		list[2] = new VIPCustomer("10030", "강박박");
		
		for(Customer c : list) {
			System.out.print("상품가 : 10,000원인 경우 ");
			System.out.println("지불금액 : " + c.calcPrice(10000));
			System.out.println(c.showCustomerInfo());
			System.out.println();
		}
	}

}
