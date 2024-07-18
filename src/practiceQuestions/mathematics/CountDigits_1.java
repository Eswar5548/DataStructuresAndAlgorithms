package practiceQuestions.mathematics;

import java.util.Scanner;

public class CountDigits_1 {
    public static void main(String[] arg){
       //count digits in a number its done by  the removing digits in a number and counting the digits
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = countDigits(n);
        System.out.println(res);
    }
    static int countDigits(int n){
        int res=0;
        while(n>0){
            res++;
            n = n/10;
        }
        return res;
    }
}
