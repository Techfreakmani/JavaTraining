package com.celcom.day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		System.out.println(list);

		System.out.println(list.get(0)); // 10
		list.add(1, 15);
		System.out.println(list);

		list.set(1, 200);
		System.out.println(list);

		list.remove(new Integer(10));
		System.out.println(list);

		System.out.println(list.size());

		System.out.println(list.contains(200));

		System.out.println(list.isEmpty());

		// way 1
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		System.out.println();
		// way 2
		for (Integer value : list) {
			System.out.print(value + " ");
		}
		System.out.println();

		// way 3
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

	}

}
