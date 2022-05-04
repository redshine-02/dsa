import java.util.*;
public class intro_display {
    public static class Edge{
        int src;
        int dbr;
        int wt;
        Edge(){}
        Edge(int src,int dbr,int wt){
            this.src = src;
            this.dbr = dbr;
            this.wt = wt;
        }
    }
    public static void addEdge(ArrayList<Edge>[] graph , int u,  int v , int wt){
        graph[u].add(new Edge(u,v,wt));
        graph[v].add(new Edge(v,u,wt));
    }

    public static void construction(){
        int N = 7 ;
        ArrayList<Edge>[] graph = new ArrayList[N];

        for(int n = 0 ; n<N ; n++){
            graph[n] = new ArrayList<>();
        }

        addEdge(graph, 0 , 1, 10);
        addEdge(graph, 0 , 3, 10);
        addEdge(graph, 1 , 2, 10);
        addEdge(graph, 2 , 3, 40);
        addEdge(graph, 3 , 4, 2);
        addEdge(graph, 4 , 5, 2);
        addEdge(graph, 5 , 6, 3);
        addEdge(graph, 4 , 6, 8);

        display(graph,N);
    }

    public static void display( ArrayList<Edge>[] graph , int N){
        for(int n = 0 ; n<N ; n++){
            System.out.print(n+"->");
            for(Edge e : graph[n]){
                int u = e.src;
                int v = e.dbr;
                int w = e.wt;
                System.out.print(u+"-"+v+"@"+w+",");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        construction();
    }
}
