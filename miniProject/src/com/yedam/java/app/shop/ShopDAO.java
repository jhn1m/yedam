package com.yedam.java.app.shop;

import java.util.List;

public interface ShopDAO {
	// 전체조회
	List<Shop> selectAll();

	// 단건조회
	Shop selectOne(int shopId);

	Shop selectOneWithManager(int shopId);
	
	// 입력
	void insert(Shop shop);

	// 수정
	void updateShopName(Shop shop);

	void updateLocation(Shop Shop);

	void updateAll(Shop shop);

	// 삭제
	void delete(int shopId);
}
