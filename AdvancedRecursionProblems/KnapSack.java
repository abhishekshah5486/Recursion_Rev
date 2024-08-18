// package AdvancedRecursionProblems;
import java.util.*;

public class KnapSack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int W = scn.nextInt();

        int[][] weights = new int[N][2];
        for (int j=0; j<N; j++){
            weights[j][0] = scn.nextInt();
            weights[j][1] = scn.nextInt();
        }
        System.out.println(solveKnapSack(weights, 0, W));
        scn.close();
    }
    public static int solveKnapSack(int[][] weights, int idx, int maxWt){
        if (idx >= weights.length) return 0;
        // Include the current idx weight 
        int includeAns = (maxWt >= weights[idx][0]) ? (weights[idx][1] + solveKnapSack(weights, idx+1, maxWt- weights[idx][0])) : 0;
        // Skipping the current idx weight
        int notIncludeAns = solveKnapSack(weights, idx+1, maxWt);
        return Math.max(includeAns, notIncludeAns);
    }
}
