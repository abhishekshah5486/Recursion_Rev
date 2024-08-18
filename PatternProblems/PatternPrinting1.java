import java.util.*;

public class PatternPrinting1 {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       solvePatternPrinting(n, 0);
       scn.close();
    }
    public static void solvePatternPrinting(int n, int idx){
        if (n == 0) return;
        // Print spaces
        for (int j=0; j<idx; j++){
            System.out.print(" ");
        }
        for (int j=0; j<n; j++){
            System.out.print("* ");
        }
        System.out.println();
        // Recursive Function Call
        solvePatternPrinting(n-1, idx + 1);
        // Print spaces
        for (int j=0; j<idx; j++){
            System.out.print(" ");
        }
        for (int j=0; j<n; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}


/*Star Pattern 10

* * * * * 

 * * * * 

  * * * 

   * * 

    * 

    * 

   * * 

  * * * 

 * * * * 

* * * * *   */
