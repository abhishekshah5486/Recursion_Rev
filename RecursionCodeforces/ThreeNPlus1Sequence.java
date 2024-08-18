import java.util.*;

public class ThreeNPlus1Sequence{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(solve3NPlus1Sequence(n));
        scn.close();
    }
    public static int solve3NPlus1Sequence(int n){
        if (n == 1) return 1;
        if (n % 2 == 0){
            return 1 + solve3NPlus1Sequence(n/2);
        }
        else return 1 + solve3NPlus1Sequence(3*n + 1);
    }

}

// Given a number 𝑛
// , you should print the length of the 3𝑛+1
//  sequence starting with 𝑛
// .

// The sequence is constructed as follows:

// If the number 𝑛
//  is odd, the next number will be 3𝑛+1
// .
// If the number 𝑛
//  is even, the next number will be 𝑛/2
// .
// For example, the 3𝑛+1
//  sequence of 3
//  is {3,10,5,16,8,4,2,1
// } and its length is 8
// .

// Note: Solve this problem using recursion.