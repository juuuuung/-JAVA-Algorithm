package MyAlgorithm.problem.sort;

import java.util.Arrays;

public class insertion_sort {
	static int[] arr = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };

	// 1, 5, 8, 10, 7, 6, 4
	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j - 1] > arr[j]) {
					swap(j - 1, j);
				}
			}
		}

		// O(N^2)
		System.out.println(Arrays.toString(arr));

	}

	public static void swap(int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
