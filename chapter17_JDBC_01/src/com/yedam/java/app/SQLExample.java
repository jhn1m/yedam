package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// JDBC 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// DB 서버 접속
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

		// ----------------------------------INSERT
		// Statement OR PreparedStatement 객체 생성
		// SQL문 실행
		String insert = "INSERT INTO employees VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(insert);
		pstmt.setInt(1, 1001);
		pstmt.setString(2, "ROW-WDLSg");
		pstmt.setString(3, "KING");
		pstmt.setString(4, "DSADWSng@google.com");
		pstmt.setString(5, "82.10.1234.1234");
		pstmt.setString(6, "21/11/05");
		pstmt.setString(7, "SA_REP");
		pstmt.setInt(8, 6000);
		pstmt.setDouble(9, 0.15);
		pstmt.setInt(10, 149);
		pstmt.setInt(11, 80);

		int result = pstmt.executeUpdate();
		System.out.println("INSERT 결과 : " + result);

		// ----------------------------------UPDATE
		// Statement OR PreparedStatement 객체 생성

		// SQL문 실행
		String update = "UPDATE employees SET last_name = ? WHERE employee_id = ?";
		pstmt = conn.prepareStatement(update);
		pstmt.setString(1, "Kang");
		pstmt.setInt(2, 1000);

		result = pstmt.executeUpdate();
		System.out.println("UPDATE 결과 : " + result);

		// ----------------------------------SELECT
		// ?가 들어가지 않으므로 그냥 Statement를 사용해도 무관

		// SQL문 실행
		String select = "SELECT * FROM employees ORDER BY employee_id";

		// Statement OR PreparedStatement 객체 생성
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(select);

		while (rs.next()) {
			String name = rs.getString("first_name") + " " + rs.getString("last_name");
			System.out.println("이름 : " + name);
		}

		// ----------------------------------DELETE
		// SQL문 실행
		String sql = "DELETE FROM employees WHERE employee_id = ?";

		// Statement OR PreparedStatement 객체 생성
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 1000);

		result = pstmt.executeUpdate();
		System.out.println("DELETE 결과 : " + result);

		// 5. 자원 해제
		if (rs != null)
			rs.close();

		if (stmt != null)
			stmt.close();

		if (conn != null)
			conn.close();

		if (pstmt != null)
			pstmt.close();
	}
}
