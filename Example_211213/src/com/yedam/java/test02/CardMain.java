package com.yedam.java.test02;

// [문제2] 다음의 조건을 만족하는 클래스를 선언하세요.(30점)
// (1) Card 클래스
// - 필드로 카드번호(cardNo), 유효날짜(validDate), CVC(cvc)를 가진다. 
// - 생성자를 통해 매개변수로 값을 받아 모든 필드를 초기화시킨다.
// - 각 필드의 getter를 가진다. 
// - 다음과 같은 형식으로 정보를 출력하는 메서드를 추가로 가진다. 
// 1) 메소드 시그니처 : public void showCardInfo() 
// 1) 출력 양식 : 카드정보 ( Card NO : 5432-4567-9534-3657, 유효기간 : 20251203, CVC : 253 )

// (2) TossCard 클래스
// - Card 클래스를 상속받는다.
// - TossCard 클래스의 필드로 카드사(company), 담당직원(cardStaff)을 가진다.
// - 카드사는 항상 “Toss”이며 카드사를 제외한 필드는 생성자를 통해 매개변수로 값을 받아 초기화한다. 
// - Card 클래스의 showCardInfo() 메서드를 오버라이딩하여 다음과 같이 출력하도록 정의한다. 
// 1) 출력 양식 : 카드정보 - Card NO, 5432-4567-9534-3657 　　　　 
// 				  담당직원 - 신빛용, Toss

// (2) DGBCard 클래스
// - Card 클래스를 상속받는다.
// - DGBCard 클래스의 필드로 카드사(company), 담당직원(cardStaff)을 가진다.
// - 카드사는 항상 “대구은행”이며 카드사를 제외한 필드는 생성자를 통해 매개변수로 값을 받아 초기화한다.
// - Card 클래스의 showCardInfo() 메서드를 오버라이딩하여 다음과 같이 출력하도록 정의한다.
// 1) 출력 양식 : 카드정보 ( Card NO : 5432-4567-9534-3657, 유효기간 : 20251203, CVC : 253 )
//				  담당직원 - 신빛용, 대구은행

public class CardMain {

	public static void main(String[] args) {

		Card card1 = new Card("5432-4567-9534-3657", 20251203, 253);
		card1.showCardInfo();

		System.out.println();

		Card card2 = new TossCard("5432-4567-9534-3657", 20251203, 253, "신빛용");
		card2.showCardInfo();

		System.out.println();

		Card card3 = new DGBCard("5432-4567-9534-3657", 20251203, 253, "신빛용");
		card3.showCardInfo();
	}

}
