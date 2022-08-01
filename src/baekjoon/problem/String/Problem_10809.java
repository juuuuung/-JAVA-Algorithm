package baekjoon.problem.String;

import java.io.*;

public class Problem_10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] arr = br.readLine().toCharArray();

		int[] alpha = new int[26];

		for (int i = 0; i < 26; i++) {
			alpha[i] = -1;
		}

		for (int i = 0; i < arr.length; i++) {
			int a = arr[i] - 'a';
			if (alpha[a] == -1)
				alpha[a] = i;
		}

		for (int a : alpha)
			System.out.println(a);
	}
}
