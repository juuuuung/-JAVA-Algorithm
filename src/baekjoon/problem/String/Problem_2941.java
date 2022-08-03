package baekjoon.problem.String;

import java.io.*;

public class Problem_2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		String st = br.readLine().trim();

		for (int i = 0; i < arr.length; i++) {
			if (st.contains(arr[i])) {
				st = st.replace(arr[i], ".");
			}
		}
		System.out.println(st.length());
	}
}
