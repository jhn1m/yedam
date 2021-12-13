package com.yedam.java.ch01.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet / JSP");
		list.add(2, "Database");
		list.add("iBatis");
		
		System.out.println(list);
		
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		
		String skill = list.get(2);
		System.out.println(skill);
		
		list.remove(2);
		list.remove(2);
		list.remove("iBatis");
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		System.out.println();
		
		for(String str : list) {
			System.out.println(str);
		}
		
		
	}

}
