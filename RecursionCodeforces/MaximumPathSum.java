import java.util.*;

public class MaximumPathSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for (int j=0; j<n; j++){
            for (int k=0; k<m; k++){
                arr[j][k] = scn.nextInt();
            }
        }
        System.out.println(maxPossibleSum(arr, 0, 0));
        scn.close();
    }
    public static long maxPossibleSum(int[][] arr, int r, int c){
        if (r == arr.length-1 && c == arr[0].length-1) return arr[r][c];
        else if (r >= arr.length || c >= arr[0].length) return Integer.MIN_VALUE;
        // Moving down
        long down = arr[r][c] + maxPossibleSum(arr, r+1, c);
        // Moving right
        long right = arr[r][c] + maxPossibleSum(arr, r, c+1);
        return Math.max(down, right);
    }
}
