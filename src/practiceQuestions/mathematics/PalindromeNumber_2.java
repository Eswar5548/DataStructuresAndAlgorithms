package practiceQuestions.mathematics;

import java.util.Scanner;

public class PalindromeNumber_2 {
    public static void main(String[] arg){
       // we can get the palindrome of number by traversing a number from right to left  ==> we can find reverse number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
    static boolean isPalindrome(int n){
         int temp = n;
         int rev =0;
         while(temp>0){
             int rem = temp%10;
             rev = rev*10+rem;
             temp = temp/10;
         }
         return (rev==n);
    }
}


