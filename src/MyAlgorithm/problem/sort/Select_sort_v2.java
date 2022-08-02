package MyAlgorithm.problem.sort;

import java.util.Arrays;

public class Select_sort_v2 {
	final static int[] arr = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };

	public static void main(String[] args) {
		// O(N^2) ---> {10 * (10 + 1)} / 2
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			swap(i, min);
		}
		System.out.println(Arrays.toString(arr));
	}

	// O(N)
	public static void swap(int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
