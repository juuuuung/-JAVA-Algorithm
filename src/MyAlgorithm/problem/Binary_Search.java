package MyAlgorithm.problem;

import java.util.Scanner;

public class Binary_Search {

    public static void main(String[] args) {
        int[] Int_Array = new int[100];
    
        for(int i =0; i < 100; i++) Int_Array[i] = i;

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        Binary(Int_Array, num);
        
    }
    
    //올라갈때 lastMinIndex = 50, 내려갈때 LastMaxIndex = 75;
    public static void Binary(int[] arr, int num){
        int count =0; //1이 됬다면 한번 실행된거 아니라면 실행 안된거
        int LastMaxIndex = arr.length; //100
        int LastMinIndex = arr.length/2; //50
        int KnowIndex = 50;

        while(KnowIndex != num){
            if(KnowIndex < num){ //올라갈때 작았던 index보다 찾는 수가 크다면 인덱스는 올라가야됨 ===> 올라가면 LastMinIndex를 재 설정
                LastMinIndex = KnowIndex;
                count++;
                KnowIndex = LastMaxIndex - ((LastMaxIndex - LastMinIndex) / 2); //현재 절반 인덱스
                System.out.printf("(오른쪽으로) | %d번째 lsat: %d , max: %d, know: %d\n", count, LastMinIndex, LastMaxIndex, KnowIndex);
            } else { //내려갈때 index보다 찾는 수가 작다면 인덱스는 내려가야함 왼쪽으로 가야함 ==> 내려가면 LastMaxIndex를 재설정 현재 덱스로
                if(count == 0){
                    LastMinIndex = 0;
                }
                // else if(count == 10){ //! 디버깅을 위한 개수 제한
                //     break;
                // }
                LastMaxIndex = KnowIndex; 
                KnowIndex = LastMaxIndex - ((LastMaxIndex - LastMinIndex) / 2);
                count++;
                System.out.printf("(왼쪽으로) | %d번째 lsat: %d , max: %d, know: %d\n", count, LastMinIndex, LastMaxIndex, KnowIndex);
            }
        }
        System.out.println(LastMinIndex);
    }
   
}
