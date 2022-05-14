import java.util.*;
public class palindrome {
    public class Node{
        int data;
        Node next;
        Node(){}
        Node(int data){
            this.data = data;
        }
        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }

    }
    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node forw = null;
        while(curr!=null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
    public static Node mid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static boolean approach1(Node head){
        Node mi = mid(head);
        Node pi = reverse(mi.next);
        mi.next = null;

        Node c1 = head;
        Node c2 = pi;
        boolean ans = true;
        while(c2!=null){
            if(c1.data != c2.data){
                ans = false;
            }
            c1 = c1.next;
            c2 = c2.next;
        }
        pi = reverse(pi);
        mi.next = pi;
        return ans;
    }


    public static Node pleft;
    public static boolean isPalindrome(Node right){
        if(right==null){
            return true;
        }
        boolean ans = isPalindrome(right.next);

        if(ans == false){
            return false;
        }

        if(pleft.data == right.data){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean approach2(Node head){
        pleft = head;
        boolean ans = isPalindrome(head);
        return ans; 
    }
}
