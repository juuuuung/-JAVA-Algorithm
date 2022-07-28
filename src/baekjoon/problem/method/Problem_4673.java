package baekjoon.problem.method;

public class Problem_4673 {
    public static void main(String[] args) {
        final int Max = 10000;

        boolean[] arr = new boolean[Max];

        for(int i =1; i <= Max; i++){
            int num = d(i);
            if(num < Max){
                arr[num] = true;
            }
        }
        StringBuilder strbuilder = new StringBuilder();
        for(int i =1; i < Max; i++){
            if(!arr[i])
                strbuilder.append(i).append("\n");
            }
        System.out.println(strbuilder.toString());
    }

    public static int d(int n){
        int num = n;
        while(n != 0){
            num += (n%10);
            n /= 10;
        }
        return num;
    }
}
