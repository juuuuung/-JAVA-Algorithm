package baekjoon.problem.String;

import java.io.*;

public class Problem_1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] cnt_arr = new int[26];
		String word = br.readLine();

		for (int i = 0; i < word.length(); i++) {
			if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
				cnt_arr[word.charAt(i) - 65] += 1;
			} else {
				cnt_arr[word.charAt(i) - 97] += 1;
			}
		}

		int max = 0;
		char a = 'a';
		for (int i = 0; i < 26; i++) {
			if (cnt_arr[i] > max) {
				max = cnt_arr[i];
				a = (char) (i + 65);
			} else if (cnt_arr[i] == max) {
				a = '?';
			}
		}

		System.out.println(a);

	}
}
