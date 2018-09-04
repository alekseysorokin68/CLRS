package clrs.data;

public class TwoConnectedList {
    public void listInsert(ListNode x){
        x.setNext(this.head);
        if(this.head != null) head.setPrev(x);
        this.head = x;
        x.setPrev(null);
    }
    public ListNode listSearsh(int k){
        ListNode x = this.head;
        while(x != null && x.getKey() != k){
            x = x.getNext();
        }
        return x;
    }
    public void listDelete(ListNode x){
        if(x.getPrev() != null) x.setPrev(x.getNext());
        else this.head = x.getNext();
        if(x.getNext() != null) x.getNext().setPrev(x.getPrev());
    }

    ListNode head;

    public static void main(String[] args){
        TwoConnectedList tcl = new TwoConnectedList();
        ListNode x = new ListNode(10);
        tcl.listInsert(x);
        x = new ListNode(20);
        tcl.listInsert(x);
        x = new ListNode(30);
        tcl.listInsert(x);
        x = tcl.listSearsh(20);
        System.out.println("x: " + x);
    }
}
