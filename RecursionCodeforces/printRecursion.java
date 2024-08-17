// package RecursionCodeforces;

import java.util.Scanner;

public class printRecursion {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        solvePrintRecursion(N);
        read.close();
    }
    public static void solvePrintRecursion(int n){
        if (n == 0) return;
        solvePrintRecursion(n-1);
        System.out.println("I love recursion.");
    }
}

// Given a number 𝑁
// . Print "I love Recursion" 𝑁
//  times.

// Note: Solve this problem using recursion.
