import java.io.*;
import java.util.*;

public class diameter_of_generic_tree {
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
  
  public static int diameter = -(int)1e9;
  
  public static int diameterOfGT(Node node){// The purpose of this function was just for getting the height
      if (node == null){
          return -1;
      }
      int dc = -1;
      int sdc = -1;
      int ht = -1;
      for(Node child : node.children){
          int ch = diameterOfGT(child);
          ht = Math.max(ch , ht);
          if(ch>dc){
              sdc = dc;
              dc = ch;
          }
          else if(ch>sdc){
              sdc = ch;
          }
      }
      if(dc + sdc +2 > diameter){
          diameter = dc + sdc + 2;
      }
     return ht +1; 
  }

  

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    diameter = -(int)1e9;
    diameterOfGT(root);
    System.out.println(diameter);
  }

}