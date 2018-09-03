package clrs.main;

public class Heap {
    public Heap(int[] A){
        this.heapArr = A;
    }

    public int getHeapSize() {
        return heapSize;
    }

    public void setHeapSize(int heapSize) {
        this.heapSize = heapSize;
    }

    public int[] getHeapArr() {
        return heapArr;
    }

    public void setHeapArr(int[] heapArr) {
        this.heapArr = heapArr;
    }

    private int heapSize;
    private int[] heapArr;
}
