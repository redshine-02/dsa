import java.io.*;
import java.util.*;

public class merge_k_sorted {
   public static class triplet implements Comparable<triplet>
   {
      int li;
      int idx;
      int val;

      triplet(){

      }
      triplet(int li,int idx,int val){
         this.li=li;
         this.idx=idx;
         this.val=val;
      }

      public int compareTo(triplet o){
         return this.val-o.val;
      }
   }
   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> ans = new ArrayList<>();

      PriorityQueue<triplet> pq = new PriorityQueue<>();
      for(int i=0;i<lists.size();i++){
         triplet temp = new triplet(i,0,lists.get(i).get(0));
         pq.add(temp);
      }

      while(pq.size()!=0){
         triplet top = pq.remove();
         int newli = top.li;
         int newidx = top.idx+1;

         if(newidx<lists.get(top.li).size()){
            int newval = lists.get(newli).get(newidx);

            triplet temp = new triplet(newli,newidx,newval);

            pq.add(temp);
         }
         ans.add(top.val);
      }


      // write your code here

      return ans;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(br.readLine());
      ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
      for(int i = 0; i < k; i++){
         ArrayList<Integer> list = new ArrayList<>();

         int n = Integer.parseInt(br.readLine());
         String[] elements = br.readLine().split(" ");
         for(int j = 0; j < n; j++){
            list.add(Integer.parseInt(elements[j]));
         }

         lists.add(list);
      }

      ArrayList<Integer> mlist = mergeKSortedLists(lists);
      for(int val: mlist){
         System.out.print(val + " ");
      }
      System.out.println();
   }

}