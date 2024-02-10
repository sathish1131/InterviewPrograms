package myTests;

import java.util.Scanner;

public class DigitsOfInteger {
	public static void main(String[] args) {
		int digits = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		long num = sc.nextLong();
		while (num > 0) {
			digits += 1;
			num = num / 10;
		}
		System.out.println("Total Digitis In The Number : " + digits);
		sc.close();

	}

}
