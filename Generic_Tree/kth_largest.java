import java.io.*;
import java.util.*;

public class kth_largest {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  
  public static int ceil;
  public static int floor;
  public static void ceilAndFloor(Node node, int data) {
    if(node.data > data){
      if(node.data < ceil){
        ceil = node.data;
      }
    }

    if(node.data < data){
      if(node.data > floor){
        floor = node.data;
      }
    }

    for (Node child : node.children) {
      ceilAndFloor(child, data);
    }
  }
  public static int max = -(int)1e9;
  public static int maxOfGT(Node node){
    
      int m = node.data;
      for(Node child : node.children){
          int ch = maxOfGT(child);
          m = Math.max(m,ch);
      }
      if(m>max){
          max = m ;
      }
      return m;
  }

  public static int kthLargest(Node node, int k){
      int maximum = maxOfGT(node);
      int c = maximum;
      floor = Integer.MIN_VALUE;
      for(int i = 0 ; i<k-1 ; i++){
         
          ceilAndFloor(node,c);
          c = floor;
          floor = Integer.MIN_VALUE;
      }
      return c;
      
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    int k = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    max = -(int)1e9;
    floor = Integer.MIN_VALUE;
    ceil = Integer.MAX_VALUE;
    int kthLargest = kthLargest(root, k);
    System.out.println(kthLargest);
  }

}
