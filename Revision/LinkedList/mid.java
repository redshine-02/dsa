import java.util.*;
public class mid {
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
    public static Node midOf(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next;        
        }
        return slow;
    }
}
