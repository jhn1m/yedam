package com.yedam.java.app.shop;

public class SearchManager {
	private int managerId;
	private String managerName;
	private String shopName;

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	@Override
	public String toString() {
		return "SearchManager [managerId=" + managerId + ", managerName=" + managerName + ", shopName=" + shopName
				+ "]";
	}

}
