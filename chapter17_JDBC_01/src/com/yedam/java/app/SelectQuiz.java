package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuiz {
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
		String sql = "" + "SELECT * " + "FROM employees e " + "JOIN departments d "
				+ "ON e.department_id = d.department_id " + "WHERE d.department_name LIKE 'IT' AND e.salary <= 10000";

		ResultSet rs = stmt.executeQuery(sql);
		System.out.println("부서 이름이 'IT'이며 연봉이 10,000이하인 직원의 LAST NAME 목록\n");
		// if(rs == null){
		// System.out.println("해당 조건에 만족하는 자료가 없습니다.");
		// }

		if (rs.isBeforeFirst()) {
			while (rs.next()) {
				String name = rs.getString("last_name");
				System.out.println("이름 : " + name);
			}
		} else {
			System.out.println("해당 조건에 만족하는 자료가 없다");
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