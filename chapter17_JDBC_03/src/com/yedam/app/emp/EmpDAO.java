package com.yedam.app.emp;

import java.util.List;

public interface EmpDAO {
	// 전체조회
	List<Emp> selectAll();

	// 단건조회
	Emp selectOne(int employeeId);

	// 입력
	void insert(Emp emp);

	// 수정
	void update(Emp emp);

	// 삭제
	void delete(int employeeId);

}