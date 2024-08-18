import java.util.*;

public class Log2_Recursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        System.out.println(calcLogN(n));
        scn.close();
    }
    public static int calcLogN(long n){
        if (n <= 1) return 0;
        int remainingAns = calcLogN(n/2);
        return 1 + remainingAns;
    }
}

// Given a number 𝑁
// . Print ⌊𝑙𝑜𝑔2(𝑁)⌋
// .

// Note: Solve this problem using recursion.

