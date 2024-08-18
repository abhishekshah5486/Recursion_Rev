import java.util.*;

public class NumberOfWays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int s = scn.nextInt();
        int e = scn.nextInt();
        System.out.println(solveWaysToReach(s, e));
        scn.close();
    }
    public static int solveWaysToReach(int s, int e){
        // Base condition
        if (s == e) return 1;
        else if (s > e) return 0;
        // Taking 1 step
        int ans1 = solveWaysToReach(s+1, e);
        // 2 steps
        int ans2 = solveWaysToReach(s+2, e);
        // 3 steps
        int ans3 = solveWaysToReach(s+3, e);
        return (ans1 + ans2 + ans3);
    }
}
