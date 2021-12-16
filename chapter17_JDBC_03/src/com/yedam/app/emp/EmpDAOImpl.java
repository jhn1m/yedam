package com.yedam.app.emp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.app.common.DAO;

public class EmpDAOImpl extends DAO implements EmpDAO {

	// 싱글톤
	private static EmpDAO instance = new EmpDAOImpl();

	private EmpDAOImpl() {
	}

	public static EmpDAO getInstance() {
//		if (instance == null) {
//			instance = new EmpDAO();
//		}
		return instance;
	}

	@Override
	public List<Emp> selectAll() {
		List<Emp> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();

			// SQL
			rs = stmt.executeQuery("SELECT * FROM emp13");

			// RESULT
			while (rs.next()) {
				Emp emp = new Emp();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHire_date(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));
				list.add(emp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	@Override
	public Emp selectOne(int employeeId) {
		Emp emp = new Emp();
		try {
			connect();
			stmt = conn.createStatement();

			// SQL
			String select = "SELECT * FROM emp13 WHERE employee_id = " + employeeId;
			rs = stmt.executeQuery(select);
			while (rs.next()) {
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHire_date(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return emp;
	}

	@Override
	public void insert(Emp emp) {
		try {
			connect();

			// SQL
			String insert = "INSERT INTO employees VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			pstmt = conn.prepareStatement(insert);
//			pstmt.setInt(1, emp.getEmployeeId());
//			pstmt.setString(2, emp.getLastName());
//			pstmt.setString(3, emp.getJobId());
//			pstmt.setDouble(4, emp.getSalary());
//			pstmt.setDouble(5, emp.getCommissionPct());
//			pstmt.setInt(6, emp.getDepartmentId());
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getFirstName());
			pstmt.setString(3, emp.getLastName());
			pstmt.setString(4, emp.getEmail());
			pstmt.setString(5, emp.getPhoneNumber());
			pstmt.setDate(6, emp.getHire_date());
			pstmt.setString(7, emp.getJobId());
			pstmt.setDouble(8, emp.getSalary());
			pstmt.setDouble(9, emp.getCommissionPct());
			pstmt.setInt(10, emp.getManagerId());
			pstmt.setInt(11, emp.getDepartmentId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 등록되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void update(Emp emp) {
		try {
			connect();

			// SQL
			String update = "UPDATE employees SET salary = ? WHERE employee_id = ?";
			pstmt = conn.prepareStatement(update);

			pstmt.setDouble(1, emp.getSalary());
			pstmt.setInt(2, emp.getEmployeeId());

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
