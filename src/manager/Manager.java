package manager;

public class Manager {
	private int managerId;
	private String managerName;
	private String managerPwd;
	private String managerPhone;
	private int playerId;
	private String playerName;
	private String playerPwd;
	private String playerPhone;
	private int playerProgress;
	private String playerRank;

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

	public String getManagerPhone() {
		return managerPhone;
	}

	public void setManagerPhone(String managerPhone) {
		this.managerPhone = managerPhone;
	}

	public String getManagerPwd() {
		return managerPwd;
	}

	public void setManagerPwd(String managerPwd) {
		this.managerPwd = managerPwd;
	}

	public int getPlayerId() {
		return playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public String getPlayerPhone() {
		return playerPhone;
	}

	public int getPlayerProgress() {
		return playerProgress;
	}

	public String getPlayerPwd() {
		return playerPwd;
	}

	public String getPlayerRank() {
		return playerRank;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public void setPlayerPhone(String playerPhone) {
		this.playerPhone = playerPhone;
	}

	public void setPlayerProgress(int playerProgress) {
		this.playerProgress = playerProgress;
	}

	public void setPlayerPwd(String playerPwd) {
		this.playerPwd = playerPwd;
	}

	public void setPlayerRank(String playerRank) {
		this.playerRank = playerRank;
	}

	@Override
	public String toString() {
		return "managerId = " + managerId + " managerName = " + managerName + " managerPwd = " + managerPwd
				+ " managerPhone = " + managerPhone + "\n";
	}
}