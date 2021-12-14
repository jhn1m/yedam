package com.yedam.java.app;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLExample2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// DB 서버 접속
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

		// INSERT
		// Statement OR PreparedStatement 객체 생성
		String insert = "INSERT INTO departments VALUES(?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(insert);

		pstmt.setInt(1, 1000);
		pstmt.setString(2, "Account");
		pstmt.setInt(3, 205);
		pstmt.setInt(4, 1700);

		// SQL문 실행
		int result = pstmt.executeUpdate();

		// 결과값 연산
		System.out.println("INSERT 결과 : " + result);

		// UPDATE
		// Statement OR PreparedStatement 객체 생성
		String update = "UPDATE departments SET location_id = ? WHERE department_id = ?";
		pstmt = conn.prepareStatement(update);

		pstmt.setInt(1, 1000);
		pstmt.setInt(2, 2000);

		// SQL문 실행
		result = pstmt.executeUpdate();

		// 결과값 연산
		System.out.println("UPDATE 결과 : " + result);

		// SELECT
		// Statement OR PreparedStatement 객체 생성
		String select = "SELECT * FROM departments ORDER BY department_id";
		Statement stmt = conn.createStatement();

		// SQL문 실행
		ResultSet rs = stmt.executeQuery(select);
		while (rs.next()) {
			String info = "| 부서 아이디 : " + rs.getInt("department_id") + " | 부서 이름 : " + rs.getString("department_name")
					+ " | 매니저 아이디 : " + rs.getInt("manager_id") + " | 지역 아이디 : " + rs.getInt("location_id") + " |";
			System.out.println(info);
		}

		// DELETE
		// Statement OR PreparedStatement 객체 생성
		String delete = "DELETE FROM departments WHERE department_id = ?";
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
			conn.close();

		if (conn != null)
			pstmt.close();

	}

}