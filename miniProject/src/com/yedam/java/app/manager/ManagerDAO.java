package com.yedam.java.app.manager;

import java.util.List;

public interface ManagerDAO {
	// 전체조회
	List<Manager> selectAll();

	// 단건조회
	Manager selectOne(int managerId);

	// 입력
	void insert(Manager manager);

	// 수정
	void updateName(Manager manager);

	void updatePwd(Manager manager);

	void updateAll(Manager manager);

	// 삭제
	void delete(int managerId);

	// 로그인 체크
	Manager loginCheck(Manager loginInfo);

	// 메뉴
	void login();

	void menuPrint();

	void updateMenuPrint();

	int menuSelect();

	void loginCheck();

	void insertManager();

	void updateManager();

	void updateAllManager();

	void updateNameManager();

	void updatePwdManager();

	void deleteManager();

	void selectOne();

	void end();

	void cancle();

	Manager inputAll();

	Manager inputForLogin();

	Manager inputForName();

	Manager inputForPwd();

	int inputManagerId();

}
