package manager;

import java.util.List;

public interface ManagerDAO {

	// 메뉴관련

	void menuPrint();

	void loginMenuPrint();

	void updateMenuPrint();

	int menuSelect();

	void end();

	void cancle();

	// 로그인 체크
	Manager loginCheck(Manager loginInfo);

	void loginCheck();

	// 입력
	void insert(Manager manager);

	void insertManager();

	Manager inputAll();

	Manager inputForLogin();

	Manager inputForName();

	Manager inputForPwd();

	Manager inputForPhone();

	int inputManagerId();

	// 수정

	void updateManager();

	void updateAllManager();

	void updateNameManager();

	void updatePwdManager();


	void updatePhoneManager();

	void updateAll(Manager manager);

	void updatePwd(Manager manager);

	void updateName(Manager manager);

	void updatePhone(Manager manager);

	// 삭제
	void delete(int managerId);

	void deleteManager();

	// 조회
	List<Manager> selectAll();

	Manager selectOne(int managerId);

	void selectOne();

}
