package app;

import java.util.Scanner;

import todo.TodoDAOImpl;

public class TodoFrame {
    Scanner sc = new Scanner(System.in);
    TodoDAOImpl tdimp = TodoDAOImpl.getInstance();

    public TodoFrame() {

        while (true) {
            tdimp.menuPrint();
            int menuNo = tdimp.menuSelect();
            if (menuNo == 1) {

            } else if (menuNo == 2) {
                tdimp.selectOne();
            } else if (menuNo == 9) {
                tdimp.end();
                break;
            }
        }
    }
}
