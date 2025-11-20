package homework.medium;

import java.util.Arrays;
import java.util.List;

public class Homework3 {
	static void main(String[] args) {
		List<Integer> nums = Arrays.asList(5, 1, 9, -3, 7, 9);
		
		int max = nums.get(0);
		int min = nums.get(0);
		int sum = 0;
		
		for (int num : nums) {
			// maximum
			if (num > max) max = num;
			
			// minimum
			if (num < min) min = num;
			
			sum += num;
		}
		
		double avg = (double) sum / nums.size();
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
	}
	
	// Collections.max(nums);
	// Collections.min(nums);
}
