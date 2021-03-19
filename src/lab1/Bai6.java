package lab1;

import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap do cao h: ");
		double h = input.nextDouble();
		double t = Math.sqrt(2 * h / 9.8);
		double v = 9.8 * t;
		System.out.println("Thoi gia la: " + t + " Van toc la: " + v);

	}

}
