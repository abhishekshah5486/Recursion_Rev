public class PrintNumbers15{
    public static void main(String[] args) {
        int n = 1;
        printNumbers(n);
    }
    public static void printNumbers(int n){
        // Base case
        if (n > 5) return;
        // Outer fn takes step 1 and assumes rest task to be completed or returned by the inner fn calls.
        System.out.println(n);
        printNumbers(n+1);
    }
}