package player;

public class Player {
    private int playerId;
    private String playerName;
    private String playerPwd;
    private String playerPhone;
    private int playerProgress;
    private String playerRank;

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

}
