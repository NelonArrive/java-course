package homework.easy;

import java.util.ArrayList;

public class Homework {
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		for (int i = 0; i < 6; i++) {
			arrayList.add(i);
		}
		
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) % 2 == 0) {
				arrayList.remove(i);
				i--; // откат назад, чтобы индекс не пропускал элементы
			}
		}
		
		// arrayList.removeIf(n -> n % 2 == 0);
		
		System.out.println(arrayList);
		
	}
}