package com.huonglanto.others;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MixCards {
	public static void main(String[] args) {
		
		int n = 10;
		Random random = new Random();
		int[] result = new int[n];
		List<Integer> numbers = new ArrayList<>();
		
		//add numbers to list
		for (int i = 0; i < n; i++) {
			numbers.add(i);
		}
		
		//n plain
		
		/**
		 * 0 -> 0
		 * 1 -> 1
		 * 2 -> 2

		 * 3 -> 5
		 * 4 -> 6

		 * 5 -> 8
		 * 6 -> 9
		 * 
		 * result[4]
		 * numbers.get(4);
		 * */
		
		/**
		 * 1 -> con cho
		 * 2 -> con meo
		 * 3 -> con vit
		 */
		
		for (int i = 0; i < n; i++) {
			int randomIndex = random.nextInt(numbers.size());
			int num = numbers.remove(randomIndex);
			result[i] = num;
		}
		
		//n
		
		for (int i = 0; i < n; i++) {
			System.out.print(String.format("%s, ", result[i]));
		}
		
		//n
	}
}
