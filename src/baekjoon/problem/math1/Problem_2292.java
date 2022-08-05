package baekjoon.problem.math1;

import java.io.*;

public class Problem_2292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int count = 1; // 최소 카운트
		int result = 1; // result += i*6 if n리 퐘 되면 break;
		if (N == 1) {
			System.out.println(1);
		} else {
			while (N > result) {
				result += 6 * count;
				count++;
			}
			System.out.println(count);
		}
	}

}
