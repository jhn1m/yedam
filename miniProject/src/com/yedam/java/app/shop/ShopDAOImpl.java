package com.yedam.java.app.shop;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.app.common.DAO;
import com.yedam.java.app.manager.Manager;

public class ShopDAOImpl extends DAO implements ShopDAO {

	private static ShopDAOImpl instance = new ShopDAOImpl();

	private ShopDAOImpl() {
	}

	public static ShopDAOImpl getInstance() {
		return instance;
	}

	@Override
	public List<Shop> selectAll() {
		List<Shop> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();

			// SQL
			rs = stmt.executeQuery("SELECT * FROM shop");

			// RESULT
			while (rs.next()) {
				Shop shop = new Shop();
				shop.setShopId(rs.getInt("shop_id"));
				shop.setShopName(rs.getString("shop_name"));
				shop.setShopLocation(rs.getString("shop_location"));
				list.add(shop);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	@Override
	public Shop selectOne(int shopId) {
		Shop shop = new Shop();
		try {
			connect();
			stmt = conn.createStatement();

			// SQL
			String select = "SELECT * FROM shop WHERE shop_id = " + shopId;
			rs = stmt.executeQuery(select);
			while (rs.next()) {
				shop.setShopId(rs.getInt("shop_id"));
				shop.setShopName(rs.getString("shop_name"));
				shop.setShopLocation(rs.getString("shop_location"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return shop;
	}

//	@Override
//	public Shop selectOneWithManager(int shopId) {
//		SearchManager sm = new SearchManager();
//		try {
//			connect();
//			stmt = conn.createStatement();
//
//			// SQL
////			String select = "SELECT m.manager_id, m.manager_name, s.shop_name FROM shop s JOIN manager m ON s.shop_id = m.shop_id WHERE s.shop_id = "
////					+ shopId;
//
//			String select = "SELECT m.manager_id, m.manager_name, s.shop_name FROM shop s, manager m WHERE s.shop_id = m.shop_id AND s.shop_id = "
//					+ shopId;
//
//			rs = stmt.executeQuery(select);
//			while (rs.next()) {
//				sm.setManagerId(rs.getInt("manager_id"));
//				sm.setManagerName(rs.getString("manager_name"));
//				sm.setShopName(rs.getString("shop_name"));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			disconnect();
//		}
//		return sm;
//	}

	@Override
	public void insert(Shop shop) {
		try {
			connect();

			// SQL
			String insert = "INSERT INTO Shop VALUES(?, ?, ?)";

			pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1, shop.getShopId());
			pstmt.setString(2, shop.getShopName());
			pstmt.setString(3, shop.getShopLocation());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 등록되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void updateAll(Shop shop) {
		try {
			connect();

			// SQL
			String update = "UPDATE Shop SET shop_id = ?, shop_name = ?, shop_location = ? WHERE Shop_id = ?";
			pstmt = conn.prepareStatement(update);

			pstmt.setInt(1, shop.getShopId());
			pstmt.setString(2, shop.getShopName());
			pstmt.setString(3, shop.getShopLocation());
			pstmt.setInt(4, shop.getShopId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void updateShopName(Shop shop) {
		try {
			connect();

			// SQL
			String update = "UPDATE shop SET shop_name = ? WHERE shop_id = ?";
			pstmt = conn.prepareStatement(update);

			pstmt.setString(1, shop.getShopName());
			pstmt.setInt(2, shop.getShopId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void updateLocation(Shop shop) {
		try {
			connect();

			// SQL
			String update = "UPDATE Shop SET shop_location = ? WHERE Shop_id = ?";
			pstmt = conn.prepareStatement(update);

			pstmt.setString(1, shop.getShopLocation());
			pstmt.setInt(2, shop.getShopId());

			int result = pstmt.executeUpdate();

			System.out.println(result + "건이 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void delete(int shopId) {
		try {
			connect();

			// SQL
			String delete = "DELETE FROM shop WHERE Shop_id = ?";
			pstmt = conn.prepareStatement(delete);

			pstmt.setInt(1, shopId);

			int result = pstmt.executeUpdate();
			System.out.println(result + "건이 삭제되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public Shop selectOneWithManager(int shopId) {
		// TODO Auto-generated method stub
		return null;
	}

}
