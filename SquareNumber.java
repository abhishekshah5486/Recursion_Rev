public class SquareNumber {
    public static void main(String[] args) {
        // Stack height n
        int n = 5;
        int x = 3;
        System.out.println(calcSquare(1, x, n, 1));
    }
    // public static int calcSquare(int x, int n){
    //     if (n == 0) return 1;
    //     int sq_nm = calcSquare(x, n-1);
    //     return sq_nm * x;
    // }
    public static int calcSquare(int idx, int x, int n, int pow){
        if (idx > n) return pow;
        pow = pow * x;
        return calcSquare(idx+1, x, n, pow);
    }
}
