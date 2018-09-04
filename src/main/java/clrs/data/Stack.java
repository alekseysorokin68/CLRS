package clrs.data;

import java.util.Arrays;

public class Stack {

    public boolean stackIsEmpty(){
        if(this.top == -1) return true;
        return false;
    }
    public void push(int x){
        this.top++;
        if(this.S.length == this.top) {
            this.S = Arrays.copyOf(this.S,this.S.length + 10);
        }
        this.S[this.top] = x;
    }
    public int pop(){
        if(this.stackIsEmpty()){
            throw new IndexOutOfBoundsException("Underflow!");
        }
        this.top--;
        return this.S[this.top + 1];
    }
    private int[] S = new int[10];
    private int top = -1;

    public static void main(String[] args){
        Stack st = new Stack();
        st.push(25);
        st.push(43);
        st.push(56);
        st.push(34);
        st.push(78);
        st.push(99);
        st.push(39);
        st.push(40);
        st.push(25);
        st.push(77);
        st.push(17);
        st.push(11);
        while(true) {
            System.out.println("Pop = " + st.pop());
        }

    }
}
