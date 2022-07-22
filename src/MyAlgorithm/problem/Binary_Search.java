package MyAlgorithm.problem;

import java.util.Scanner;

public class Binary_Search {

    public static void main(String[] args) {
        //배열이 깔끔하게 정렬 되었다는 가정하에
        int[] Int_Array = new int[100];
    
        for(int i =0; i < Int_Array.length; i++) Int_Array[i] = i+1;

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();

        Binary(Int_Array, num);
        
    }
    public static void Binary(int[] arr, int num){
        int count =0;
        int LastMaxIndex = arr.length;
        int LastMinIndex = arr.length/2;
        int KnowIndex = 50;

        while(KnowIndex != num){
            if(KnowIndex < num){
                LastMinIndex = KnowIndex;
                count++;
                KnowIndex = LastMaxIndex - ((LastMaxIndex - LastMinIndex) / 2);
            } else {
                if(KnowIndex == 50){
                    LastMinIndex = 0;
                }
                LastMaxIndex = KnowIndex; 
                KnowIndex = LastMaxIndex - ((LastMaxIndex - LastMinIndex) / 2);
                count++;
            }
        }
        System.out.printf("%d번탐색 %d 인덱스", count, KnowIndex);
    }
   
}
