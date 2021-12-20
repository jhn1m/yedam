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
	public void menuPrint() {
		System.out.println("---------------------------------------------------------------------");
		System.out.println("| 1. 등록 | 2. 수정 | 3. 삭제 | 4. 개별조회 | 5. 전체조회 | 9. 종료 |");
		System.out.println("---------------------------------------------------------------------");
		System.out.print("선택 >> ");
		int menuNo = menuSelect();
		if (menuNo == 1) {
			insertManager();
		} else if (menuNo == 2) {
			updateMenuPrint();
			menuSelect();
			updateManager();
		} else if (menuNo == 3) {
			deleteManager();
		} else if (menuNo == 4) {
			selectOne();
		} else if (menuNo == 5) {
			selectAll();
		} else if (menuNo == 9) {
			end();
			return;
		}
	}

	@Override
	public void loginMenuPrint() {
		System.out.println("-------------------------------------");
		System.out.println("| 1. 로그인 | 2. 회원가입 | 9. 종료 |");
		System.out.println("-------------------------------------");
		System.out.print("선택 >> ");
	}

	@Override
	public void updateMenuPrint() {
		System.out.println("----------------------------------------------");
		System.out.println("수정을 선택하셨습니다. 수정 메뉴를 선택하세요.");
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
	public void loginCheck() {
		Manager manager = inputForLogin();
		loginCheck(manager);
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
		System.out.println("현재 비밀번호 >> ");
		checker2(sc.next());
		System.out.print("변경할 비밀번호 >> ");
		manager.setManagerPwd(sc.next());
		return manager;
	}

//	public String checker() {
//		Manager manager = new Manager();
//		connect();
//		Scanner sc = new Scanner(System.in);
//		String sql1 = "SELECT * FROM manager";
//		try {
//			rs = stmt.executeQuery(sql1);
//			while (rs.next()) {
//				manager.setManagerId(rs.getInt("manager_id"));
//				manager.setManagerName(rs.getString("manager_name"));
//				manager.setManagerPwd(rs.getString("manager_pwd"));
//				manager.setManagerPhone(rs.getString("manager_phone"));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			disconnect();
//		}
//		String m1 = manager.getManagerPwd();
//		checker2();
//		return m1;
//	}

	public void checker2(String chk) {
		Manager manager = new Manager();
		connect();
		Scanner sc = new Scanner(System.in);
		String sql1 = "SELECT * FROM manager WHERE manager_pwd = '" + chk + "'";
		try {
			rs = stmt.executeQuery(sql1);
			if (rs.next()) {
				while (rs.next()) {
					manager.setManagerId(rs.getInt("manager_id"));
					manager.setManagerName(rs.getString("manager_name"));
					manager.setManagerPwd(rs.getString("manager_pwd"));
					manager.setManagerPhone(rs.getString("manager_phone"));
				}
			} else {
				System.out.println("없는 정보입니다.");
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
		System.out.print("매니저 번호>> ");
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
			updatePwdManager();
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

			rs = stmt.executeQuery("SELECT * FROM manager");
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

}
