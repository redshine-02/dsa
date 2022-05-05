import java.util.*;
class Solution {
    public class pair{
        int i;
        int j;
        pair(int i , int j){
            this.i = i;
            this.j = j;
        }
    }
    public int init(int[][] graph, Queue<pair> qu){
        int n = graph.length;
        int m = graph[0].length;
        int freshOranges = 0 ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j<m ; j++){
                if(graph[i][j] == 2){
                    qu.add(new pair(i,j));
                }
                else if(graph[i][j]==1){
                    freshOranges++;
                }
            }
        }
        return freshOranges;
    }
    public static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    public int orangesRotting(int[][] graph) {
        Queue<pair> qu = new LinkedList<>();
        int f = init(graph,qu);
        System.out.println(f);
        if(f == 0){
            return 0;
        }
        int time = 0;
        while(qu.size()!=0){
            int size = qu.size();
            while(size-->0){
                pair rem = qu.remove();
                int i = rem.i;
                int j = rem.j;
                if(graph[i][j]==1){
                    graph[i][j]=2;
                    f--;
                }
                if(f==0){
                    return time;
                }
                
                for(int[] d : dir){
                    int r = i+d[0];
                    int c = j+d[1];
//                     if(r>=0 && r<graph.length  && c>=0 && c<graph[0].length && graph[r][c]==1){
//                         qu.add(new pair(r,c));
                        
//                     }
                    if(r >= 0 && r < graph.length && c >= 0 && c < graph[0].length && graph[r][c] == 1 ){
                        qu.add(new pair(r,c));
                        
                    }
                }
                
                
            }
            time++;
        }
        System.out.println(f);
        return f!=0?-1:time;
    }
}