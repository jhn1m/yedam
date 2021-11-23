package com.yedam.java.ch0604;

public class Order {
	// 문제2) 쇼핑몰에 주문이 들어왔습니다. 주문 내용은 다음과 같습니다.
	// <<주문 내용>>
	// 주문 번호 : 201803120001
	// 주문자 아이디 : abc123
	// 주문 날짜 : 2018년 3월 12일
	// 주문자 이름 : 홍길순
	// 주문 상품 번호 : PD0345-12
	// 배송 주소 : 서울시 영등포구 여의도동 20번지
	// 위 주문 내용에 대한 클래스를 만들고
	// 주문 내용을 인스턴스로 생성한 후 위와 같은 형식으로 출력하세요.

	// 필드
	long shoppingNum;
	String id;
	String shoppingDate;
	String name;
	String itemNum;
	String address;

	// 생성자

	Order(long shoppingNum, String id, String shoppingDate, String name, String itemNum, String address) {
		this.shoppingNum = shoppingNum;
		this.id = id;
		this.shoppingDate = shoppingDate;
		this.name = name;
		this.itemNum = itemNum;
		this.address = address;
	};

	// 메서드

}
