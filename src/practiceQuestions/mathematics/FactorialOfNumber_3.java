package practiceQuestions.mathematics;


import java.util.Scanner;

public class FactorialOfNumber_3 {
    // factorial of number --> multiply of each number
    // we have 2 options to get factorial -> 1) iterative solution ( take each element and multiply each)
    //                                       2) recursion solution

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorialOfIterative(n));
        System.out.println(factorialOfRecursion(n));
    }

    private static int factorialOfRecursion(int n) {
        if(n==0) return 1;
        return n*factorialOfRecursion(n-1);
    }

    private static int  factorialOfIterative(int n) {
        int res=1;
        while(n>0){
            res = res*n;
            n=n-1;
        }
        return res;
    }
}
