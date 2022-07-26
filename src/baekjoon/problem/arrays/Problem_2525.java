package baekjoon.problem.arrays;

import java.util.Scanner;

public class Problem_2525{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Hour = in.nextInt(),
        Minuate = in.nextInt(),
        Complete = in.nextInt();
        in.close();
        
        System.out.println((Hour + (Minuate + Complete)/60)%24 +" "+ (Minuate + Complete)%60);
    }
}