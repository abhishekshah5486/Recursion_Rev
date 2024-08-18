// package RecursionCodeforces;

import java.util.Scanner;

public class checkIfStringPalindromic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(isPalindromic(str, 0, str.length()-1));
        scn.close();
    }
    public static boolean isPalindromic(String str, int s, int e ){
        if (s > e) return true;
        if (str.charAt(e) == str.charAt(s)){
            return isPalindromic(str, s+1, e-1);
        }
        return false;
    }
}
