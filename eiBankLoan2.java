package week5;

import java.util.Scanner;

public class eiBankLoan2 {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

//tính số tháng để trả hết số tiền
	public static void main(String[] args) {
		double x = sc.nextDouble(); // tiền gốc
		double y = sc.nextDouble();
		double r = sc.nextDouble();
		double rate = r / 12 / 100;
		// double pay = 0;
		// double month = 0;
		// double maintain = x - y;
//		while (pay < x) {
//			pay += Math.round(y + (x - maintain) * rate);
//			month++;
//			maintain += y;
//		}
//			System.out.println(Math.round(month));
//	}

		double month = Math.log(y / (y - rate * x)) / Math.log(1 + rate);
		System.out.println((long) Math.ceil(month));
	}
}
