public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        printFactorial(n, 1);
        System.out.println(printFactorialReturn(n));
    }
    public static void printFactorial(int n, int result){
        if (n == 0){
            System.out.println(result);
            return;
        }
        result = result * n;
        printFactorial(n-1, result);
    }
    public static int printFactorialReturn(int n){
        if (n == 0 || n == 1) return 1;
        int fact_nm = printFactorialReturn(n-1);
        int fact_n =  n * fact_nm;
        return fact_n;
    }
}
