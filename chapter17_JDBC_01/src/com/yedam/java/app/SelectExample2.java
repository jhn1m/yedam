package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectExample2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. JDBC 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2. DBMS 서버와 접속하기
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String pwd = "hr";

		Connection conn = DriverManager.getConnection(url, id, pwd);

		// 3. Statement 또는 PreparedStatement 객체 생성하기
		String sql = "SELECT * FROM employees WHERE salary BETWEEN 2000 AND 10000";
		PreparedStatement pstmt = conn.prepareStatement(sql);

		// 4. SQL문 실행
		ResultSet rs = pstmt.executeQuery();

		// 5. 결과값 연산
		while (rs.next()) {
			String name = rs.getString("first_name");
			int income = (int) (rs.getInt("salary") * 1.1);
			System.out.println("--" + name + "-- 의 10% 인상된 급여 : " + income + "$");
		}

		// 6. 자원 해제
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
	}
}