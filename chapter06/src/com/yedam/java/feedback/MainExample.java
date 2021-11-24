package com.yedam.java.feedback;

import java.util.Scanner;

public class MainExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력할 수");
		int count = sc.nextInt();
		Product[] products = null;
		products = new Product[count];
		
		System.out.print("상품정보 입력 > ");
		for(int i = 0; i < products.length; i++) {
		String name = sc.next();
		int price = sc.nextInt();

		Product product = new Product(name, price);
		products[i] = product;
		}
		
		for(int i = 0; i < products.length; i++) {
			System.out.println(products[i].name);
			System.out.println(products[i].price);
	}
	}
	
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------------------------------------");
		System.out.println("1. 상품 수 | 2. 가격입력 | 3. 제품별 가격 | 4. 분석 | 5. 종료");
		System.out.println("---------------------------------------------------------------\n");

		int productsCnt = 0;
		Product[] products = null;
		boolean run = true;
		while (run) {
			System.out.print("메뉴 번호를 입력하세요 > ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.print("\n상품 수를 입력하세요 > ");
				productsCnt = sc.nextInt();
				products = new Product[productsCnt];
				break;
			case 2:
				for (int i = 0; i < products.length; i++) {
					System.out.print("상품정보 입력 > ");
					String name = sc.next();
					int price = sc.nextInt();

					Product product = new Product(name, price);
					products[i] = product;
				}
				break;
			case 3:
				System.out.println("\n제품별 가격을 출력합니다.\n");

				for (int i = 0; i < products.length; i++) {
					Product product = products[i];
					// products[i] : 주소 > product : 주소
					String name = product.getName();
					int price = product.getPrice();
					System.out.println(name + " : " + price);
					// System.out.println(products[i].getName() + " : " + product[i].getPrice());
				}
				break;
			case 4:
				System.out.println("\n분석\n");

				int max = products[0];
				for (int i = 0; i < products.length; i++) {
					if (products[i] > max) {
						max = products[i];
					}
				}
				int productsSum = 0;
				String name = null;
				for (int i = 0; i < products.length; i++) {
					Product product = products[i];
					String productName = product.getName();
					int price = product.getPrice();
					if (price == max) {
						product.getName();
					}
					productsSum += products[i];
				}
				int maxName = 0;
				for (int i = 0; i < products.length; i++) {
					if (products[i] == max) {
						maxName = i + 1;
					}
				}
				System.out.println("최고 가격을 가진 제품은" + maxName + " 번 입니다.");
				System.out.println("해당 제품을 제외한 나머지의 합은 " + (productsSum - max) + "원 입니다.\n");
				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;
			}
		}
	}
	*/
}