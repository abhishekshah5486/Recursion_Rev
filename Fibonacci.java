import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        // System.out.println(calcFibonacci(n));
        int fb1 = 0;
        int fb2 = 1;
        System.out.print(fb1 + " ");
        System.out.print(fb2 + " ");
        printFibonacci(n-2, fb1, fb2);
        read.close();
    }
    public static int calcFibonacci(int n){
        if (n == 1) return 0;
        else if (n == 2) return 1;
        int fb_nm1 = calcFibonacci(n-1);
        int fb_nm2 = calcFibonacci(n-2);
        int fb_n = fb_nm1 + fb_nm2;

        return fb_n;
    }
    public static void printFibonacci(int n, int fb1, int fb2){
        if (n == 0) return;

        int fb = fb1 + fb2;
        System.out.print(fb + " ");
        printFibonacci(n-1, fb2, fb);
    }
}
