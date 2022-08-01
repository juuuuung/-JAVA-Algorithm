package baekjoon.problem.String;

import java.io.*;

public class Problem_11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		String nums = br.readLine();
		int result = 0;

		for (int i = 0; i < N; i++)
			result += (int) (nums.charAt(i));

		System.out.println(result - (N * 48));
	}
}
