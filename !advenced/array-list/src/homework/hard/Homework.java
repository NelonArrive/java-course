package homework.hard;

import java.util.*;

public class Homework {
	static void main(String[] args) {
	
		List<Integer> nums = Arrays.asList(1,2,3,4,5,2,3,3);
		
		List<Integer> duplicates = getDuplicates(nums);
		
		System.out.println(duplicates);
	}
	
	public static List<Integer> getDuplicates(List<Integer> nums) {
		List<Integer> res = new ArrayList<>();
		Set<Integer> seen = new HashSet<>();
		
		for (Integer num : nums) {
			if (!seen.add(num)) {
				if (!res.contains(num)) {
					res.add(num);
				}
			}
		}
		
		return res;
	}
}