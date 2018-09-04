package clrs.data;

public class ListNode {

    public ListNode(int k){
        this.key = k;
    }

    public ListNode getNext() {
        return next;
    }

    @Override
    public String toString() {
        return Integer.toString(key);
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    private int key;
    private ListNode next;
    private ListNode prev;
}
