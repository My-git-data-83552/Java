package com.sunbeam;

import java.util.Comparator;

public class GenericSort {

	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = i + 1; j < arr.length; j++)

				if (c.compare(arr[i], arr[j]) > 0) {

					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
	}

	public static void main(String[] args) {
		class GenericMethod implements Comparator<Integer> {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				int diff = Integer.compare(arg0, arg1);
				return diff;
			}
		}
		GenericMethod gn = new GenericMethod();
		Integer[] arr1 = { 11, 44, 22, 67, 10 };
		System.out.println("before sort");
		for (Integer ele : arr1) {
			System.out.print(ele + " ");

		}
		selectionSort(arr1, gn);
		System.out.println("\nafter sort");
		for (Integer ele : arr1) {
			System.out.print(ele + " ");

		}

	}

}
