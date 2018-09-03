package clrs.sort;

import clrs.main.Heap;

import java.util.Arrays;

public class HeapSort {
    private int parent(int i){
        return i/2;
    }
    private int left(int i){
        return i*2;
    }
    private int right(int i){
        return i*2 + 1;
    }
    private void maxHeapify(Heap A, int i){
        int l = left(i);
        int r = right(i);
        int largest = 1;
        if(l <= A.getHeapSize() && A.getHeapArr()[l-1] > A.getHeapArr()[i-1]){
            largest = l;
        } else largest = i;
        if(r <= A.getHeapSize() && A.getHeapArr()[r-1] > A.getHeapArr()[largest-1]){
            largest = r;
        }
        if(largest != i){
            int temp = A.getHeapArr()[i-1];
            A.getHeapArr()[i-1] = A.getHeapArr()[largest-1];
            A.getHeapArr()[largest-1] = temp;
            maxHeapify(A,largest);
        }
    }
    private void buildMaxHeap(Heap A){
        A.setHeapSize(A.getHeapArr().length);
        for(int i = (A.getHeapArr().length/2);i >= 1;i--){
            maxHeapify(A,i);
        }
    }
    private void heapsort(Heap A){
        buildMaxHeap(A);
        for(int i=A.getHeapArr().length;i >= 2;i--){
            int temp = A.getHeapArr()[0];
            A.getHeapArr()[0] = A.getHeapArr()[i-1];
            A.getHeapArr()[i-1] = temp;
            A.setHeapSize(A.getHeapSize()-1);
            maxHeapify(A,1);
        }
    }

    public static void main(String[] args){
        HeapSort hs = new HeapSort();
        Heap A = new Heap(new int[]{4,1,3,2,16,9,10,14,8,7});
        System.out.println("IN  A:" + Arrays.toString(A.getHeapArr()));
        hs.heapsort(A);
        System.out.println("OUT A:" + Arrays.toString(A.getHeapArr()));
    }
}
