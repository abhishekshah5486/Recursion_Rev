import java.util.*;

public class invertedPyramid {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printInvertedPyramid(n, 0);
        scn.close();
    }
    public static void printInvertedPyramid(int n, int sp){
        if (n == 0) return;
        for (int j=0; j<sp; j++){
            System.out.print(" ");
        }
        for (int j=1; j<=(2*n -1); j++){
            if (j == (2*n - 1)) System.out.println("*");
            else System.out.print("*");
        }
        printInvertedPyramid(n-1, sp+1);
    }
}

// *******
//  *****
//   ***
//    *

// (2n - 1) stars in the nth level
// (N - n + 1) spaces ==> where N is the total no. of rows, n is the nth level
