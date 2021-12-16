package com.yedam.app.emp13;

import java.util.List;

public interface Emp13DAO {
	// 전체조회
	List<Emp13> selectAll();

	// 단건조회
	Emp13 selectOne(int employeeId);

	// 입력
	void insert(Emp13 emp13);

	// 수정
	void update(Emp13 emp13);

	// 삭제
	void delete(int employeeId);
}
