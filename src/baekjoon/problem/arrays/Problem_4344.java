package baekjoon.problem.arrays;

import java.io.*;
import java.util.StringTokenizer;

public class Problem_4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr;
		StringTokenizer token;
        
		int C = Integer.parseInt(br.readLine());
        
		for (int i = 0; i < C; i++) {
			token = new StringTokenizer(br.readLine(), " ");

            
			int N = Integer.parseInt(token.nextToken());
			arr = new int[N];
            
			int result = 0;
			for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(token.nextToken());
				result += arr[j];
			}

			result /= N;
            Float count = 0.0f;
            
			for (int j = 0; j < arr.length; j++)if (arr[j] > result)count++;
			bw.write(String.format("%.3f", (count/N)*100)+"%\n");
		}
        bw.flush();
        bw.close();
        br.close();
	}
}
