import java.util.*;

public class creatingExpression {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int X = scn.nextInt();

        int[] arr = new int[N];
        for (int j=0; j<N; j++){
            arr[j] = scn.nextInt();
        }
        boolean ans = solveCreatingExpression(arr, 1, arr[0], X);
        if (ans) System.out.println("YES");
        else System.out.println("NO");
        scn.close();
    }
    public static boolean solveCreatingExpression(int[] arr, int idx, int currentExpValue, int X){
        if (idx == arr.length){
            if (currentExpValue == X) return true;
            return false;
        }
        // Adding the current value to the expression
        boolean ans1 = solveCreatingExpression(arr, idx+1, currentExpValue + arr[idx], X);
        // Subtracting the current value to the expression
        boolean ans2 = solveCreatingExpression(arr, idx+1, currentExpValue - arr[idx], X);

        return (ans1 || ans2);
    }
}