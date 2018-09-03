package clrs.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] A){

       for(int j=1;j < A.length;j++){
           int key = A[j];
           int i = j - 1;
           while(i >= 0 && A[i] > key){
               A[i + 1] = A[i];
               i = i - 1;
           }
           A[i + 1] = key;
       }
    }

    public static void main(String[] args){
        int[] A = new int[]{31,41,59,26,41,58};
        System.out.println("IN :" + Arrays.toString(A));
        InsertionSort.sort(A);
        System.out.println("OUT:" + Arrays.toString(A));
    }
}
