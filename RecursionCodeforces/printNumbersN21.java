// package RecursionCodeforces;

import java.util.Scanner;

public class printNumbersN21 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        solvePrintNumbersN21(N);
        read.close();
    }
    public static void solvePrintNumbersN21(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        solvePrintNumbersN21(n-1);
    }
}
