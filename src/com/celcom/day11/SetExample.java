package com.celcom.day11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<>();
		set1.add("Mani");
		set1.add("Shervin");
		set1.add("vel");
		set1.add("yuva");
		set1.add(null);

		System.out.println("----------Elements in set1---------");
		for (String value : set1) {
			System.out.println(value);
		}

		Set<String> set2 = new HashSet<>();
		set2.addAll(set1);

		System.out.println("----------Elements in set2---------");
		for (String value : set2) {
			System.out.println(value);
		}

		System.out.println("---------To check two sets are same------------");
		System.out.println(set1.containsAll(set2));
		System.out.println("------------------------");

		set1.remove("Mani");

		for (String value : set1) {
			System.out.println(value);
		}

		set1.removeAll(set1);
		for (String value : set1) {
			System.out.println(value);
		}

		Set<String> set3 = new HashSet<>();
		set3.addAll(set2);
		set3.add("manikandan");
		set3.retainAll(set2);
		System.out.println(set3);

		Iterator<String> iterator = set3.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		System.out.println("------------------------");

		Object[] arr = set3.toArray();
		for (Object i : arr) {
			System.out.println(i);
		}

		System.out.println("------------------------");
	}

}
