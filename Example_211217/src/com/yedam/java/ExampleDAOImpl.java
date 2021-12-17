package com.yedam.java;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.app.DAO;

public class ExampleDAOImpl extends DAO implements ExampleDAO {
	// 싱글톤
	private static ExampleDAO instance = new ExampleDAOImpl();

	private ExampleDAOImpl() {
	}

	public static ExampleDAO getInstance() {
		return instance;
	}

	@Override
	public List<Example> select1() {
		List<Example> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();

			// SQL
			rs = stmt.executeQuery(
					"SELECT employee_id, first_name, email, salary FROM employees WHERE salary BETWEEN 5000 AND 10000");

			// RESULT
			while (rs.next()) {
				Example example = new Example();
				example.setEmployeeId(rs.getInt("employee_id"));
				example.setFirstName(rs.getString("first_name"));
				example.setEmail(rs.getString("email"));
				example.setSalary(rs.getDouble("salary"));
				list.add(example);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;

	}

	@Override
	public List<Example> select2() {
		List<Example> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();

			// SQL
			rs = stmt.executeQuery("SELECT MAX(salary) AS t1 FROM employees WHERE job_id = 'ST_CLERK'");

			// RESULT
			while (rs.next()) {
				Example example = new Example();
				example.setSalary(rs.getInt("t1"));
				list.add(example);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	@Override
	public List<Example> select3() {
		List<Example> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();

			// SQL
			rs = stmt.executeQuery(
					"SELECT ROUND(AVG(salary), 2) AS r1 FROM employees WHERE TO_CHAR(hire_date,'MM') = '05'");

			// RESULT
			while (rs.next()) {
				Example example = new Example();
				example.setSalary(rs.getDouble("r1"));
				list.add(example);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	@Override
	public List<Example> select4() {
		List<Example> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();

			// SQL
			rs = stmt.executeQuery(
					"SELECT employee_id, first_name, email, salary FROM employees WHERE job_id = 'SA_REP' AND salary >= 10000");

			// RESULT
			while (rs.next()) {
				Example example = new Example();
				example.setEmployeeId(rs.getInt("employee_id"));
				example.setFirstName(rs.getString("first_name"));
				example.setEmail(rs.getString("email"));
				example.setSalary(rs.getDouble("salary"));
				list.add(example);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

}
