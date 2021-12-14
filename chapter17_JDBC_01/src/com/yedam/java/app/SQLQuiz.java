package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLQuiz {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// DB 서버 접속
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

		// INSERT
		// Statement OR PreparedStatement 객체 생성
		String insert = "INSERT INTO emp13 VALUES(?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(insert);

		pstmt.setInt(1, 1000);
		pstmt.setString(2, "Johnson");
		pstmt.setString(3, "SA_MAN");
		pstmt.setInt(4, 9999);
		pstmt.setDouble(5, 0.5);
		pstmt.setInt(6, 80);

		// SQL문 실행
		int result = pstmt.executeUpdate();

		// 결과값 연산
		System.out.println("INSERT 결과 : " + result);

		// UPDATE
		// Statement OR PreparedStatement 객체 생성
		String update = "UPDATE EMP13 SET employee_id = ? WHERE department_id = ?";
		pstmt = conn.prepareStatement(update);

		pstmt.setInt(1, 1000);
		pstmt.setInt(2, 2000);

		// SQL문 실행
		result = pstmt.executeUpdate();

		// 결과값 연산
		System.out.println("UPDATE 결과 : " + result);

		// SELECT
		// Statement OR PreparedStatement 객체 생성
		String select = "SELECT * FROM EMP13 ORDER BY employee_id";
		Statement stmt = conn.createStatement();

		// SQL문 실행
		ResultSet rs = stmt.executeQuery(select);
		while (rs.next()) {
			String info = "| 직원번호 : " + rs.getInt("employee_id") + " | 이름 : " + rs.getString("last_name")
					+ " | 직업 아이디 : " + rs.getString("job_id") + " | 급여 : " + rs.getInt("salary") + " | 보너스 : "
					+ rs.getDouble("commission_pct") + "% | 부서 아이디 : " + rs.getInt("department_id");
			System.out.println(info);
		}

		// DELETE
		// Statement OR PreparedStatement 객체 생성
		String delete = "DELETE FROM EMP13 WHERE employee_id = ?";
		pstmt = conn.prepareStatement(delete);
		pstmt.setInt(1, 1000);

		// SQL문 실행
		result = pstmt.executeUpdate();

		// 결과값 연산
		System.out.println("DELETE 결과 : " + result);

		// 자원 해제
		if (rs != null)
			rs.close();

		if (stmt != null)
			stmt.close();

		if (pstmt != null)
			pstmt.close();

		if (conn != null)
			conn.close();
	}
}
