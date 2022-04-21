import java.io.*;
import java.util.*;

public class stockspan{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr) {
    int[] a = new int[arr.length];
    Arrays.fill(a,-1);
    Stack<Integer> st = new Stack<>();
    for(int i = arr.length-1 ; i>=0 ; i--){
            while(st.size()!=0 && arr[i]>arr[st.peek()]){
                a[st.peek()]=i;
                st.pop();
            }
        st.push(i);
    }
    for(int i = 0 ; i<a.length ; i++){
        int val = i-a[i];
        a[i]=val;
    }
    return a;
  }

}
