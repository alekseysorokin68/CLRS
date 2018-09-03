package clrs.sort;

import java.util.Arrays;

public class MergeSort {
    public void mergeSort(int[] A,int p, int r){
        if(p < r){
            int q = (p + r)/ 2;
            mergeSort(A,p,q);
            mergeSort(A,q+1,r);
            merge(A,p,q,r);
        }
    }
    private void merge(int[] A,int p, int q, int r){
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];
        for(int i=0;i < n1;i++){
            L[i] = A[p + i];
        }
        for(int j=0;j < n2;j++){
            R[j] = A[q + j +1];
        }
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        for(int k=p;k <= r;k++){
            if(L[i] <= R[j]){
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
        }
    }

    public static void main(String[] args){
        MergeSort ms = new MergeSort();
        int[] A = new int[]{5, 2, 4, 7,1, 3, 2, 6};
        System.out.println("IN :" + Arrays.toString(A));
        ms.mergeSort(A,0,A.length-1);
        System.out.println("OUT:" + Arrays.toString(A));
    }
}
