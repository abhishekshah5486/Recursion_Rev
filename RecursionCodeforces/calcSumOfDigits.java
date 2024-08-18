import java.util.Scanner;

public class calcSumOfDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(sum_of_digits(n));
        scn.close();
    }
    public static int sum_of_digits(int n){
        if (n == 0) return 0;
        return n%10 + sum_of_digits(n/10);
    }
}