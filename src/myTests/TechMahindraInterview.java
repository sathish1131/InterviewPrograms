package myTests;

import java.util.HashMap;
import java.util.Map;

public class TechMahindraInterview {

	public static void main(String[] args) {
//        RestAssured.given.header("","").delete("").then.statusCode(404);

		int[] array1 = { 9, 4, 6, 0, 5, 8 };
		int[] array2 = { 7, 3, 1, 2, 9, 0, 6 };
		HashMap<Integer, Integer> matched = new HashMap<Integer, Integer>();
		for (int i = 0; i < array1.length; i++) {
			if(matched.containsKey(array1[i])) {
				matched.put(array1[i], matched.get(array1[i])+1);
			}else {
				matched.put(array1[i], 1);
			}
		}
		for (int i = 0; i < array2.length; i++) {
			if(matched.containsKey(array2[i])) {
				matched.put(array2[i], matched.get(array2[i])+1);
			}else {
				matched.put(array2[i], 1);
			}
		}
		System.out.println("UnMatched values : ");
		for (Map.Entry<Integer, Integer> entry : matched.entrySet()) {
			if (entry.getValue()==1) {
				System.out.print(entry.getKey() + " ");
			}
		}
		System.out.println();
		System.out.println("Matched values : ");
		for (Map.Entry<Integer, Integer> entry : matched.entrySet()) {
			if (!(entry.getValue()==1)) {
				System.out.print(entry.getKey() + " ");
			}
		}
		System.out.println();

		
		int[] array3 = { 7, 3, 1, 2, 9, 0, 6, 4, 5 };
		for (int n = 0; n < array3.length; n++) {
			for (int m = n + 1; m < array3.length; m++) {
				if (array3[n] > array3[m]) {
					int temp = array3[n];
					array3[n] = array3[m];
					array3[m] = temp;
				}
			}
		}
		System.out.println("Ascending Order :");
		for (int n = 0; n < array3.length; n++) {
			System.out.print(array3[n] + " ");
		}
		System.out.println();
		System.out.println("Descending order ;");
		for (int n = array3.length - 1; n >= 0; n--) {
			System.out.print(array3[n] + " ");
		}
		System.out.println();

		String name = "satheeshkumar";
		for (int k = 0; k < name.length(); k++) {
			System.out.print(name.charAt(k));
		}
		System.out.println();
		for (int l = name.length() - 1; l >= 0; l--) {
			System.out.print(name.charAt(l));
		}
		System.out.println();
		HashMap<Character, Integer> map = new HashMap<>();
		for (char temp : name.toCharArray()) {
			if (map.containsKey(temp)) {
				map.put(temp, map.get(temp) + 1);
			} else {
				map.put(temp, 1);
			}
		}
		System.out.println(map);

	}

}
