import java.io.*;
import java.util.*;

public class stack_adapter {

  public static class LLToStackAdapter {
    LinkedList<Integer> list;

    public LLToStackAdapter() {
      list = new LinkedList<>();
    }


    int size() {
      // write your code here
      return list.size();
    }

    void push(int val) {
      // write your code here
      list.addFirst(val);
      /*YAHA IMPORTANT BAAT YEH HAI add.First he q kiya it is because jab element ko pop karne ki baat aai toh first
      wale operation se constant time complexity mai woh node delete ho jaati hai that is why the af,rf,gf are preferred
      over al,rl,gl */
    }

    int pop() {
      // write your code here
      if(list.size()==0){
        System.out.println("Stack underflow");
        return -1;
        }
      return list.removeFirst();
    }

    int top() {
      // write your code here
      if(list.size()==0){
        System.out.println("Stack underflow");
        return -1;
        }
      return list.getFirst();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LLToStackAdapter st = new LLToStackAdapter();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("push")){
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if(str.startsWith("pop")){
        int val = st.pop();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("top")){
        int val = st.top();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(st.size());
      }
      str = br.readLine();
    }
  }
}