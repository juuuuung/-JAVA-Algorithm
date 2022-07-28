package baekjoon.problem.method;

import java.io.*;

public class Problem_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
        int c = 0;
        for(int i = 1; i <= N; i++)if(i < 100 || (i/100 + i%10) == ((i/10%10)*2))c++;
        System.out.println(c);
    }
}