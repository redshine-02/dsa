import java.io.*;
import java.util.*;

public class isGraph_Bipartite {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
   
   static class pair{
       int vtx;
       int clr;
       pair(){}
       pair(int vtx , int clr){
           this.vtx = vtx;
           this.clr = clr;
       }
   }
   
   public static boolean isGraphBipartite(ArrayList<Edge>[] graph){
       
       for(int src = 0 ; src<graph.length ; src++){
       Queue<pair> qu = new LinkedList<>();
       int[] vis = new int[graph.length];
       Arrays.fill(vis,-1);
       qu.add(new pair(src,0));
       
       while(qu.size()!=0){
           pair rem = qu.remove();
           if(vis[rem.vtx]!=-1){
               if(vis[rem.vtx]==rem.clr){
                   continue;
               }
               else{
                   return false;
               }
           }
           vis[rem.vtx] = rem.clr;
           for(Edge e : graph[rem.vtx]){
               int nbr = e.nbr;
               if(vis[nbr]==-1){
                   qu.add(new pair(nbr , 1-rem.clr));
               }
           }
       }
       }
       return true;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }
      System.out.println(isGraphBipartite(graph));
   }
}