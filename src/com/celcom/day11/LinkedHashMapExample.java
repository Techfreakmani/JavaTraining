package com.celcom.day11;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new LinkedHashMap<>();

		map1.put(10, "mani");
		map1.put(20, "Shervin");
		map1.put(30, "yuva");
		map1.put(40, "Vel");

		System.out.println(map1);
		System.out.println("------------------");
		for (Map.Entry<Integer, String> map : map1.entrySet()) {
			System.out.println(map.getKey() + ":" + map.getValue());
		}

		Map<Integer, String> map2 = new LinkedHashMap<>();
		map2.putAll(map1);

		map1.clear();
		System.out.println(map1);
		System.out.println("------------------");

		System.out.println(map2);

		System.out.println(map2.containsKey(10));
		System.out.println(map2.containsValue("mani"));
		System.out.println(map2.isEmpty());
		System.out.println(map2.remove(10));
		System.out.println(map2);
		map2.merge(20, "dani", (a, b) -> a + b);
		System.out.println(map2);
		System.out.println(map2.size());
		System.out.println(map2.hashCode());
		System.out.println(map2.keySet());

	}

}
