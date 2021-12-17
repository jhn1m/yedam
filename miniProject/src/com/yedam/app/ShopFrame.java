package com.yedam.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.java.app.shop.SearchManager;
import com.yedam.java.app.shop.SearchManagerDAOImpl;
import com.yedam.java.app.shop.Shop;
import com.yedam.java.app.shop.ShopDAOImpl;

public class ShopFrame {
	Scanner sc = new Scanner(System.in);

	public ShopFrame() {
		while (true) {
			// 메뉴 출력
			menuPrint();

			// 메뉴 선택
			int menuNo = menuSelect();
			if (menuNo == 1) {
				insertshop();
			} else if (menuNo == 2) {
				updateshop();
			} else if (menuNo == 3) {
				deleteshop();
			} else if (menuNo == 4) {
				selectOne();
			} else if (menuNo == 5) {
				selectAll();
			} else if (menuNo == 6) {
				selectOneWithManager();
			} else if (menuNo == 9) {
				end();
				break;
			}
		}

	}

	void menuPrint() {
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("| 1. 매장정보 등록 | 2. 매장정보 수정 | 3. 삭제 | 4. 개별조회 | 5. 전체조회 | 9. 종료 |");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.print("선택 >> ");
	}

	void updateMenuPrint() {
		System.out.println("----------------------------------------------");
		System.out.println("수정을 선택하셨습니다. 수정 메뉴를 선택하세요.");
		System.out.println("----------------------------------------------\n");
		System.out.println("-------------------------------------------------------------");
		System.out.println("| 1. 전체수정 | 2. 이름 수정 | 3. 매장 위치 수정 | 9. 취소 |");
		System.out.println("-------------------------------------------------------------");
		System.out.print("선택 >> ");
	}

	void selectMenuPrint() {
		System.out.println("----------------------------------------------");
		System.out.println("개별조회를 선택하셨습니다. 메뉴를 선택하세요.");
		System.out.println("----------------------------------------------\n");
		System.out.println("-------------------------------------------------------------");
		System.out.println("| 1. 전체수정 | 2. 이름 수정 | 3. 매장 위치 수정 | 9. 취소 |");
		System.out.println("-------------------------------------------------------------");
		System.out.print("선택 >> ");
	}

	int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = sc.nextInt();
		} catch (Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}

	void insertshop() {
		// 값을 입력받아야 함
		Shop shop = inputAll();

		// INSERT
		ShopDAOImpl.getInstance().insert(shop);
	}

	void updateshop() {
		updateMenuPrint();
		int menuNo = menuSelect();
		if (menuNo == 1) {
			updateAllshop();
		} else if (menuNo == 2) {
			updateNameshop();
		} else if (menuNo == 3) {
			updatePwdshop();
		} else if (menuNo == 9) {
			cancle();
			return;
		}
	}

	void updateAllshop() {
		Shop shop = inputAll();
		ShopDAOImpl.getInstance().updateAll(shop);
	}

	void updateNameshop() {
		Shop shop = inputForName();
		ShopDAOImpl.getInstance().updateShopName(shop);
	}

	void updatePwdshop() {
		Shop shop = inputForPwd();
		ShopDAOImpl.getInstance().updateLocation(shop);
	}

	void deleteshop() {
		int shopId = inputshopId();
		ShopDAOImpl.getInstance().delete(shopId);
	}

	void selectOne() {
		int shopId = inputshopId();
		Shop shop = ShopDAOImpl.getInstance().selectOne(shopId);
		if (shop == null) {
			System.out.println(shopId + " : 없는 부서입니다.");
		} else {
			System.out.println(shop);
		}
	}

	void selectOneWithManager() {
		int shopId = inputshopId();
		SearchManager searchmanager = SearchManagerDAOImpl.getInstance().selectOneWithManager(shopId);
		if (searchmanager == null) {
			System.out.println(shopId + " : 없는 부서입니다.");
		} else {
			System.out.println(searchmanager);
		}

	}

	void selectAll() {
		List<Shop> list = ShopDAOImpl.getInstance().selectAll();
		for (Shop shop : list) {
			System.out.println(shop);
		}
	}

	void end() {
		System.out.println("프로그램을 종료합니다.");
	}

	void cancle() {
		System.out.println("취소합니다.");
	}

	Shop inputAll() {
		Shop shop = new Shop();
		shop = new Shop();

		System.out.print("매장 번호 >> ");
		shop.setShopId(sc.nextInt());

		System.out.print("매장 이름 >> ");
		shop.setShopName(sc.next());

		System.out.print("매장 주소 >> ");
		shop.setShopLocation(sc.next());

		return shop;
	}

	Shop inputForName() {
		Shop shop = new Shop();
		shop = new Shop();
		System.out.println("매장 번호 >> ");
		shop.setShopId(sc.nextInt());
		System.out.println("변경할 이름 >> ");
		shop.setShopName(sc.next());
		return shop;
	}

	Shop inputForPwd() {
		Shop shop = new Shop();
		System.out.println("매장 번호 >> ");
		shop.setShopId(sc.nextInt());
		System.out.println("변경할 주소 >> ");
		shop.setShopLocation(sc.next());
		return shop;
	}

	int inputshopId() {
		int shopId = 0;
		System.out.print("매장 번호>> ");
		shopId = sc.nextInt();
		return shopId;
	}
}
