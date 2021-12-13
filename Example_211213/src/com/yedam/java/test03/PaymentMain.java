package com.yedam.java.test03;
// [문제3] 다음의 조건을 만족하는 인터페이스와 그를 구현하는 클래스를 선언하세요.(30점)

// (1) Payment 인터페이스
// - 다음과 같이 상수필드를 가진다. 
// 1) 온라인 결제 할인율 (ONLINE_PAYMENT_RATIO), 5%
// 2) 오프라인 결제 할인율 (OFFLINE_PAYMENT_RATIO), 3%
// - 다음과 같이 추상 메서드를 가진다.
// 1) 온라인 결제 메서드 시그니처 : public int online(int price) 
// 2) 오프라인 결제 메서드 시그니처 : public int offline(int price) 
// 3) 결제 정보 출력 메서드 시그니처 : public void showInfo()

//(2) CardPayment 클래스
// - 필드로 카드할인율(cardRatio)을 가진다. 
// - 생성자를 통해 매개변수로 값을 받아 필드를 초기화 한다. 
// - 아래의 실행코드와 실행결과를 참조하여 Payment 인터페이스 메서드를 오버라이딩 한다.

//(3) SimplePayment 클래스
// - 필드로 간편결제 할인율(simplePaymentRatio)을 가진다.
// - 생성자를 통해 매개변수로 값을 받아 필드를 초기화 한다.
// - 아래의 실행코드와 실행결과를 참조하여 Payment 인터페이스 메서드를 오버라이딩 한다.

//<<실행코드>>
//public static void main(String[] args) {
//int price =10000;
//Payment card =new CardPayment(0.08);
//card.showInfo();
//System.out.println("온라인 결제 금액 : "+ card.online(price));
//System.out.println("오프라인 결제 금액 : "+ card.offline(price));
//Payment simple =new SimplePayment(0.05);
//simple.showInfo();
//System.out.println("온라인 결제 금액 : "+ simple.online(price));
//System.out.println("오프라인 결제 금액 : "+ simple.offline(price));
//}

public class PaymentMain {

	public static void main(String[] args) {
		int price = 10000;

		Payment card = new CardPayment(0.08);
		card.showinfo();
		System.out.println("온라인 결제 금액 : " + card.online(price));
		System.out.println("오프라인 결제 금액 : " + card.offline(price));

		Payment simple = new CardPayment(0.05);
		simple.showinfo();
		System.out.println("온라인 결제 금액 : " + simple.online(price));
		System.out.println("오프라인 결제 금액 : " + simple.offline(price));

	}

}
