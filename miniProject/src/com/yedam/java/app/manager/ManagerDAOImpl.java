package com.yedam.java.app.manager;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
			String insert = "INSERT INTO manager VALUES(?, ?, ?)";

			pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1, manager.getManagerId());
			pstmt.setString(2, manager.getManagerName());
			pstmt.setString(3, manager.getManagerPwd());

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

}
