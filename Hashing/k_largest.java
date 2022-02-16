import java.io.*;
import java.util.*;

public class k_largest {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      // write your code here
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      for(int i=0;i<n;i++){
          if(i<k){
          pq.add(arr[i]);}
          else{
              if(pq.peek()<arr[i]){
                  pq.remove();
                  pq.add(arr[i]);
              }
          }
      }
      while(pq.size()!=0){
          System.out.println(pq.peek());
          pq.remove();
      }
    //   int[] a = new int[k];
    //   int t=k;
    // //   while(k-->0){
    // //      System.out.println(pq.peek()); 
    // //      pq.remove();
    // //   }
    // for(int i=k-1;i>=0;i--){
    //     a[i]=pq.peek();
    //     pq.remove();
    // }
    // for(int i=0;i<k;i++){
    //     System.out.println(a[i]);
    // }
      
    }

}