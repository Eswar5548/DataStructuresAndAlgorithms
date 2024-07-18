package practiceQuestions.mathematics;

import java.util.Scanner;

public class TrailingZeroesInFactorial_4 {
    // after finding factorial of number -- we have to find out how many zeroes are at end
    // 2 methods -> naive solution after finding a factorial of number we have to take last digit and if its is zero then count it
    //           -> efficient method -- here we have to find prime factorization of 2 and 5 so we can get 0 at end , here min Occuring is 5 so if we find prime factorization of 5 then we can find the answer , and we know for each multiple of 5 ( one extra 5 will come so we have to find that extra multiple of 5 and then we have to count it


    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        System.out.println(trailingZeroesInFactorialNaiveMethod(n)+" Naive method");
        System.out.println(trailingZeroesInFactorialEfficientMethod(n) +" efficient");
    }

    private static long  trailingZeroesInFactorialNaiveMethod(long n) {
        long res=1;
        int count=0;
        while(n>0){
            res = res*n;
            n = n-1;
        }
        while(res%10==0) {
            count++;
            res = res/10;
        }
        return count;
    }

    private static int trailingZeroesInFactorialEfficientMethod(int n) {
        int  count=0;
        for(int i=5;i<=n;i=i*5){
            count = count + (n/i);
        }
        return count;
    }
}
