package com.yedam.java.app.manager;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.app.common.DAO;

public class ManagerDAOImpl extends DAO implements ManagerDAO {

	// 싱글톤
	private static ManagerDAOImpl instance = new ManagerDAOImpl();

	private ManagerDAOImpl() {
	}

	public static ManagerDAOImpl getInstance() {
//			if (instance == null) {
//				instance = new EmpDAO();
//			}
		return instance;
	}

	@Override
	public List<Manager> selectAll() {
		List<Manager> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();

			// SQL
			rs = stmt.executeQuery("SELECT * FROM manager");

			// RESULT
			while (rs.next()) {
				Manager manager = new Manager();
				manager.setManagerId(rs.getInt("manager_id"));
				manager.setManagerName(rs.getString("manager_name"));
				manager.setManagerPwd(rs.getString("manager_pwd"));
				list.add(manager);
			}

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
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return manager;
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
			pstmt.setInt(4, manager.getShopId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 등록되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void updateAll(Manager manager) {
		try {
			connect();

			// SQL
			String update = "UPDATE manager SET manager_id = ?, manager_name = ?, manager_pwd = ? WHERE manager_id = ?";
			pstmt = conn.prepareStatement(update);

			pstmt.setInt(1, manager.getManagerId());
			pstmt.setString(2, manager.getManagerName());
			pstmt.setString(3, manager.getManagerPwd());
			pstmt.setInt(4, manager.getManagerId());

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
				manager.setShopId(rs.getInt("shop_id"));
				System.out.println(manager.getManagerName() + " 님 환영합니다.");
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
	public void login() {
		System.out.println("-------------------------------------");
		System.out.println("| 1. 로그인 | 2. 회원가입 | 9. 종료 |");
		System.out.println("-------------------------------------");
		System.out.print("선택 >> ");
	}

	@Override
	public void menuPrint() {
		System.out.println("---------------------------------------------------------------------");
		System.out.println("| 1. 등록 | 2. 수정 | 3. 삭제 | 4. 개별조회 | 5. 전체조회 | 9. 종료 |");
		System.out.println("---------------------------------------------------------------------");
		System.out.print("선택 >> ");
	}

	@Override
	public void updateMenuPrint() {
		System.out.println("----------------------------------------------");
		System.out.println("수정을 선택하셨습니다. 수정 메뉴를 선택하세요.");
		System.out.println("----------------------------------------------\n");
		System.out.println("-------------------------------------------------------------");
		System.out.println("| 1. 전체수정 | 2. 이름만 수정 | 3. 비밀번호 수정 | 9. 취소 |");
		System.out.println("-------------------------------------------------------------");
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
	public void loginCheck() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertManager() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateManager() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAllManager() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateNameManager() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePwdManager() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteManager() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectOne() {
		// TODO Auto-generated method stub

	}

	@Override
	public void end() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancle() {
		// TODO Auto-generated method stub

	}

	@Override
	public Manager inputAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Manager inputForLogin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Manager inputForName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Manager inputForPwd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int inputManagerId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
