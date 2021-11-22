package com.yedam.java.ch0604;

public class MainExample {

	public static void main(String[] args) {
		// 메소드
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		int result1 = myCalc.plus(5, 6);

		System.out.println("result1 : " + result1);

		byte x = 10;
		byte y = 4;
		double result2 = myCalc.devide(x, y);
		System.out.println("result2 : " + result2);

		// 매개 변수의 개수를 모를 경우
		Computer myCom = new Computer();

		int[] values1 = { 1, 2, 3 };
		int intResult1 = myCom.sum1(values1);
		System.out.println("intResult1 : " + intResult1);

		int intResult2 = myCom.sum1(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("intResult2 : " + intResult2);

		int intResult3 = myCom.sum2(1, 2, 3);
		System.out.println("intResult3 : " + intResult3);

		int intResult4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("intResult4 : " + intResult4);

		// return 문
		Car myCar = new Car();
		myCar.setGas(5);

		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		if (myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}

		Calculator myCalc1 = new Calculator();
		myCalc1.execute();

		Car myCar2 = new Car();
		myCar2.keyTurnOn();
		myCar2.run2();
		int speed = myCar2.getSpeed();
		System.out.println("현재 속도 : " + speed + "km/h");

		Calculator myCalcu = new Calculator();
		double dbResult1 = myCalcu.areaRectangle(10);
		double dbResult2 = myCalcu.areaRectangle(10, 20);
		System.out.println("정사각형 넓이 : " + dbResult1);
		System.out.println("직사각형 넓이 : " + dbResult2);

		Person per = new Person();
		System.out.println("이 사람의 나이는 : " + per.age);
		System.out.println("이 사람의 이름은 : " + per.name);
		System.out.println("이 사람의 결혼여부 : " + per.mariage);
		System.out.println("이 사람의 자식 수는 " + per.childrenCnt + "명 입니다.");

		ShoppingMall order1 = new ShoppingMall(201803120001L, "abc123", "2018년 3월 12일", "홍길순", "PD0345-12",
				"서울시 영등포구 여의도동 20번지");
		System.out.println("<< 주문 내용 >>");
		System.out.println("주문 번호 : " + order1.shoppingNum);
		System.out.println("주문자 아이디 : " + order1.id);
		System.out.println("주문 날짜 : " + order1.shoppingDate);
		System.out.println("주문자 이름 : " + order1.name);
		System.out.println("주문 상품 번호 : " + order1.itemNum);
		System.out.println("배송 주소 : " + order1.address);
		
		Calculator2 calc = new Calculator2();
		calc.calcAll(3, 4);
	}
}