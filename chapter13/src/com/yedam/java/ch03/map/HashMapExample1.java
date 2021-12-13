package com.yedam.java.ch03.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("김가가", 85);
		map.put("이가가", 90);
		map.put("박가가", 80);
		map.put("최가가", 70);
		System.out.println("총 Entry 수 : " + map.size());
//		System.out.println("\t 김가가 : " + map.get("김가가"));

		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		map.remove("김가가");
		System.out.println("총 객체 수 : " + map.size());

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

	}
}
