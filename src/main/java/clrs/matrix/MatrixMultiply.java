package clrs.matrix;

import java.util.Arrays;

public class MatrixMultiply {
    public static void main(String[] args){
        int[][] a = {
                {1,2,3},
                {2,6,4},
                {3,4,5}
        };
        System.out.println("IN  A:");
        System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(a[1]));
        System.out.println(Arrays.toString(a[2]));
        int[][] b = {
                {3,1,1},
                {4,3,8},
                {7,2,3}
        };
        System.out.println("IN  B:");
        System.out.println(Arrays.toString(b[0]));
        System.out.println(Arrays.toString(b[1]));
        System.out.println(Arrays.toString(b[2]));
        MatrixMultiply mm = new MatrixMultiply();
        int[][] c = mm.squareMatrixMultiply(a,b);
        System.out.println("OUT C:");
        System.out.println(Arrays.toString(c[0]));
        System.out.println(Arrays.toString(c[1]));
        System.out.println(Arrays.toString(c[2]));
    }

    private int[][] squareMatrixMultiply(int[][] A, int[][] B){
        System.out.println("A.leght = " + A.length);
        int n = A.length;
        int[][] C = new int[n][A[0].length];
        for(int i=0;i < n;i++){
            for(int j=0;j < n;j++){
                C[i][j] = 0;
                for(int k=0;k < n;k++){
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }
}
