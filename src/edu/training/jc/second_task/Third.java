package edu.training.jc.second_task;

public class Third {

	public static void main(String[] args) {
		long n = 6;

		long factorial = 1;

		if (n < 0) {
			System.out.println("Число отрицательное");

		} else if (n == 0) {
			System.out.println("Факториал равен 0");

		} else {
			for (int i = 1; i <= n; i++) {

				factorial = factorial * i;
			}
			System.out.println("Факториал " + n + " = " + factorial);
		}
	}

}
