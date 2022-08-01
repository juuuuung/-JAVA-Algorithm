package baekjoon.problem.arrays;

import java.io.*;
import java.util.StringTokenizer;

public class Problem_4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int C = Integer.parseInt(br.readLine());

		for (int i = 0; i < C; i++) {
			// 숫자를 공백으로 나눠줌 - > 5 50 40 30 90 100
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");

			// 나눌 숫자
			int person = Integer.parseInt(token.nextToken());
			// 5
			int[] arr = new int[person];

			int mean = 0;
			for (int j = 0; j < person; j++) {
				arr[j] = Integer.parseInt(token.nextToken());
				mean += arr[j];
			}
			mean /= person;

			float count = 0.0f;
			for (int j = 0; j < person; j++) {
				if (arr[j] > mean) {
					count++;
				}
			}
			bw.write(String.format("%.3f", (count / person) * 100) + "%\n");
		}
		bw.flush();
		bw.close();
	}
}
