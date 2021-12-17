package com.yedam.java.app.customer;

import java.util.List;

public interface CustomerDAO {
	List<Customer> selectAll();

	// 단건조회
	Customer selectOne(int customerId);


	// 입력
	void insert(Customer customer);

	// 수정
	void updateName(Customer customer);

	void updatePwd(Customer customer);

	void updateAll(Customer customer);

	// 삭제
	void delete(int customerId);
}
