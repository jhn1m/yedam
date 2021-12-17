package com.yedam.java.app.manager;

public class Manager {
	private int managerId;
	private String managerName;
	private String managerPwd;
	private int shopId;

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

	public String getManagerPwd() {
		return managerPwd;
	}

	public void setManagerPwd(String managegPwd) {
		this.managerPwd = managegPwd;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", managerPwd=" + managerPwd
				+ ", shopId = " + shopId + "]";
	}

}
