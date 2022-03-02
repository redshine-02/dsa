import java.io.*;
import java.util.*;

public class intro {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue() {
      data = new ArrayList<>();
    }

    public void swap(int i, int j){
      int v1 = data.get(i);
      int v2 = data.get(j);

      data.set(i, v2);
      data.set(j, v1);
    }
  

    public void add(int val) {
      // write your code here
      data.add(val);
      upHeapify(data.size()-1);
    }

    public void upHeapify(int idx){
      if(idx==0){
        return;
      }
      int pi = (idx-1)/2;
      if(data.get(pi)>data.get(idx)){
        swap(pi,idx);
        upHeapify(pi);
      }
    }

    public int remove() {
      // write your code here
      int val = peek();
      if(val==-1){
        return val;
      }
      else{
        swap(0,data.size()-1);
        data.remove(data.size()-1);
        downHeapify(0);
        return val;
      }
    }

    public void downHeapify(int pi){
      int min = pi;
      int li = 2*pi+1;
      int ri = 2*pi+2;

      if(li<data.size() && data.get(li)<data.get(min)){
        min=li;
      }
      if(ri<data.size() && data.get(ri)<data.get(min)){
        min=ri;
      }

      if(min!=pi){
        swap(min,pi);
        downHeapify(min);
      }
    }

    public int peek() {
      // write your code here
      if(data.size()==0){
        System.out.println("Underflow");
        return -1;
      }
      else{
        return data.get(0);
      }
    }

    public int size() {
      // write your code here
      return data.size();
    }
   }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}
