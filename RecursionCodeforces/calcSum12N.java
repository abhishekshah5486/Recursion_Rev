import java.util.Scanner;

public class calcSum12N {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(sum_1_to_n(n));
        scn.close();
    }
    public static int sum_1_to_n(int n){
        if (n == 0) return 0;
        int sum_nm1 = sum_1_to_n(n-1);
        return sum_nm1 + n;
    }
}
