package baekjoon.problem.arrays;

import java.io.*;

public class Problem_8958{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N];
        
        for(int i = 0; i < N; i++){
            String text = br.readLine();
            if(text.length() <= 80){
                String[] ox = text.split("X");
                for(String s : ox)
                    if(s.startsWith("O")) score[i] += ((s.length())*(s.length()+1))/2;
            } else break;
        }
        br.close();
        for(int s : score)System.out.println(s);
    }
}