package app;

import java.util.Scanner;

import manager.ManagerDAOImpl;

public class ManagerFrame {
	Scanner sc = new Scanner(System.in);
	ManagerDAOImpl manimp = ManagerDAOImpl.getInstance();

	public ManagerFrame() {

		while (true) {
			manimp.loginMenuPrint();
			int menuNo = manimp.menuSelect();
			if (menuNo == 1) {
				manimp.loginCheck();
				break;
			} else if (menuNo == 2) {
				manimp.insertManager();
			} else if (menuNo == 9) {
				break;
			}
		}
	}

	// 메뉴 출력
//			menuPrint();

	// 메뉴 선택
//			int menuNo = menuSelect();
//			if (menuNo == 1) {
//				insertManager();
//			} else if (menuNo == 2) {
//				updateManager();
//			} else if (menuNo == 3) {
//				deleteManager();
//			} else if (menuNo == 4) {
//				selectOne();
//			} else if (menuNo == 5) {
//				selectAll();
//			} else if (menuNo == 9) {
//				end();
//				break;
//			}

}
