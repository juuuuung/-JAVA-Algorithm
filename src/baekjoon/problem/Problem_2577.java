package baekjoon.problem;

import java.io.*;

// 세 개의 자연수 A, B, C가 주어질 때 A × B × C를
//  계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 
//  구하는 프로그램을 작성하시오.

// 예를 들어 A = 150, B = 266, C = 427 이라면
//  A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
//  계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 

public class Problem_2577 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int multiply;
		int[] cnt = new int[10];
		multiply = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		br.close();
		while(multiply != 0){
			cnt[multiply%10] += 1;
			multiply /=10;
		}
		for(int s: cnt)
			System.out.println(s);
	}
}
