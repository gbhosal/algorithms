package com.algorithm.selection.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {

	private static void performSelectionSort(Integer[] input) {
		int inputLength = input.length;
		for (int i = 0; i < (inputLength - 1); i++) {
			int min = input[i];
			int minIndex = i;
			for (int j = i + 1; j < inputLength; j++) {
				if (min > input[j]) {
					minIndex = j;
					min = input[j];
				}
			}
			swap(input, i, minIndex);
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
		performSelectionSort(input);
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
