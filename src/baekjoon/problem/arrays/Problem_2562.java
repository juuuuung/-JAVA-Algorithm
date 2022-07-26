package baekjoon.problem.arrays;

import java.io.*;

public class Problem_2562 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int max = 0;
        for(int i =1; i< 10; i++){
            int a = Integer.parseInt(br.readLine());
            if(a > max){
                max = a;
                count = i;
            }
        }
        br.close();
        System.out.println(max+"\n"+count);
    }
}
