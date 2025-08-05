package week5;

import java.util.Scanner;

public class eiuBHouse {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	// tính tiền phải trả mỗi tháng trong K tháng
	public static void main(String[] args) {
		double n = sc.nextDouble(); // tiền gốc
		double m = sc.nextDouble(); // tiền trả trước
		int k = sc.nextInt(); // số tháng
		double x = sc.nextDouble(); // lãi mỗi tháng
		double a = (n - m) / k; // số tiền gốc phải trả k tháng
		int[] month = new int[k];
		for (int i = 0; i < month.length; i++) {
			double pay = 0;
			pay = a + ((n - m) - i * a) * (x / 100); // gốc mỗi tháng + lãi của tiền còn nợ
			sb.append(i+1 + " " + Math.round(pay)).append("\n");
		}
		System.out.println(sb);
	}
}
