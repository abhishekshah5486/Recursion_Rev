public class calcPowerOptimized {
    public static void main(String[] args) {
        int n = 5;
        int x = 2;

        // System.out.println(solveCalcPowerOptimized(n, x));
        System.out.println(solveCalcPowerMoreOptimized(n, x));
    }
    public static int solveCalcPowerOptimized(int n, int x){
        if (n == 0) return 1;
        if (x == 0) return 0;

        // if n is even
        if (n % 2 == 0){
            return solveCalcPowerOptimized(n/2, x) * solveCalcPowerOptimized(n/2, x);
        }
        else return solveCalcPowerOptimized(n/2, x) * solveCalcPowerOptimized(n/2, x) * x;

        // Stack Height --> log(N);
    }
    // More optimized
    public static int solveCalcPowerMoreOptimized(int n, int x){
        if (n == 0) return 1;
        if (x == 0) return 0;

        int calcPow_nb2 = solveCalcPowerMoreOptimized(n/2, x);
        // if n is even
        if (n % 2 == 0){
            return calcPow_nb2 * calcPow_nb2;
        }
        else return calcPow_nb2 * calcPow_nb2 * x;
        // Stack Height --> log(N)
    }
}
