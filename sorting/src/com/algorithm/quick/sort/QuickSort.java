package com.algorithm.quick.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuickSort {
	
	private static void performQuickSort(Integer[] input, int low, int high) {
		if (high < low) {
			return;
		}
		int mid = low + (high - low) / 2;
		int pivot = input[mid];
		int i = low;
		int j = high;		
		while (i <= j) {
			while (input[i] < pivot) {
				i++;
			}
			while (input[j] > pivot) {
				j--;
			}

			if (i <= j) {
				swap(input, i, j);
				i++;
				j--;
			}
		}
		if (low < j) {
			performQuickSort(input, low, j);
		}
		if (high > i) {
			performQuickSort(input, i, high);
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
		performQuickSort(input, 0, input.length - 1);
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