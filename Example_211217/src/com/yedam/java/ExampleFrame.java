package com.yedam.java;

import java.util.List;

public class ExampleFrame {

	void select1() {
		System.out.println("== 급여가 5000에서 10000사이인 사원 목록 ==");
		List<Example> list = ExampleDAOImpl.getInstance().select1();
		for (Example example : list) {
			System.out.println("사원번호 : " + example.getEmployeeId() + ", 이름 : " + example.getFirstName() + ", 이메일 : "
					+ example.getEmail() + ", 급여 : " + example.getSalary());
		}
	}

	void select2() {
		System.out.print("== 직책이 'ST_CLERK'인 사원 중 최고 연봉 : ");
		List<Example> list = ExampleDAOImpl.getInstance().select2();
		for(Example example : list) {
			System.out.println(example.getSalary());
		}
	}
	
	void select3() {
		System.out.print("== 5월에 입사한 사원들의 평균 연봉 : ");
		List<Example> list = ExampleDAOImpl.getInstance().select3();
		for(Example example : list) {
			System.out.println(example.getSalary());
		}
	}
	
	void select4() {
		System.out.println("== 직책이 'SA_REP'이며 급여가 10000이상인 사원 목록 ==");
		List<Example> list = ExampleDAOImpl.getInstance().select4();
		for(Example example : list) {
			System.out.println("사원번호 : " + example.getEmployeeId() + ", 이름 : " + example.getFirstName() + ", 이메일 : "
					+ example.getEmail() + ", 급여 : " + example.getSalary());
		}
	}
}
