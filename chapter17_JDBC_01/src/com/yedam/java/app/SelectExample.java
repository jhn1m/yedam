package com.yedam.java.app;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. JDBC 드라이버 로딩하기
		String driver = "oracle.jdbc.driver.OracleDriver";
		Class.forName(driver);

		// 2. DBMS 서버와 접속하기
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String pwd = "hr";

		Connection conn = DriverManager.getConnection(url, id, pwd);

		// 3. Statement 또는 PreparedStatement 객체 생성하기
		Statement stmt = conn.createStatement();

		// 4. SQL문 실행
		ResultSet rs = stmt.executeQuery("SELECT * FROM employees");

		while (rs.next()) {
			String name = rs.getString("first_name") + " " + rs.getString("last_name");
			System.out.println("이름 : " + name);
		}

		// 5. 자원을 해제하기
		// 닫을때는 역순으로 진행
		if (rs != null)
			rs.close();

		if (stmt != null)
			stmt.close();

		if (conn != null)
			conn.close();

	}
}