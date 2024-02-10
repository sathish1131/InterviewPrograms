package myTests;

import java.util.ArrayList;

public class IndexValues {

	public static void main(String[] args) {
		int[] input = { 3, 4, 2, 5, 8, 1 };
		int temp = 0;
		ArrayList<Integer> li = new ArrayList<>();
		ArrayList<Integer> li1 = new ArrayList<>();
		for (int temp1 : input) {
			li1.add(temp1);
		}
		System.out.println(li1);
		for(int i=0;i<input.length;i++) {
			for(int j=i+1;j<input.length;j++) {
				if(input[i]>input[j]) {
					temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}
		
		for(int temp1:input) {
			System.out.print(temp1);
		}
		System.out.println();
		for(int temp2:input) {
			li.add(li1.indexOf(temp2));
		}
		System.out.println(li);
		
	}

}
