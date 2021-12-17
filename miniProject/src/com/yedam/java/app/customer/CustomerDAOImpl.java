package com.yedam.java.app.customer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.app.common.DAO;
import com.yedam.java.app.customer.CustomerDAOImpl;

public class CustomerDAOImpl extends DAO implements CustomerDAO {

	private static CustomerDAOImpl instance = new CustomerDAOImpl();

	private CustomerDAOImpl() {
	}

	public static CustomerDAOImpl getInstance() {
//			if (instance == null) {
//				instance = new EmpDAO();
//			}
		return instance;
	}

	@Override
	public List<Customer> selectAll() {
		List<Customer> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();

			// SQL
			rs = stmt.executeQuery("SELECT * FROM customer");

			// RESULT
			while (rs.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(rs.getInt("customer_id"));
				customer.setCustomerName(rs.getString("customer_name"));
				customer.setCustomerPwd(rs.getString("customer_pwd"));
				list.add(customer);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	@Override
	public Customer selectOne(int customerId) {
		Customer customer = new Customer();
		try {
			connect();
			stmt = conn.createStatement();

			// SQL
			String select = "SELECT * FROM customer WHERE customer_id = " + customerId;
			rs = stmt.executeQuery(select);
			while (rs.next()) {
				customer.setCustomerId(rs.getInt("customer_id"));
				customer.setCustomerName(rs.getString("customer_name"));
				customer.setCustomerPwd(rs.getString("customer_pwd"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return customer;
	}

	@Override
	public void insert(Customer customer) {
		try {
			connect();

			// SQL
			String insert = "INSERT INTO customer VALUES(?, ?, ?)";

			pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1, customer.getCustomerId());
			pstmt.setString(2, customer.getCustomerName());
			pstmt.setString(3, customer.getCustomerPwd());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 등록되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void updateAll(Customer customer) {
		try {
			connect();

			// SQL
			String update = "UPDATE customer SET customer_id = ?, customer_name = ?, customer_pwd = ? WHERE customer_id = ?";
			pstmt = conn.prepareStatement(update);

			pstmt.setInt(1, customer.getCustomerId());
			pstmt.setString(2, customer.getCustomerName());
			pstmt.setString(3, customer.getCustomerPwd());
			pstmt.setInt(4, customer.getCustomerId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void updateName(Customer customer) {
		try {
			connect();

			// SQL
			String update = "UPDATE customer SET customer_name = ? WHERE customer_id = ?";
			pstmt = conn.prepareStatement(update);

			pstmt.setString(1, customer.getCustomerName());
			pstmt.setInt(2, customer.getCustomerId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void updatePwd(Customer customer) {
		try {
			connect();

			// SQL
			String update = "UPDATE customer SET customer_pwd = ? WHERE customer_id = ?";
			pstmt = conn.prepareStatement(update);

			pstmt.setString(1, customer.getCustomerPwd());
			pstmt.setInt(2, customer.getCustomerId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void delete(int customerId) {
		try {
			connect();

			// SQL
			String delete = "DELETE FROM customer WHERE customer_id = ?";
			pstmt = conn.prepareStatement(delete);

			pstmt.setInt(1, customerId);

			int result = pstmt.executeUpdate();
			System.out.println(result + "건이 삭제되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
