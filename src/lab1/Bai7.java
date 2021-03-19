package lab1;

import java.util.Scanner;

public class Bai7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap vao xA yA xB yB: ");
		double xA = input.nextDouble();
		double yA = input.nextDouble();
		double xB = input.nextDouble();
		double yB = input.nextDouble();
		double d = Math.sqrt((xA - xB) * (xA - xB) + (yA - yB) * (yA - yB));
		System.out.println("khoảng cách d giữa 2 điểm a va B la: " + d);
		System.out.println("Em yeu anh "); 

	}
}
