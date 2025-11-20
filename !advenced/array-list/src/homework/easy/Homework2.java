package homework.easy;

import java.util.ArrayList;

public class Homework2 {
	static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		
		words.add("java");
		words.add("go");
		words.add("cat");
		words.add("hello");
		words.add("js");
		words.add("react");
		words.add("hi");
		words.add("spring");
		words.add("dog");
		words.add("api");
		
		for (String word : words) {
			if (word.length() > 3) {
				System.out.println(word);
			}
		}
	
		// words.removeIf(word -> word.length() <= 3);
	}
}
