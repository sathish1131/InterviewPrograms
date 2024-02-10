package myTests;

import java.util.Scanner;

public class StringReversal {
	
	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		Scanner sc=new Scanner(System.in);
		String inputString=sc.nextLine();
		for(int i=inputString.length()-1;i>=0;i--) {
			System.out.print(inputString.charAt(i));
		}
		System.out.println();
		StringBuffer sb=new StringBuffer(inputString);
		System.out.println(sb.reverse());
		sc.close();
	}
}
