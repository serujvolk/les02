package edu.training.jc.second_task;

public class Fourth {

	public static void main(String[] args) {
		int num = 2;
		int per = num;
		int n = 0;

		while (per > 0) {
			per /= 10;
			n++;
		}
		if (num == 0) {
			System.out.println("В числе " + num + " кол-во цифр: 1.");
		} else {
			System.out.println("В числе " + num + " кол-во цифр: " + n + ".");
		}
	}

}
