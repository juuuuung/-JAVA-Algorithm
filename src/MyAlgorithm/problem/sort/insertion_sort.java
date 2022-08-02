package MyAlgorithm.problem.sort;

import java.util.Arrays;

public class insertion_sort {
	static int[] arr = { 10, 1, 5, 8, 7, 6, 4, 3, 2, 9 };

//	 1, 5, 8, 10, 7, 6, 4
	public static void main(String[] args) {
		for (int i = 1; i < arr.length; i++) {
			int target = arr[i];
			int j = i - 1;
//			 targer = 1, j = 0
//			 1, 10, 5
			while (j >= 0 && target < arr[j]) {
//				 1, 10, 10
				arr[j + 1] = arr[j];
				j--;
			}
//			 1, 5, 10
			arr[j + 1] = target;
		}

		// O(N^2)
		System.out.println(Arrays.toString(arr));

	}
}
