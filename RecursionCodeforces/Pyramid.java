import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        solvePyramid(n, 0);
        scn.close();
    }
    public static void solvePyramid(int n, int sp){
        // base condition
        if (n == 0) return;
        solvePyramid(n-1, sp+1);
        for (int j=0; j<sp; j++){
            System.out.print(" ");
        }
        for (int j=1; j<=(2*n-1); j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

//      *
//     ***
//    *****
//   *******
// 2n-1 stars in nth level
// (N-n) spaces in the nth level, where N is the total no. of levels