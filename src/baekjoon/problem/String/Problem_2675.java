package baekjoon.problem.String;

import java.io.*;

public class Problem_2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			char[] arr = (br.readLine()).toCharArray();
			int cnt = (int) arr[0] - '0';
			for (int j = 2; j < arr.length; j++)
				for (int k = 0; k < cnt; k++)
					bw.write(arr[j]);
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

}
