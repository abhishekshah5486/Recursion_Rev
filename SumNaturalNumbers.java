public class SumNaturalNumbers {
    public static void main(String[] args) {
        int n = 5;
        // 1 2 3 4 5 
        sumNaturalNumbers(1, n, 0);
        System.out.println(sumNaturalNumbersReturn(1, n, 0));
    }
    public static void sumNaturalNumbers(int idx, int n, int sum){
        // Base condition
        if (idx > n){
            System.out.println(sum);
            return;
        }
        // Fn takes its first step
        // sum variables changes with levels in the recursive calls
        sum += idx;
        sumNaturalNumbers(idx+1, n, sum);
    }
    public static int sumNaturalNumbersReturn(int idx, int n, int sum){
        // Base condition
        if (idx > n){
            return sum;
        }
        // Fn takes its first step
        // sum variables changes with levels in the recursive calls
        sum += idx;
        return sumNaturalNumbersReturn(idx+1, n, sum);
    }
}
