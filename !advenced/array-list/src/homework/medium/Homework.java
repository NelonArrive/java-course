package homework.medium;

import java.util.ArrayList;
import java.util.List;

public class Homework {
	static void main(String[] args) {
		
		List<String> langs = new ArrayList<>(List.of(
			"java", "js", "python", "c", "go"
		));
		
		System.out.println("Old: " + langs);
		
		langs.sort((a, b) -> a.length() - b.length());
		// langs.sort(Comparator.comparingInt(String::length));
		
		System.out.println("Sorted: " + langs);
	}
}