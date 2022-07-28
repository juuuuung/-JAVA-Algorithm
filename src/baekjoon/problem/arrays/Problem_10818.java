package baekjoon.problem.arrays;

import java.io.*;
import java.util.StringTokenizer;

public class Problem_10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int max = -1_000_000;
        int min = 1_000_000;

        StringTokenizer token = new StringTokenizer(br.readLine(), " ");
        if(token.countTokens() == N){
            while(token.hasMoreTokens()){
                int next = Integer.parseInt(token.nextToken());
                if(next > max) max = next;
                if(next < min) min = next;
            }
        }

        System.out.println(min+" "+max);
        
    }
}
