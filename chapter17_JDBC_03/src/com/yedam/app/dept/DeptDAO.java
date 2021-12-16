package com.yedam.app.dept;

import java.util.List;

public interface DeptDAO {
	// 기능 정의

	// 전체조회
	public List<Dept> selectAll();

	// 단건조회
	public Dept selectOne(int departmentId);
	
	// 등록
	public void insert(Dept dept);
	
	// 수정
	public void update(Dept dept);
	
	// 삭제
	public void delete(int departmentId);
	
}