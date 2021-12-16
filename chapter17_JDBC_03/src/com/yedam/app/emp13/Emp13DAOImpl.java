package com.yedam.app.emp13;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.app.common.DAO;

public class Emp13DAOImpl extends DAO implements Emp13DAO {

	// 싱글톤
	private static Emp13DAO instance = new Emp13DAOImpl();

	private Emp13DAOImpl() {
	}

	public static Emp13DAO getInstance() {
//		if (instance == null) {
//			instance = new EmpDAO();
//		}
		return instance;
	}

	@Override
	public List<Emp13> selectAll() {
		List<Emp13> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();

			// SQL
			rs = stmt.executeQuery("SELECT * FROM emp13");

			// RESULT
			while (rs.next()) {
				Emp13 emp13 = new Emp13();
				emp13.setEmployeeId(rs.getInt("employee_id"));
				emp13.setLastName(rs.getString("last_name"));
				emp13.setJobId(rs.getString("job_id"));
				emp13.setSalary(rs.getDouble("salary"));
				emp13.setCommissionPct(rs.getDouble("commission_pct"));
				emp13.setDepartmentId(rs.getInt("department_id"));
				list.add(emp13);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	@Override
	public Emp13 selectOne(int employeeId) {
		Emp13 emp13 = new Emp13();
		try {
			connect();
			stmt = conn.createStatement();

			// SQL
			String select = "SELECT * FROM emp13 WHERE employee_id = " + employeeId;
			rs = stmt.executeQuery(select);
			while (rs.next()) {
				emp13.setEmployeeId(rs.getInt("employee_id"));
				emp13.setLastName(rs.getString("last_name"));
				emp13.setJobId(rs.getString("job_id"));
				emp13.setSalary(rs.getDouble("salary"));
				emp13.setCommissionPct(rs.getDouble("commission_pct"));
				emp13.setDepartmentId(rs.getInt("department_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return emp13;
	}

	@Override
	public void insert(Emp13 emp13) {
		try {
			connect();

			// SQL
			String insert = "INSERT INTO emp13 VALUES(?, ?, ?, ?, ?, ?)";

			pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1, emp13.getEmployeeId());
			pstmt.setString(2, emp13.getLastName());
			pstmt.setString(3, emp13.getJobId());
			pstmt.setDouble(4, emp13.getSalary());
			pstmt.setDouble(5, emp13.getCommissionPct());
			pstmt.setInt(6, emp13.getDepartmentId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 등록되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void update(Emp13 emp13) {
		try {
			connect();

			// SQL
			String update = "UPDATE emp13 SET last_name = ? WHERE employee_id = ?";
			pstmt = conn.prepareStatement(update);

			pstmt.setString(1, emp13.getLastName());
			pstmt.setInt(2, emp13.getEmployeeId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void delete(int employeeId) {
		try {
			connect();

			// SQL
			String delete = "DELETE FROM emp13 WHERE employee_id = ?";
			pstmt = conn.prepareStatement(delete);

			pstmt.setInt(1, employeeId);

			int result = pstmt.executeUpdate();
			System.out.println(result + "건이 삭제되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
