package com.celcom.day9;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector<Integer> vec = new Vector<>(3, 2); // (capacity,increment)
		System.out.println(vec.size()); // 0
		System.out.println(vec.capacity()); // 3

		vec.add(10);
		vec.add(20);
		vec.add(30);
		System.out.println(vec.size()); // 3
		System.out.println(vec.capacity()); // 3

		vec.add(40);
		System.out.println(vec.size()); // 4
		System.out.println(vec.capacity()); // 5

		// Way-1
		for (int i = 0; i < vec.size(); i++) {
			System.out.print(vec.get(i));
		}
		System.out.println();

		// Way-2
		for (Integer i : vec) {
			System.out.print(i);
		}
		System.out.println();

		// Way-3
		Enumeration<Integer> e = vec.elements();
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement());
		}
		System.out.println();

	}

}
