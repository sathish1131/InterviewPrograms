package myTests;

import java.util.ArrayList;

public class Lloyd_Interview_Simplification {
	public boolean value1, value2;
	public static ArrayList<String> li = new ArrayList<>();

	public boolean horizontalSeating(String[][] tempSeating, String[] disallowedSeat) {
		value1 = false;
		for (int i = 0; i < tempSeating.length; i++) {
			if (value1 == true) {
				break;
			}
			for (int j = 1; j < tempSeating[i].length; j++) {
				String first = tempSeating[i][j - 1].toString();
				String sec = tempSeating[i][j].toString();
				if (first.equalsIgnoreCase(disallowedSeat[0]) && sec.equalsIgnoreCase(disallowedSeat[1])) {
					value1 = true;
					break;
				} else {
					value1 = false;
				}
			}
		}
		return value1;
	}

	public boolean verticalSeating(String[][] tempSeating, String[] disallowedSeat) {
		value2 = false;
		for (int i = 0; i < tempSeating[0].length; i++) {
			if (value2 == true) {
				break;
			}
			for (int j = 1; j < tempSeating.length; j++) {
				String first = tempSeating[j - 1][i].toString();
				String sec = tempSeating[j][i].toString();
				if (first.equalsIgnoreCase(disallowedSeat[0]) && sec.equalsIgnoreCase(disallowedSeat[1])) {
					value2 = true;
					break;
				} else {
					value2 = false;
				}
			}
		}
		return value2;
	}

	public boolean result(boolean hor, boolean ver) {
		if (hor || ver) {
			return true;
		} else {
			return false;
		}
	}

	public void solution(String[][] seating, String[][][] dis,int seatingModel) {
		for (int i = 0; i < dis.length; i++) {
			li.clear();
			for (int j = 0; j < dis[i].length; j++) {
				if (result(horizontalSeating(seating, dis[i][j]), verticalSeating(seating, dis[i][j])) == false) {
					li.add("false");
				}
			}
			if (li.size() == dis[i].length) {
				System.out.println("Seating_"+seatingModel+" DisallowedPair_"+seatingModel+"_"+(i+1)+" => True");
			} else {
				System.out.println("Seating_"+seatingModel+" DisallowedPair_"+seatingModel+"_"+(i+1)+" => False");
			}
		}
	}

	public static void main(String[] args) {
		String[][] seating_1 = {{ "Imani", "Anika", "Alice", "Hessa" },
								{ "Rasha", "Josue", "Clair", "Simon" },
								{ "Kylee", "Sevis", "Layla", "Razan" }, 
								{ "Kaveh", "Siafa", "Leong", "Nimat" },
								{ "Erica", "Hilda", "Harsi", "Juana" }, 
								{ "Lotus", "Venla", "Bemra", "Nader" }};
		String[][] dis_1_1 = { { "Razan", "Siafa" }, { "Erica", "Lotus" } };
		String[][] dis_1_2 = { { "Rasha", "Anika" }, { "Alice", "Simon" } };
		String[][] dis_1_3 = { { "Alice", "Hessa" }, { "Kylee", "Layla" } };
		String[][] dis_1_4 = { { "Bemra", "Nader" }, { "Josue", "Hilda" } };
		String[][] dis_1_5 = { { "Razan", "Siafa" }, { "Imani", "Rasha" } };
		String[][][] dis1 = { dis_1_1, dis_1_2, dis_1_3, dis_1_4, dis_1_5 };

		String[][] seating_2 = {{ "Tamiko", "Boimah", "Anjana", "Elijah", "Raatib", "Darcie" },
								{ "Trokon", "Hugues", "Dariya", "Tambre", "Cedric", "Matias" },
								{ "Mariah", "Marian", "Ulrico", "Gerard", "Sarama", "Tayiko" },
								{ "Ashraf", "Jazlyn", "Majeed", "Borzoo", "Najmeh", "Animan" }};
		String[][] dis_2_1 = { { "Anjana", "Elijah" }, { "Tambre", "Sarama" }, { "Animan", "Raatib" },{ "Sarama", "Elijah" }, { "Tayiko", "Dariya" } };
		String[][] dis_2_2 = { { "Animan", "Mariah" }, { "Cedric", "Mariah" }, { "Marian", "Sarama" } };
		String[][] dis_2_3 = { { "Tambre", "Anjana" }, { "Elijah", "Borzoo" }, { "Sarama", "Tayiko" },{ "Jazlyn", "Hugues" }, { "Marian", "Matias" } };
		String[][] dis_2_4 = { { "Majeed", "Gerard" }, { "Matias", "Marian" } };
		String[][][] dis2 = { dis_2_1, dis_2_2, dis_2_3, dis_2_4 };

		String[][] seating_3 = {{ "Heydar", "Lamie", "Ibhi", "Kit", "Alas", "Yasaman", "Xochitl" },
								{ "Tala", "Isabelle", "Genoveffa", "Sakuro", "Abay", "Lee", "Topper" },
								{ "Korekiyo", "Ancelmes", "Sherin", "Frasier", "Paisley", "Hayley", "Leon" } };
		String[][] dis_3_1 = {{ "Hayley", "Alas" }, { "Hayley", "Abay" }, { "Abay", "Korekiyo" },{ "Xochitl", "Paisley" }, { "Sherin", "Lamie" } };
		String[][] dis_3_2 = { { "Hayley", "Leon" }, { "Kit", "Alas" }, { "Lee", "Korekiyo" }, { "Leon", "Tala" },{ "Yasaman", "Frasier" } };
		String[][] dis_3_3 = { { "Isabelle", "Korekiyo" }, { "Ancelmes", "Sakuro" }, { "Yasaman", "Ibhi" },{ "Abay", "Korekiyo" } };
		String[][][] dis3 = { dis_3_1, dis_3_2, dis_3_3 };

		Lloyd_Interview_Simplification obj = new Lloyd_Interview_Simplification();
		obj.solution(seating_1, dis1,1);
		obj.solution(seating_2, dis2,2);
		obj.solution(seating_3, dis3,3);
	}
}
