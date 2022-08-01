package MyAlgorithm.problem.sort;

import java.util.Arrays;

public class Bubble_sort {

	static int[] arr = { 100, 10, 5, 8, 7, 6, 4, 3, 2, 9 };

	public static void main(String[] args) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(j, j + 1);
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void swap(int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
