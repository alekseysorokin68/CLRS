package clrs.sort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    private int partition(int[] A, int p, int r){
        int x = A[r];
        int i = p - 1;
        for(int j=p;j < r;j++){
            if(A[j] <= x){
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i+1];
        A[i+1] = A[r];
        A[r] = temp;
        return i + 1;
    }
    private void quicksort(int[] A, int p, int r){
        if(p < r){
            int q = partition(A,p,r);
            quicksort(A,p,q-1);
            quicksort(A,q+1,r);
        }
    }

    public static void main(String[] args){
        int[] A = new int[]{13 ,19 , 9 , 5 , 12, 5, 11 , 8 , 7 , 4 , 21 , 2 , 6 , 11};
        System.out.println("IN  A:" + Arrays.toString(A));
        QuickSort qs = new QuickSort();
        qs.randomizedQuicksort(A,0,A.length-1);
        System.out.println("OUT A:" + Arrays.toString(A));
    }

    private int random(int p , int r){
        Random random = new Random();
        int randomInt = p + random.nextInt(r - p);
        return randomInt;
    }

    private int randomizedPartition(int[] A , int p , int r){
        int i = random(p,r);
        int temp = A[r];
        A[r] = A[i];
        A[i] = temp;
        return partition(A,p,r);
    }
    public void randomizedQuicksort(int[] A , int p , int r){
        if(p < r){
            int q = randomizedPartition(A,p,r);
            randomizedQuicksort(A,p,q-1);
            randomizedQuicksort(A,q+1,r);
        }
    }
}
