package homework.easy;

import java.util.ArrayList;
import java.util.List;

public class Homework3 {
	static void main(String[] args) {
		List<String> source = List.of("Java", "Spring", "React");
		List<String> copy = new ArrayList<>(); // 👈 source
		
		for (String item : source) {
			copy.add(item);
		}
		// .addAll()
		
		System.out.println(copy);
		
	}
}
