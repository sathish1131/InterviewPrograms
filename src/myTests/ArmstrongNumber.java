package myTests;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int digit = 0, temp = input;
		int[] inputRev = new int[10];
		while (temp > 0) {
			inputRev[digit] = temp % 10;
			digit++;
			temp = temp / 10;
		}
		System.out.println("No. of digits : " + digit);
		int total = 0;
		for (int i = 0; i < digit; i++) {
			int temp1 = 1;
			for (int j = 0; j < digit; j++) {
				temp1 = temp1 * inputRev[i];
			}
			total = total + temp1;
		}
		System.out.println(total);
		if (total == input) {
			System.out.println("Given number is Armstrong Number");
		} else {
			System.out.println("Given number is not Armstrong Number");
		}
		sc.close();
	}

}
