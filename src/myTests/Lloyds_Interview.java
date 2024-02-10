package myTests;


public class Lloyds_Interview {
	/*

	All Test Cases:
	acceptable_seating(seating_1, disallowed_pairs_1_1)  => False
	acceptable_seating(seating_1, disallowed_pairs_1_2)  => True
	acceptable_seating(seating_1, disallowed_pairs_1_3)  => False
	acceptable_seating(seating_1, disallowed_pairs_1_4)  => False
	acceptable_seating(seating_1, disallowed_pairs_1_5)  => False
	acceptable_seating(seating_2, disallowed_pairs_2_1)  => False
	acceptable_seating(seating_2, disallowed_pairs_2_2)  => True
	acceptable_seating(seating_2, disallowed_pairs_2_3)  => False
	acceptable_seating(seating_2, disallowed_pairs_2_4)  => True
	acceptable_seating(seating_3, disallowed_pairs_3_1)  => True
	acceptable_seating(seating_3, disallowed_pairs_3_2)  => False
	acceptable_seating(seating_3, disallowed_pairs_3_3)  => True

	*/
	public boolean value1, value2;
	
	public static boolean res1,res2,res3,res4,res5,res6,res7,res8,res9,res10;

	public boolean horizontalSeating(String[][] tempSeating, String[] disallowedSeat) {
		value1=false;
		for (int i = 0; i < tempSeating.length; i++) {
			if(value1==true) {
				break;
			}
			for (int j = 1; j < tempSeating[i].length; j++) {
				String first = tempSeating[i][j - 1].toString();
				String sec = tempSeating[i][j].toString();
				if (first.equalsIgnoreCase(disallowedSeat[0]) && sec.equalsIgnoreCase(disallowedSeat[1])) {
					value1 = true;
					break;
				}else {
					value1=false;
					
				}
			}
		}
		return value1;
	}

	public boolean verticalSeating(String[][] tempSeating, String[] disallowedSeat) {
		value2=false;
		for (int i = 0; i < tempSeating[0].length; i++) {
			if(value2==true) {
				break;
			}
			for (int j = 1; j < tempSeating.length; j++) {
				String first = tempSeating[j - 1][i].toString();
				String sec = tempSeating[j][i].toString();
				if (first.equalsIgnoreCase(disallowedSeat[0]) && sec.equalsIgnoreCase(disallowedSeat[1])) {
					value2 = true;
					break;
				}else {
					value2=false;
				}
			}
		}
		return value2;
	}

	public static void main(String[] args) {
		String[][] seating_1 = {{"Imani", "Anika", "Alice", "Hessa"},
								{"Rasha", "Josue", "Clair", "Simon"},
								{"Kylee", "Sevis", "Layla", "Razan"},
								{"Kaveh", "Siafa", "Leong", "Nimat"},
								{"Erica", "Hilda", "Harsi", "Juana"},
								{"Lotus", "Venla", "Bemra", "Nader"}};
		String[][] dis_1_1 = { { "Razan", "Siafa" }, { "Erica", "Lotus" } };
		String[][] dis_1_2 = { { "Rasha", "Anika" }, { "Alice", "Simon" } };
		String[][] dis_1_3 = { { "Alice", "Hessa" }, { "Kylee", "Layla" } };
		String[][] dis_1_4 = { { "Bemra", "Nader" }, { "Josue", "Hilda" } };
		String[][] dis_1_5 = { { "Razan", "Siafa" }, { "Imani", "Rasha" } };
		Lloyds_Interview obj = new Lloyds_Interview();
		
		res1 = obj.horizontalSeating(seating_1, dis_1_1[0]);
		res2 = obj.verticalSeating(seating_1, dis_1_1[0]);
		res3 = obj.horizontalSeating(seating_1, dis_1_1[1]);
		res4 = obj.verticalSeating(seating_1, dis_1_1[1]);
		if(res1||res2||res3||res4) {
			System.out.println("Disallowed");
		}else {
			System.out.println("Allowed");
		}
		res1 = obj.horizontalSeating(seating_1, dis_1_2[0]);
		res2 = obj.verticalSeating(seating_1, dis_1_2[0]);
		res3 = obj.horizontalSeating(seating_1, dis_1_2[1]);
		res4 = obj.verticalSeating(seating_1, dis_1_2[1]);
		if(res1||res2||res3||res4) {
			System.out.println("Disallowed");
		}else {
			System.out.println("Allowed");
		}
		res1 = obj.horizontalSeating(seating_1, dis_1_3[0]);
		res2 = obj.verticalSeating(seating_1, dis_1_3[0]);
		res3 = obj.horizontalSeating(seating_1, dis_1_3[1]);
		res4 = obj.verticalSeating(seating_1, dis_1_3[1]);
		if(res1||res2||res3||res4) {
			System.out.println("Disallowed");
		}else {
			System.out.println("Allowed");
		}
		res1 = obj.horizontalSeating(seating_1, dis_1_4[0]);
		res2 = obj.verticalSeating(seating_1, dis_1_4[0]);
		res3 = obj.horizontalSeating(seating_1, dis_1_4[1]);
		res4 = obj.verticalSeating(seating_1, dis_1_4[1]);
		if(res1||res2||res3||res4) {
			System.out.println("Disallowed");
		}else {
			System.out.println("Allowed");
		}
		res1 = obj.horizontalSeating(seating_1, dis_1_5[0]);
		res2 = obj.verticalSeating(seating_1, dis_1_5[0]);
		res3 = obj.horizontalSeating(seating_1, dis_1_5[1]);
		res4 = obj.verticalSeating(seating_1, dis_1_5[1]);
		if(res1||res2||res3||res4) {
			System.out.println("Disallowed");
		}else {
			System.out.println("Allowed");
		}
		
		String[][] seating_2 = {{ "Tamiko", "Boimah", "Anjana", "Elijah", "Raatib", "Darcie" },
								{ "Trokon", "Hugues", "Dariya", "Tambre", "Cedric", "Matias" },
								{ "Mariah", "Marian", "Ulrico", "Gerard", "Sarama", "Tayiko" },
								{ "Ashraf", "Jazlyn", "Majeed", "Borzoo", "Najmeh", "Animan" }};
		String[][] dis_2_1 = { { "Anjana", "Elijah" }, { "Tambre", "Sarama" }, { "Animan", "Raatib" },{ "Sarama", "Elijah" }, { "Tayiko", "Dariya" } };
		String[][] dis_2_2 = { { "Animan", "Mariah" }, { "Cedric", "Mariah" }, { "Marian", "Sarama" } };
		String[][] dis_2_3 = { { "Tambre", "Anjana" }, { "Elijah", "Borzoo" }, { "Sarama", "Tayiko" },{ "Jazlyn", "Hugues" }, { "Marian", "Matias" } };
		String[][] dis_2_4 = { { "Majeed", "Gerard" }, { "Matias", "Marian" } };
		res1 = obj.horizontalSeating(seating_2, dis_2_1[0]);
		res2 = obj.verticalSeating(seating_2, dis_2_1[0]);
		res3 = obj.horizontalSeating(seating_2, dis_2_1[1]);
		res4 = obj.verticalSeating(seating_2, dis_2_1[1]);
		res5 = obj.horizontalSeating(seating_2, dis_2_1[2]);
		res6 = obj.verticalSeating(seating_2, dis_2_1[2]);
		res7 = obj.horizontalSeating(seating_2, dis_2_1[3]);
		res8 = obj.verticalSeating(seating_2, dis_2_1[3]);
		res9 = obj.horizontalSeating(seating_2, dis_2_1[4]);
		res10 = obj.verticalSeating(seating_2, dis_2_1[4]);
		if(res1||res2||res3||res4||res5||res6||res7||res8||res9||res10) {
			System.out.println("Disallowed");
		}else {
			System.out.println("Allowed");
		}
		res1 = obj.horizontalSeating(seating_2, dis_2_2[0]);
		res2 = obj.verticalSeating(seating_2, dis_2_2[0]);
		res3 = obj.horizontalSeating(seating_2, dis_2_2[1]);
		res4 = obj.verticalSeating(seating_2, dis_2_2[1]);
		res5 = obj.horizontalSeating(seating_2, dis_2_2[2]);
		res6 = obj.verticalSeating(seating_2, dis_2_2[2]);
		if(res1||res2||res3||res4||res5||res6) {
			System.out.println("Disallowed");
		}else {
			System.out.println("Allowed");
		}
		res1 = obj.horizontalSeating(seating_2, dis_2_3[0]);
		res2 = obj.verticalSeating(seating_2, dis_2_3[0]);
		res3 = obj.horizontalSeating(seating_2, dis_2_3[1]);
		res4 = obj.verticalSeating(seating_2, dis_2_3[1]);
		res5 = obj.horizontalSeating(seating_2, dis_2_3[2]);
		res6 = obj.verticalSeating(seating_2, dis_2_3[2]);
		res7 = obj.horizontalSeating(seating_2, dis_2_3[3]);
		res8 = obj.verticalSeating(seating_2, dis_2_3[3]);
		res9 = obj.horizontalSeating(seating_2, dis_2_3[4]);
		res10 = obj.verticalSeating(seating_2, dis_2_3[4]);
		if(res1||res2||res3||res4||res5||res6||res7||res8||res9||res10) {
			System.out.println("Disallowed");
		}else {
			System.out.println("Allowed");
		}
		res1 = obj.horizontalSeating(seating_2, dis_2_4[0]);
		res2 = obj.verticalSeating(seating_2, dis_2_4[0]);
		res3 = obj.horizontalSeating(seating_2, dis_2_4[1]);
		res4 = obj.verticalSeating(seating_2, dis_2_4[1]);
		if(res1||res2||res3||res4) {
			System.out.println("Disallowed");
		}else {
			System.out.println("Allowed");
		}
		
		String[][] seating_3 = { { "Heydar", "Lamie", "Ibhi", "Kit", "Alas", "Yasaman", "Xochitl" },
								{ "Tala", "Isabelle", "Genoveffa", "Sakuro", "Abay", "Lee", "Topper" },
								{ "Korekiyo", "Ancelmes", "Sherin", "Frasier", "Paisley", "Hayley", "Leon" } };
		String[][] dis_3_1 = { { "Hayley", "Alas" }, { "Hayley", "Abay" }, { "Abay", "Korekiyo" },{ "Xochitl", "Paisley" }, { "Sherin", "Lamie" } };
		String[][] dis_3_2 = { { "Hayley", "Leon" }, { "Kit", "Alas" }, { "Lee", "Korekiyo" },{ "Leon", "Tala" }, { "Yasaman", "Frasier" } };
		String[][] dis_3_3 = { { "Isabelle", "Korekiyo" }, { "Ancelmes", "Sakuro" }, { "Yasaman", "Ibhi" },{ "Abay", "Korekiyo" } };
		res1 = obj.horizontalSeating(seating_3, dis_3_1[0]);
		res2 = obj.verticalSeating(seating_3, dis_3_1[0]);
		res3 = obj.horizontalSeating(seating_3, dis_3_1[1]);
		res4 = obj.verticalSeating(seating_3, dis_3_1[1]);
		res5 = obj.horizontalSeating(seating_3, dis_3_1[2]);
		res6 = obj.verticalSeating(seating_3, dis_3_1[2]);
		res7 = obj.horizontalSeating(seating_3, dis_3_1[3]);
		res8 = obj.verticalSeating(seating_3, dis_3_1[3]);
		res9 = obj.horizontalSeating(seating_3, dis_3_1[4]);
		res10 = obj.verticalSeating(seating_3, dis_3_1[4]);
		if(res1||res2||res3||res4||res5||res6||res7||res8||res9||res10) {
			System.out.println("Disallowed");
		}else {
			System.out.println("Allowed");
		}
		res1 = obj.horizontalSeating(seating_3, dis_3_2[0]);
		res2 = obj.verticalSeating(seating_3, dis_3_2[0]);
		res3 = obj.horizontalSeating(seating_3, dis_3_2[1]);
		res4 = obj.verticalSeating(seating_3, dis_3_2[1]);
		res5 = obj.horizontalSeating(seating_3, dis_3_2[2]);
		res6 = obj.verticalSeating(seating_3, dis_3_2[2]);
		res7 = obj.horizontalSeating(seating_3, dis_3_2[3]);
		res8 = obj.verticalSeating(seating_3, dis_3_2[3]);
		res9 = obj.horizontalSeating(seating_3, dis_3_2[4]);
		res10 = obj.verticalSeating(seating_3, dis_3_2[4]);
		if(res1||res2||res3||res4||res5||res6||res7||res8||res9||res10) {
			System.out.println("Disallowed");
		}else {
			System.out.println("Allowed");
		}
		res1 = obj.horizontalSeating(seating_3, dis_3_3[0]);
		res2 = obj.verticalSeating(seating_3, dis_3_3[0]);
		res3 = obj.horizontalSeating(seating_3, dis_3_3[1]);
		res4 = obj.verticalSeating(seating_3, dis_3_3[1]);
		res5 = obj.horizontalSeating(seating_3, dis_3_3[2]);
		res6 = obj.verticalSeating(seating_3, dis_3_3[2]);
		res7 = obj.horizontalSeating(seating_3, dis_3_3[3]);
		res8 = obj.verticalSeating(seating_3, dis_3_3[3]);
		if(res1||res2||res3||res4||res5||res6||res7||res8) {
			System.out.println("Disallowed");
		}else {
			System.out.println("Allowed");
		}
	}

}
