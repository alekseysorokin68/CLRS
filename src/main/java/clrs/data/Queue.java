package clrs.data;

public class Queue {
    public void enqueue(int x){
        Q[this.tail] = x;
        if(this.tail == Q.length){
            this.tail = 0;
        } else{
            this.tail++;
        }
    }
    public int dequeue(){
        int x = Q[this.head];
        if(this.head == Q.length){
            this.head = 0;
        } else{
            this.head++;
        }
        return x;
    }

    private int[] Q = new int[10];
    private int tail = 0;
    private int head = 0;

    public static void main(String[] args){
        Queue qu = new Queue();
        qu.enqueue(17);
        qu.enqueue(3);
        qu.enqueue(5);
        System.out.println(" dequeue: " + qu.dequeue());
        System.out.println(" head: " + qu.head + " tail: " + qu.tail);
        System.out.println(" dequeue: " + qu.dequeue());
        System.out.println(" head: " + qu.head + " tail: " + qu.tail);
        System.out.println(" dequeue: " + qu.dequeue());
        System.out.println(" head: " + qu.head + " tail: " + qu.tail);
    }
}
