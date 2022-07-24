package baekjoon.problem;

import java.io.*;
import java.util.Arrays;

public class Problem_1546 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double result = 0;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i =0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine())*100;
        br.close();
        Arrays.sort(arr);
        int max = arr[arr.length-1]/100;
        for(int i =0; i < N; i++){
            result += arr[i]/max;
        }

        System.out.println(result/N);
        
    }
}
