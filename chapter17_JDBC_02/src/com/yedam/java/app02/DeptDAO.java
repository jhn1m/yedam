package com.yedam.java.app02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {
	// 필드 - Oracle DB 정보, 각 메서드에서 공통 사용 변수
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	String connectedId = "hr";
	String connectedPwd = "hr";

	// 각 메서드에서 공통적으로 사용하는 필드
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	// 싱글톤
	private static DeptDAO instance = null;

	private DeptDAO() {
	}

	public static DeptDAO getInstance() {
		if (instance == null) {
			instance = new DeptDAO();
		}
		return instance;
	}

	// 메서드

	// JDBC DRIVER LOADING, DBCONN
	public void connect() {
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, connectedId, connectedPwd);
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로딩에 실패했습니다.");
		} catch (SQLException e) {
			System.out.println("DB 서버 접속에 실패했습니다.");
		}
	}

	// Statement OR PreparedStatement 객체 생성 // SQL
	// 연산

	// 자원해제
	public void disconnect() {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 전체 조회
	public List<Dept> selectAll() {
		List<Dept> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();

			// SQL
			rs = stmt.executeQuery("SELECT * FROM dept_test_vu");

			// RESULT
			while (rs.next()) {
				Dept dept = new Dept();
				dept.setDepartmentId(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
				dept.setLastName(rs.getString("last_name"));
				dept.setCity(rs.getString("city"));
				
				list.add(dept);
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;

	}

	// 단건조회
	public Dept selectOne(int departmentId) {
		Dept dept = new Dept();
		try {
			connect();
			stmt = conn.createStatement();

			// SQL
			String select = "SELECT * FROM dept_test_vu WHERE department_id = " + departmentId;
			rs = stmt.executeQuery(select);

			while (rs.next()) {
				dept.setDepartmentId(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
				dept.setLastName(rs.getString("last_name"));
				dept.setCity(rs.getString("city"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return dept;
	}

	// 입력
	public void insert(Dept dept) {
		try {
			connect();

			// SQL
			String insert = "INSERT INTO departments VALUES(?, ?, (SELECT employee_id FROM employees WHERE last_name = ?), (SELECT location_id FROM locations WHERE city = ?))";

			pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1, dept.getDepartmentId());
			pstmt.setString(2, dept.getDepartmentName());
			pstmt.setString(3, dept.getLastName());
			pstmt.setString(4, dept.getCity());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 등록되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	// 수정
	public void update(Dept dept) {
		try {
			connect();

			// SQL
			String update = "UPDATE departments SET manager_id = (SELECT employee_id FROM employees WHERE last_name = ?) WHERE department_id = ?";
			pstmt = conn.prepareStatement(update);

			pstmt.setString(1, dept.getLastName());
			pstmt.setInt(2, dept.getDepartmentId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public void delete(int departmentId) {
		try {
			connect();

			// SQL
			String delete = "DELETE FROM departments WHERE department_id = ?";
			pstmt = conn.prepareStatement(delete);

			pstmt.setInt(1, departmentId);

			int result = pstmt.executeUpdate();
			System.out.println(result + "건이 삭제되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
