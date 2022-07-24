package baekjoon.problem;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_1546 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        float max = 0;
        float result = 0;
        float[] arr = new float[N];

        for(int i = 0; i < N; i++){
            arr[i] = s.nextInt();
            if(arr[i] > max) max = arr[i];
        }
        s.close();

        for(int i =0; i < N; i++){
            result += (arr[i]/max*100)/N;
        }

        System.out.println(result);
    }
}