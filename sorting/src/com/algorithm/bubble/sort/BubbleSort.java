package com.algorithm.bubble.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {

	private static void performBubbleSort(Integer[] input) {
		int inputLength = input.length;
		for (int i = 0; i < inputLength; i++) {
			for (int j = 1; j < (inputLength - i); j++) {
				if (input[j - 1] > input[j]) {
					swap(input, j - 1, j);
				}
			}
		}
	}
	
	private static void swap(Integer[] input, int index1, int index2) {
		int temp = input[index1];
		input[index1] = input[index2];
		input[index2] = temp;
	}
	
	public static void main(String[] args) {
		//Integer[] input = { 13, 11, 8, 2, 9, 1, 4, 8, 9, 3 };
		Integer[] input = buildInput();
		System.out.println("Before sorting => " + Arrays.asList(input));
		performBubbleSort(input);
		System.out.println("After sorting => " + Arrays.asList(input));
	}

	private static Integer[] buildInput() {
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter Integer values for sorting. enter \"q\" to finish.");
		try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNext()) {
				String value = scanner.next();
				if (value.equals("q")) {
					break;
				}
				list.add(Integer.valueOf(value));
			}
			return list.toArray(new Integer[list.size()]);
		}
	}
}