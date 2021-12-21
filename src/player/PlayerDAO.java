package player;

public interface PlayerDAO {
    // 메뉴관련

    void menuPrint();

    void loginMenuPrint();

    void updateMenuPrint();

    int menuSelect();

    void end();

    void cancle();

    // 로그인 체크
    Player loginCheck(Player loginInfo);

    void loginCheck();

    // 입력
    void insert(Player player);

    void insertPlayer();

    Player inputAll();

    Player inputForLogin();

    Player inputForName();

    Player inputForPwd();

    Player inputForPhone();

    int inputPlayerId();

    // 수정

    void updatePlayer();

    void updateAllPlayer();

    void updateNamePlayer();

    void updatePwdPlayer();

    void updatePhonePlayer();

    void updateAll(Player player);

    void updatePwd(Player player);

    void updateName(Player player);

    void updatePhone(Player player);

    // 회원탈퇴

}
