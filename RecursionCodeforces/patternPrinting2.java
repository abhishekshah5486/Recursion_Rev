import java.util.Scanner;

public class patternPrinting2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        solvePatternPrinting(n);
        scn.close();
    }
    public static void solvePatternPrinting(int n){
        // base condition
        if (n == 0) return;
        for(int j=1; j<=n; j++){
            if (j == n) System.out.println(n);
            else System.out.print(j + " ");
        }
        // Assume inner fxn prints for n-1 rows
        solvePatternPrinting(n-1);
    }
}

// 1 2 3 … n
// 1 2 3
// 1 2
// 1

