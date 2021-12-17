package com.yedam.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.java.app.customer.Customer;
import com.yedam.java.app.customer.CustomerDAOImpl;

public class CustomerFrame {
	Scanner sc = new Scanner(System.in);

	public CustomerFrame() {
		while (true) {
			// 메뉴 출력
			menuPrint();

			// 메뉴 선택
			int menuNo = menuSelect();
			if (menuNo == 1) {
				insertCustomer();
			} else if (menuNo == 2) {
				updateCustomer();
			} else if (menuNo == 3) {
				deleteCustomer();
			} else if (menuNo == 4) {
				selectOne();
			} else if (menuNo == 5) {
				selectAll();
			} else if (menuNo == 9) {
				end();
				break;
			}
		}

	}

	void menuPrint() {
		System.out.println("---------------------------------------------------------------------");
		System.out.println("| 1. 등록 | 2. 수정 | 3. 삭제 | 4. 개별조회 | 5. 전체조회 | 9. 종료 |");
		System.out.println("---------------------------------------------------------------------");
		System.out.print("선택 >> ");
	}

	void updateMenuPrint() {
		System.out.println("----------------------------------------------");
		System.out.println("수정을 선택하셨습니다. 수정 메뉴를 선택하세요.");
		System.out.println("----------------------------------------------\n");
		System.out.println("-------------------------------------------------------------");
		System.out.println("| 1. 전체수정 | 2. 이름만 수정 | 3. 비밀번호 수정 | 9. 취소 |");
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

	void insertCustomer() {
		// 값을 입력받아야 함
		Customer customer = inputAll();

		// INSERT
		CustomerDAOImpl.getInstance().insert(customer);
	}

	void updateCustomer() {
		updateMenuPrint();
		int menuNo = menuSelect();
		if (menuNo == 1) {
			updateAllCustomer();
		} else if (menuNo == 2) {
			updateNameCustomer();
		} else if (menuNo == 3) {
			updatePwdCustomer();
		} else if (menuNo == 9) {
			cancle();
			return;
		}
	}

	void updateAllCustomer() {
		Customer customer = inputAll();
		CustomerDAOImpl.getInstance().updateAll(customer);
	}

	void updateNameCustomer() {
		Customer customer = inputForName();
		CustomerDAOImpl.getInstance().updateName(customer);
	}

	void updatePwdCustomer() {
		Customer customer = inputForPwd();
		CustomerDAOImpl.getInstance().updatePwd(customer);
	}

	void deleteCustomer() {
		int customerId = inputCustomerId();
		CustomerDAOImpl.getInstance().delete(customerId);
	}

	void selectOne() {
		int customerId = inputCustomerId();
		Customer customer = CustomerDAOImpl.getInstance().selectOne(customerId);
		if (customer == null) {
			System.out.println(customerId + " : 없는 부서입니다.");
		} else {
			System.out.println(customer);
		}
	}

	void selectAll() {
		List<Customer> list = CustomerDAOImpl.getInstance().selectAll();
		for (Customer customer : list) {
			System.out.println(customer);
		}
	}

	void end() {
		System.out.println("프로그램을 종료합니다.");
	}

	void cancle() {
		System.out.println("취소합니다.");
	}

	Customer inputAll() {
		Customer customer = new Customer();
		customer = new Customer();

		System.out.print("매니저 번호 >> ");
		customer.setCustomerId(sc.nextInt());

		System.out.print("매니저 이름 >> ");
		customer.setCustomerName(sc.next());

		System.out.print("매니저 비밀번호 >> ");
		customer.setCustomerPwd(sc.next());

		return customer;
	}

	Customer inputForName() {
		Customer customer = new Customer();
		customer = new Customer();
		System.out.println("매니저 번호 >> ");
		customer.setCustomerId(sc.nextInt());
		System.out.println("변경할 이름 >> ");
		customer.setCustomerName(sc.next());
		return customer;
	}

	Customer inputForPwd() {
		Customer customer = new Customer();
		System.out.println("매니저 번호 >> ");
		customer.setCustomerId(sc.nextInt());
		System.out.println("변경할 비밀번호 >> ");
		customer.setCustomerPwd(sc.next());
		return customer;
	}

	int inputCustomerId() {
		int customerId = 0;
		System.out.print("매니저 번호>> ");
		customerId = sc.nextInt();
		return customerId;
	}
}
