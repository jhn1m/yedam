package app;

import java.util.Scanner;
import player.PlayerDAOImpl;

public class PlayerFrame {
    Scanner sc = new Scanner(System.in);
    PlayerDAOImpl plaimp = PlayerDAOImpl.getInstance();

    public PlayerFrame() {

        while (true) {
            plaimp.loginMenuPrint();
            int menuNo = plaimp.menuSelect();
            if (menuNo == 1) {
                plaimp.loginCheck();
                break;
            } else if (menuNo == 2) {
                plaimp.insertPlayer();
            } else if (menuNo == 9) {
                break;
            }
        }
    }

    // 메뉴 출력
    // menuPrint();

    // 메뉴 선택
    // int menuNo = menuSelect();
    // if (menuNo == 1) {
    // insertManager();
    // } else if (menuNo == 2) {
    // updateManager();
    // } else if (menuNo == 3) {
    // deleteManager();
    // } else if (menuNo == 4) {
    // selectOne();
    // } else if (menuNo == 5) {
    // selectAll();
    // } else if (menuNo == 9) {
    // end();
    // break;
    // }

}
