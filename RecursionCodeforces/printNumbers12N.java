package RecursionCodeforces;

import java.util.Scanner;

public class printNumbers12N {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        solvePrintNumbers12N(N);
        read.close();
    }
    public static void solvePrintNumbers12N(int n){
        if (n == 0) return;
        solvePrintNumbers12N(n-1);
        System.out.println(n);
    }
}
