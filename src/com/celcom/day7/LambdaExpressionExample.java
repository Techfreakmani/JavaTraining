package com.celcom.day7;

interface Calculator {

	int calc(int a, int b);
}

public class LambdaExpressionExample {

	public static void main(String[] args) {

		Calculator c = (a, b) -> a + b;
		c.calc(10, 20);

		c = (a, b) -> a - b;
		c.calc(20, 10);

		c = (a, b) -> a * b;
		c.calc(30, 10);
	}

}
