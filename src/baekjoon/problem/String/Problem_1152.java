package baekjoon.problem.String;

import java.io.*;

public class Problem_1152 {

	public static void main(String[] args) throws IOException {
		int cnt = 0;
		int know = ' ';

		while (true) {
			int ch = System.in.read();
			if (ch == '\n') {
				if (know != ' ') {
					cnt++;
				}
				break;
			}
			if (ch == ' ') {
				if (know != ' ') {
					cnt++;
				}
			}
			know = ch;
		}
		System.out.println(cnt);
	}

}
