package app;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		while (true) {
			menuPrint();
			break;
		}
	}

	private static int menuSelect() {
		Scanner sc = new Scanner(System.in);
		int menuNo = 0;
		try {
			menuNo = sc.nextInt();
		} catch (Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}

	private static void menuPrint() {
		System.out.println("-------------------------------------------------------------");
		System.out.println("| 1. 매니저 | 2. 회원 | 3. TodoList | 4. 재선택  | 9. 종료 |");
		System.out.println("-------------------------------------------------------------");
		System.out.print("선택 >> ");
		int menuNo = menuSelect();

		if (menuNo == 1) {
			new ManagerFrame();
		} else if (menuNo == 2) {
			new PlayerFrame();
		} else if (menuNo == 3) {
			new TodoFrame();
		} else if (menuNo == 4) {
			menuPrint();
		} else if (menuNo == 9) {
			return;
		}
	}
}