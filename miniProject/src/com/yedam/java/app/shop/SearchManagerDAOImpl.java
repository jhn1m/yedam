package com.yedam.java.app.shop;

import java.sql.SQLException;
import com.yedam.app.common.DAO;

public class SearchManagerDAOImpl extends DAO implements SearchManagerDAO {

	private static SearchManagerDAOImpl instance = new SearchManagerDAOImpl();

	private SearchManagerDAOImpl() {
	}

	public static SearchManagerDAOImpl getInstance() {
		return instance;
	}

	@Override
	public SearchManager selectOneWithManager(int shopId) {
		SearchManager sm = null;
		try {
			connect();
			stmt = conn.createStatement();

			// SQL
//			String select = "SELECT m.manager_id, m.manager_name, s.shop_name FROM shop s JOIN manager m ON s.shop_id = m.shop_id WHERE s.shop_id = "
//					+ shopId;

			String select = "SELECT m.manager_id, m.manager_name, s.shop_name FROM shop s, manager m WHERE s.shop_id = m.shop_id AND s.shop_id = "
					+ shopId;

			rs = stmt.executeQuery(select);
			while (rs.next()) {
				sm = new SearchManager();
				sm.setManagerId(rs.getInt("manager_id"));
				sm.setManagerName(rs.getString("manager_name"));
				sm.setShopName(rs.getString("shop_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return sm;
	}
}