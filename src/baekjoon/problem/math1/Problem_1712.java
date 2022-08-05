package baekjoon.problem.math1;

import java.io.*;
import java.util.StringTokenizer;

public class Problem_1712 {

	public static void main(String[] args) throws IOException {
		// 손익 분기점 공식
		// 고정비/(1-(변동비/매출액)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");

		int set = Integer.parseInt(token.nextToken());
		int variance = Integer.parseInt(token.nextToken());
		int sales = Integer.parseInt(token.nextToken());

		if (sales <= variance)
			System.out.println("-1");
		else
			System.out.println((set / (sales - variance) + 1));
	}
}