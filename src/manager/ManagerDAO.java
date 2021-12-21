package manager;

import java.util.List;

public interface ManagerDAO {

	// 메뉴관련

	void menuPrint();

	void loginMenuPrint();

	void updateMenuPrint();

	void updatePlayerMenuPrint();

	int menuSelect();

	void end();

	void cancle();

	// 로그인 체크
	Manager loginCheck(Manager loginInfo);

	void loginCheck();

	// 입력
	void insert(Manager manager);

	void insertManager();

	void insert(Player player);

	void insertPlayer();

	Manager inputAll();

	Manager inputForLogin();

	Manager inputForName();

	Manager inputForPwd();

	Manager inputForPhone();

	int inputManagerId();

	Player inputAllForPlayer();

	Player inputForPlayerLogin();

	Player inputForPlayerName();

	Player inputForPlayerPwd();

	Player inputForPlayerPhone();

	Player inputForPlayerProgress();

	Player inputForPlayerRank();

	int inputPlayerId();

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

	void updatePlayer();

	void updateAllPlayer();

	void updateNamePlayer();

	void updatePwdPlayer();

	void updatePhonePlayer();

	void updateProgressPlayer();

	void updateRankPlayer();

	void updateAll(Player player);

	void updatePwd(Player player);

	void updateName(Player player);

	void updatePhone(Player player);

	void updateProgress(Player player);

	void updateRank(Player player);

	void pwdCheck();

	Manager pwdCheck(Manager loginInfo);

	// 삭제
	void delete(int managerId);

	void deleteManager();

	void deletePlayer(int playerId);

	void deletePlayerManager();

	// 조회
	List<Manager> selectAll();

	List<Player> selectPlayerAll();

	Player selectPlayerOne(int playerId);

	Manager selectOne(int managerId);

	void selectOne();

	void selectPlayerOne();
}
