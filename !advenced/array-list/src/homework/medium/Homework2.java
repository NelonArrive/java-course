package homework.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework2 {
	static void main(String[] args) {
		
		// List<String> words = Arrays.asList("a", "b", "a", "c", "b");
		
		// Set<String> unique = new HashSet<>(words);
		
		// System.out.println(unique);
		
		// Set хранит только уникальные элементы, дубликаты туда просто не
		// добавляются.
		
		// ============== LinkedHashSet =============
		// Если хочется сохранить порядок - LinkedHashSet
		
		// ============== ECЛИ БЕЗ Set ==============
		List<String> words = Arrays.asList("a", "b", "a", "c", "b");
		List<String> unique = new ArrayList<>();
		
		for (String word : words) {
			if (!unique.contains(word)) {
				unique.add(word);
			}
		}
		
		System.out.println(unique);
	}
}
