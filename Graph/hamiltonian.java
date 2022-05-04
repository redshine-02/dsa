import java.io.*;
import java.util.*;

public class hamiltonian {
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
   
   public static void hamiltonian(ArrayList<Edge>[] graph , HashSet<Integer> hs , int src , int osrc , String asf){
       if(hs.size() == graph.length-1){
           System.out.print(asf);
           for(Edge e : graph[osrc]){
               int nbr = e.nbr;
               if(nbr == src){
                   System.out.println("*");
                   return;
               }
           }
           System.out.println(".");
           return;
       }
       hs.add(src);
       for(Edge e : graph[src]){
           int nbr = e.nbr;
           if(!hs.contains(nbr)){
               hamiltonian(graph,hs,nbr,osrc,asf+nbr);
           }
       }
       hs.remove(src);;
   }
   
//   public static void hamiltonian(ArrayList<Edge>[] graph , boolean[] vis , int src , int osrc , String asf){
//       if(asf.length() == graph.length){
//           System.out.print(asf);
//           for(Edge e : graph[osrc]){
//               int nbr = e.nbr;
//               if(nbr == src){
//                   System.out.println("*");
//                   return;
//               }
//           }
//           System.out.println(".");
//           return;
//       }
//       vis[src] = true;
//       for(Edge e : graph[src]){
//           int nbr = e.nbr;
//           if(!vis[nbr]){
//               hamiltonian(graph,vis,nbr,osrc,asf+nbr);
//           }
//       }
//       vis[src] = false;
//   }

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

      int src = Integer.parseInt(br.readLine());
      boolean[] vis = new boolean[vtces];
      
      //hamiltonian(graph,vis,src,src,src+"");
      
      HashSet<Integer> hs = new HashSet<>();
      hamiltonian(graph,hs,src,src,src+"");
      
      // write all your codes here
   }


}