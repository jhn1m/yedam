package manager;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import common.DAO;

public class ManagerDAOImpl extends DAO implements ManagerDAO {

	// 싱글톤
	private static ManagerDAOImpl instance = new ManagerDAOImpl();

	private ManagerDAOImpl() {
	}

	public static ManagerDAOImpl getInstance() {
		return instance;
	}

	@Override
	public void loginMenuPrint() {
		System.out.println("-------------------------------------");
		System.out.println("| 1. 로그인 | 2. 회원가입 | 9. 종료 |");
		System.out.println("-------------------------------------");
		System.out.print("선택 >> ");
	}

	@Override
	public void menuPrint() {
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"| 1. 등록 | 2. 수정 | 3. 삭제 | 4. 매니저 개별조회 | 5. 매니저 전체조회 | 6. 회원 전체조회 | 7. 회원등록 | 8. 회원 삭제 | 9. 회원 수정 | 10. 회원 개별조회 | 0. 종료 |");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("선택 >> ");
		int menuNo = menuSelect();
		if (menuNo == 1) {
			insertManager();
		} else if (menuNo == 2) {
			updateMenuPrint();
			updateManager();
		} else if (menuNo == 3) {
			deleteManager();
		} else if (menuNo == 4) {
			selectOne();
		} else if (menuNo == 5) {
			selectAll();
		} else if (menuNo == 6) {
			selectPlayerAll();
		} else if (menuNo == 7) {
			insertPlayer();
		} else if (menuNo == 8) {
			deletePlayerManager();
		} else if (menuNo == 9) {
			updatePlayerMenuPrint();
			updatePlayer();

		} else if (menuNo == 10) {
			selectPlayerOne();
		} else if (menuNo == 0) {
			end();
			return;
		}
	}

	@Override
	public void updateMenuPrint() {
		System.out.println("------------------------------------------------");
		System.out.println("| 수정을 선택하셨습니다. 수정 메뉴를 선택하세요. |");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("| 1. 전체수정 | 2. 이름만 수정 | 3. 비밀번호 수정 | 4. 연락처 수정 | 9. 취소 |");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.print("선택 >> ");
	}

	@Override
	public int menuSelect() {
		Scanner sc = new Scanner(System.in);
		int menuNo = 0;
		try {
			menuNo = sc.nextInt();
		} catch (Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}

	@Override
	public void end() {
		System.out.println("프로그램을 종료합니다.");
	}

	@Override
	public void cancle() {
		System.out.println("취소합니다.");
	}

	@Override
	public Manager loginCheck(Manager loginInfo) {
		Manager manager = null;
		try {
			connect();

			// SQL
			String check = "SELECT * FROM manager WHERE manager_id = ? AND manager_pwd = ?";

			pstmt = conn.prepareStatement(check);
			pstmt.setInt(1, loginInfo.getManagerId());
			pstmt.setString(2, loginInfo.getManagerPwd());
			rs = pstmt.executeQuery();

			if (rs.next()) {
				manager = new Manager();
				manager.setManagerId(rs.getInt("manager_id"));
				manager.setManagerName(rs.getString("manager_name"));
				manager.setManagerPwd(rs.getString("manager_pwd"));
				manager.setManagerPhone(rs.getString("manager_phone"));
				System.out.println(manager.getManagerName() + " 님 환영합니다.");
				menuPrint();
			} else {
				System.out.println("로그인 실패");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return manager;
	}

	@Override
	public Manager pwdCheck(Manager loginInfo) {
		Manager manager = null;
		try {
			connect();

			// SQL
			String check = "SELECT * FROM manager WHERE manager_id = ? AND manager_pwd = ?";

			pstmt = conn.prepareStatement(check);
			pstmt.setInt(1, loginInfo.getManagerId());
			pstmt.setString(2, loginInfo.getManagerPwd());
			rs = pstmt.executeQuery();

			if (rs.next()) {
				manager = new Manager();
				manager.setManagerId(rs.getInt("manager_id"));
				manager.setManagerName(rs.getString("manager_name"));
				manager.setManagerPwd(rs.getString("manager_pwd"));
				manager.setManagerPhone(rs.getString("manager_phone"));
				System.out.println("비밀번호를 변경합니다.");
				updatePwdManager();
			} else {
				System.out.println("로그인 실패");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return manager;
	}

	@Override
	public void loginCheck() {
		Manager manager = inputForLogin();
		loginCheck(manager);
	}

	@Override
	public void pwdCheck() {
		Manager manager = inputForLogin();
		pwdCheck(manager);
	}

	@Override
	public void insert(Manager manager) {
		try {
			connect();

			// SQL
			String insert = "INSERT INTO manager VALUES(?, ?, ?, ?)";

			pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1, manager.getManagerId());
			pstmt.setString(2, manager.getManagerName());
			pstmt.setString(3, manager.getManagerPwd());
			pstmt.setString(4, manager.getManagerPhone());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 등록되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void insertManager() {
		Manager manager = inputAll();
		insert(manager);
	}

	@Override
	public Manager inputAll() {
		Manager manager = new Manager();
		Scanner sc = new Scanner(System.in);
		manager = new Manager();

		System.out.print("매니저 번호 >> ");
		manager.setManagerId(sc.nextInt());

		System.out.print("매니저 이름 >> ");
		manager.setManagerName(sc.next());

		System.out.print("매니저 비밀번호 >> ");
		manager.setManagerPwd(sc.next());

		System.out.print("매니저 전화번호 >> ");
		manager.setManagerPhone(sc.next());
		return manager;
	}

	@Override
	public Manager inputForLogin() {
		Manager manager = new Manager();
		manager = new Manager();
		Scanner sc = new Scanner(System.in);
		sc = new Scanner(System.in);
		System.out.print("매니저 아이디 >> ");
		manager.setManagerId(sc.nextInt());
		System.out.print("매니저 비밀번호 >> ");
		manager.setManagerPwd(sc.next());
		return manager;

	}

	@Override
	public Manager inputForName() {
		Manager manager = new Manager();
		manager = new Manager();
		Scanner sc = new Scanner(System.in);
		System.out.print("매니저 번호 >> ");
		manager.setManagerId(sc.nextInt());
		System.out.print("변경할 이름 >> ");
		manager.setManagerName(sc.next());
		return manager;
	}

	@Override
	public Manager inputForPwd() {
		Manager manager = new Manager();
		Scanner sc = new Scanner(System.in);
		System.out.print("매니저 번호 >> ");
		manager.setManagerId(sc.nextInt());
		System.out.print("변경할 비밀번호 >> ");
		manager.setManagerPwd(sc.next());
		return manager;
	}

	public void checker() {
		connect();
		Scanner sc = new Scanner(System.in);
		System.out.println("다시 로그인 해주십시오.");
		System.out.print("매니저 번호 >> ");
		String id = sc.next();
		System.out.print("매니저 비밀번호 >> ");
		String pass = sc.next();
		String sql1 = "SELECT * FROM manager WHERE manager_id = " + id + " AND manager_pwd = '" + pass + "'";
		try {
			rs = stmt.executeQuery(sql1);
			if (rs.next()) {
				updatePwdManager();
			} else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public Manager inputForPhone() {
		Manager manager = new Manager();
		Scanner sc = new Scanner(System.in);
		System.out.print("매니저 번호 >> ");
		manager.setManagerId(sc.nextInt());
		System.out.print("변경할 연락처 >> ");
		manager.setManagerPhone(sc.next());
		return manager;
	}

	@Override
	public int inputManagerId() {
		int managerId = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("매니저 번호 >> ");
		managerId = sc.nextInt();
		return managerId;
	}

	@Override
	public void updateManager() {
		int menuNo = menuSelect();
		if (menuNo == 1) {
			updateAllManager();
		} else if (menuNo == 2) {
			updateNameManager();
		} else if (menuNo == 3) {
			pwdCheck();
		} else if (menuNo == 4) {
			updatePhoneManager();
		} else if (menuNo == 9) {
			cancle();
			return;
		}
	}

	@Override
	public void updateAllManager() {
		Manager manager = inputAll();
		updateAll(manager);
	}

	@Override
	public void updateNameManager() {
		Manager manager = inputForName();
		updateName(manager);
	}

	@Override
	public void updatePwdManager() {
		Manager manager = inputForPwd();
		updatePwd(manager);
	}

	@Override
	public void updatePhoneManager() {
		Manager manager = inputForPhone();
		updatePhone(manager);
	}

	@Override
	public void updateAll(Manager manager) {
		try {
			connect();

			// SQL
			String update = "UPDATE manager SET manager_id = ?, manager_name = ?, manager_pwd = ?, manager_phone = ? WHERE manager_id = ?";
			pstmt = conn.prepareStatement(update);

			pstmt.setInt(1, manager.getManagerId());
			pstmt.setString(2, manager.getManagerName());
			pstmt.setString(3, manager.getManagerPwd());
			pstmt.setString(4, manager.getManagerPhone());
			pstmt.setInt(5, manager.getManagerId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void updateName(Manager manager) {
		try {
			connect();

			// SQL
			String update = "UPDATE manager SET manager_name = ? WHERE manager_id = ?";
			pstmt = conn.prepareStatement(update);

			pstmt.setString(1, manager.getManagerName());
			pstmt.setInt(2, manager.getManagerId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void updatePwd(Manager manager) {
		try {
			connect();

			// SQL
			String update = "UPDATE manager SET manager_pwd = ? WHERE manager_id = ?";
			pstmt = conn.prepareStatement(update);

			pstmt.setString(1, manager.getManagerPwd());
			pstmt.setInt(2, manager.getManagerId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void updatePhone(Manager manager) {
		try {
			connect();

			// SQL
			String update = "UPDATE manager SET manager_phone = ? WHERE manager_id = ?";
			pstmt = conn.prepareStatement(update);

			pstmt.setString(1, manager.getManagerPhone());
			pstmt.setInt(2, manager.getManagerId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void delete(int managerId) {
		try {
			connect();

			// SQL
			String delete = "DELETE FROM manager WHERE manager_id = ?";
			pstmt = conn.prepareStatement(delete);

			pstmt.setInt(1, managerId);

			int result = pstmt.executeUpdate();
			System.out.println(result + "건이 삭제되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void deleteManager() {
		int managerId = inputManagerId();
		delete(managerId);
	}

	@Override
	public List<Manager> selectAll() {
		List<Manager> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();

			// SQL
			rs = stmt.executeQuery("SELECT * FROM manager ORDER BY manager_id");

			// RESULT
			while (rs.next()) {
				Manager manager = new Manager();
				manager.setManagerId(rs.getInt("manager_id"));
				manager.setManagerName(rs.getString("manager_name"));
				manager.setManagerPwd(rs.getString("manager_pwd"));
				manager.setManagerPhone(rs.getString("manager_phone"));
				list.add(manager);
			}
			System.out.println(list);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	@Override
	public Manager selectOne(int managerId) {
		Manager manager = new Manager();
		try {
			connect();
			stmt = conn.createStatement();

			// SQL
			String select = "SELECT * FROM manager WHERE manager_id = " + managerId;
			rs = stmt.executeQuery(select);
			while (rs.next()) {
				manager.setManagerId(rs.getInt("manager_id"));
				manager.setManagerName(rs.getString("manager_name"));
				manager.setManagerPwd(rs.getString("manager_pwd"));
				manager.setManagerPhone(rs.getString("manager_phone"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return manager;
	}

	@Override
	public void selectOne() {
		int managerId = inputManagerId();
		Manager manager = selectOne(managerId);
		if (manager == null) {
			System.out.println(managerId + " : 없는 부서입니다.");
		} else {
			System.out.println(manager);
		}
	}

	// 회원 관리부분 ======================================================

	@Override
	public int inputPlayerId() {
		int playerId = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("플레이어 번호>> ");
		playerId = sc.nextInt();
		return playerId;
	}

	@Override
	public void insertPlayer() {
		Player player = inputAllForPlayer();
		insert(player);
	}

	@Override
	public void updatePlayerMenuPrint() {
		System.out.println("----------------------------------------------");
		System.out.println("수정을 선택하셨습니다. 수정 메뉴를 선택하세요.");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------");
		System.out.println("| 1. 전체수정 | 2. 이름만 수정 | 3. 비밀번호 수정 | 4. 연락처 수정 | 5. 진행도 수정 | 6. 등급 수정 | 9. 취소 |");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------");
		System.out.print("선택 >> ");
	}

	@Override
	public void updatePlayer() {
		int menuNo = menuSelect();
		if (menuNo == 1) {
			updateAllPlayer();
		} else if (menuNo == 2) {
			updateNamePlayer();
		} else if (menuNo == 3) {
			updatePwdPlayer();
		} else if (menuNo == 4) {
			updatePhonePlayer();
		} else if (menuNo == 5) {
			updateProgressPlayer();
		} else if (menuNo == 6) {
			updateRankPlayer();
		} else if (menuNo == 9) {
			cancle();
			return;
		}
	}

	@Override
	public List<Player> selectPlayerAll() {
		List<Player> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();

			// SQL
			rs = stmt.executeQuery("SELECT * FROM player ORDER BY player_id");

			// RESULT
			while (rs.next()) {
				Player manager = new Player();
				manager.setPlayerId(rs.getInt("player_id"));
				manager.setPlayerName(rs.getString("player_name"));
				manager.setPlayerPwd(rs.getString("player_pwd"));
				manager.setPlayerPhone(rs.getString("player_phone"));
				manager.setPlayerProgress(rs.getInt("player_progress"));
				manager.setPlayerRank(rs.getString("player_rank"));
				list.add(manager);
			}
			System.out.println(list.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	@Override
	public Player selectPlayerOne(int playerId) {
		Player player = new Player();
		try {
			connect();
			stmt = conn.createStatement();

			// SQL
			String select = "SELECT * FROM player WHERE player_id = " + playerId;
			rs = stmt.executeQuery(select);
			while (rs.next()) {
				player.setPlayerId(rs.getInt("player_id"));
				player.setPlayerName(rs.getString("player_name"));
				player.setPlayerPwd(rs.getString("player_pwd"));
				player.setPlayerPhone(rs.getString("player_phone"));
				player.setPlayerProgress(rs.getInt("player_progress"));
				player.setPlayerRank(rs.getString("player_rank"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return player;
	}

	public void selectPlayerOne() {
		int playerId = inputPlayerId();
		Player player = selectPlayerOne(playerId);
		if (player == null) {
			System.out.println(playerId + " : 없는 사용자 입니다.");
		} else {
			System.out.println(player);
		}
	}

	@Override
	public Player inputAllForPlayer() {
		Player player = new Player();
		Scanner sc = new Scanner(System.in);
		player = new Player();

		System.out.print("회원 번호 >> ");
		player.setPlayerId(sc.nextInt());

		System.out.print("회원 이름 >> ");
		player.setPlayerName(sc.next());

		System.out.print("회원 비밀번호 >> ");
		player.setPlayerPwd(sc.next());

		System.out.print("회원 전화번호 >> ");
		player.setPlayerPhone(sc.next());
		return player;
	}

	@Override
	public void insert(Player player) {
		try {
			connect();

			// SQL
			String insert = "INSERT INTO player(player_id, player_name, player_pwd, player_phone) VALUES(?, ?, ?, ?)";

			pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1, player.getPlayerId());
			pstmt.setString(2, player.getPlayerName());
			pstmt.setString(3, player.getPlayerPwd());
			pstmt.setString(4, player.getPlayerPhone());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 등록되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void deletePlayer(int playerId) {
		try {
			connect();
			// SQL
			String delete = "DELETE FROM player WHERE player_id = ?";
			pstmt = conn.prepareStatement(delete);

			pstmt.setInt(1, playerId);

			int result = pstmt.executeUpdate();
			System.out.println(result + "건이 삭제되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void deletePlayerManager() {
		int playerId = inputPlayerId();
		deletePlayer(playerId);

	}

	@Override
	public void updateAllPlayer() {
		Player player = inputAllForPlayer();
		updateAll(player);
	}

	@Override
	public void updateNamePlayer() {
		Player player = inputForPlayerName();
		updateName(player);
	}

	@Override
	public void updatePwdPlayer() {
		Player player = inputForPlayerPwd();
		updatePwd(player);
	}

	@Override
	public void updatePhonePlayer() {
		Player player = inputForPlayerPhone();
		updatePhone(player);
	}

	@Override
	public void updateProgressPlayer() {
		Player player = inputForPlayerProgress();
		updateProgress(player);
	}

	@Override
	public void updateRankPlayer() {
		Player player = inputForPlayerRank();
		updateRank(player);
	}

	@Override
	public void updateAll(Player player) {
		try {
			connect();

			// SQL
			String update = "UPDATE player SET player_id = ?, player_name = ?, player_pwd = ?, player_phone = ?, player_progress = ?, player_rank = ? WHERE player_id = ?";
			pstmt = conn.prepareStatement(update);

			pstmt.setInt(1, player.getPlayerId());
			pstmt.setString(2, player.getPlayerName());
			pstmt.setString(3, player.getPlayerPwd());
			pstmt.setString(4, player.getPlayerPhone());
			pstmt.setInt(5, player.getPlayerProgress());
			pstmt.setString(6, player.getPlayerRank());
			pstmt.setInt(7, player.getPlayerId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void updatePwd(Player player) {
		try {
			connect();

			// SQL
			String update = "UPDATE player SET player_pwd = ? WHERE player_id = ?";
			pstmt = conn.prepareStatement(update);

			pstmt.setString(1, player.getPlayerPwd());
			pstmt.setInt(2, player.getPlayerId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void updateName(Player player) {
		try {
			connect();

			// SQL
			String update = "UPDATE player SET player_name = ? WHERE player_id = ?";
			pstmt = conn.prepareStatement(update);

			pstmt.setString(1, player.getPlayerName());
			pstmt.setInt(2, player.getPlayerId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void updatePhone(Player player) {
		try {
			connect();

			// SQL
			String update = "UPDATE player SET player_phone = ? WHERE player_id = ?";
			pstmt = conn.prepareStatement(update);

			pstmt.setString(1, player.getPlayerPhone());
			pstmt.setInt(2, player.getPlayerId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void updateProgress(Player player) {
		try {
			connect();

			// SQL
			String update = "UPDATE player SET player_progress = ? WHERE player_id = ?";
			pstmt = conn.prepareStatement(update);

			pstmt.setInt(1, player.getPlayerProgress());
			pstmt.setInt(2, player.getPlayerId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void updateRank(Player player) {
		try {
			connect();

			// SQL
			String update = "UPDATE player SET player_rank = ? WHERE player_id = ?";
			pstmt = conn.prepareStatement(update);

			pstmt.setString(1, player.getPlayerRank());
			pstmt.setInt(2, player.getPlayerId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public Player inputForPlayerLogin() {
		Player player = new Player();
		player = new Player();
		Scanner sc = new Scanner(System.in);
		sc = new Scanner(System.in);
		System.out.print("회원 아이디 >> ");
		player.setPlayerId(sc.nextInt());
		System.out.print("회원 비밀번호 >> ");
		player.setPlayerPwd(sc.next());
		return player;
	}

	@Override
	public Player inputForPlayerName() {
		Player player = new Player();
		player = new Player();
		Scanner sc = new Scanner(System.in);
		sc = new Scanner(System.in);
		System.out.print("회원 아이디 >> ");
		player.setPlayerId(sc.nextInt());
		System.out.print("변경할 이름 >> ");
		player.setPlayerName(sc.next());
		return player;
	}

	@Override
	public Player inputForPlayerPwd() {
		Player player = new Player();
		player = new Player();
		Scanner sc = new Scanner(System.in);
		sc = new Scanner(System.in);
		System.out.print("회원 아이디 >> ");
		player.setPlayerId(sc.nextInt());
		System.out.print("변경할 비밀번호 >> ");
		player.setPlayerPwd(sc.next());
		return player;
	}

	@Override
	public Player inputForPlayerPhone() {
		Player player = new Player();
		player = new Player();
		Scanner sc = new Scanner(System.in);
		sc = new Scanner(System.in);
		System.out.print("회원 아이디 >> ");
		player.setPlayerId(sc.nextInt());
		System.out.print("변경할 전화번호 >> ");
		player.setPlayerPhone(sc.next());
		return player;
	}

	@Override
	public Player inputForPlayerProgress() {
		Player player = new Player();
		player = new Player();
		Scanner sc = new Scanner(System.in);
		sc = new Scanner(System.in);
		System.out.print("회원 아이디 >> ");
		player.setPlayerId(sc.nextInt());
		System.out.print("변경할 진행도 >> ");
		player.setPlayerProgress(sc.nextInt());
		return player;
	}

	@Override
	public Player inputForPlayerRank() {
		Player player = new Player();
		player = new Player();
		Scanner sc = new Scanner(System.in);
		sc = new Scanner(System.in);
		System.out.print("회원 아이디 >> ");
		player.setPlayerId(sc.nextInt());
		System.out.print("변경할 등급 >> ");
		player.setPlayerRank(sc.next());
		return player;
	}

}
