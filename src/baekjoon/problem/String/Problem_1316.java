package baekjoon.problem.String;

import java.io.*;
import java.util.Arrays;

public class Problem_1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			Boolean is = true;
			Boolean[] alpha = new Boolean[26];
			Arrays.fill(alpha, false);
			char[] word = br.readLine().toCharArray();

			alpha[(int) word[0] - 'a'] = true;
			for (int j = 1; j < word.length; j++) {
				if (word[j] != word[j - 1]) {
					if (alpha[(int) word[j] - 'a'] == true) {
						is = false;
						break;
					}
					alpha[(int) word[j] - 'a'] = true;
				}
			}
			if (is == true)
				cnt++;
		}
		System.out.println(cnt);
	}
}