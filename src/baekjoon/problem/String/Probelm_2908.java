package baekjoon.problem.String;

import java.io.*;
import java.util.StringTokenizer;

public class Probelm_2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(br.readLine());

		int num1 = cal(Integer.parseInt(token.nextToken())), num2 = cal(Integer.parseInt(token.nextToken()));

		if (num1 > num2)
			System.out.println(num1);
		else
			System.out.println(num2);
	}

	public static int cal(int num) {
		int result = 0;
		// 일의 자리를 백의 자리로
		result += (num % 10) * 100;
		result += ((num / 10) % 10) * 10;
		result += (num / 100);

		return result;
	}

}
