package com.yedam.java.ch0604;

public class Order2 {
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

	// 교수님 풀이

	// 필드
	String orderNo;
	String customerId;
	String orderDate;
	String customerName;
	String productNo;
	String customerAddress;
	
	// 메서드
	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}



}
