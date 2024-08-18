import java.util.*;

public class sumMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] matrixA = new int[r][c];
        int[][] matrixB = new int[r][c];

        for (int j=0; j<r; j++){
            for (int k=0; k<c; k++){
                matrixA[j][k] = scn.nextInt();
            }
        }
        for (int j=0; j<r; j++){
            for (int k=0; k<c; k++){
                matrixB[j][k] = scn.nextInt();
            }
        }
        addMatrix(r-1, c-1, matrixA, matrixB);
        scn.close();
    }
    public static void addMatrix(int r, int c, int[][] matrixA, int[][] matrixB){
        if (r < 0) return;
        if (c < 0){
            addMatrix(r-1, matrixA[0].length-1, matrixA, matrixB);
            return;
        }
        addMatrix(r, c-1, matrixA, matrixB);
        if (c == matrixA[0].length-1) System.out.println(matrixA[r][c] + matrixB[r][c]);
        else System.out.print(matrixA[r][c] + matrixB[r][c] + " ");
    }
}
