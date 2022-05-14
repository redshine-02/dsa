import java.util.*;
public class Reverse {
    class Node{
        int val;
        Node next;
        Node(){}
        Node(int val){
            this.val = val;
        }
        Node(int val,Node next){
            this.val = val;
            this.next = next;
        }

    }
    public static void reverseHelper(Node head){
        Node curr = head;
        Node prev = null;
        Node forw = null;//We could heave initialized it in the loop but why wasting time in recdeclaration
        while(curr!=null){
            forw = curr.next;
            curr.next= prev;
            prev = curr;
            curr = forw;
        }
        head = prev;
        // You forgot this
        /* Node temp = head;
        head = tail;
        tail = temp; */
    }
}
// whenever you are solving any question on linkedList : size = 0 && size ==1  && size == odd && size == even