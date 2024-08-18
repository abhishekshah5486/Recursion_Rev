import java.util.*;

public class ReachValue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();

        for (int j=0; j<T; j++){
            long N = scn.nextLong();
            boolean rslt = solveReachValue(N, 1);
            if (rslt) System.out.println("YES");
            else System.out.println("NO");
        }
        scn.close();
    }
    public static boolean solveReachValue(long n, long currVal){
        if (currVal == n) return true;
        else if (currVal > n) return false;
        // Multiply current value by 10
        boolean ans1 = solveReachValue(n, currVal * 10);
        // Multiply current value by 20
        boolean ans2 = solveReachValue(n, currVal * 20);
        return (ans1 || ans2);
    }
}
