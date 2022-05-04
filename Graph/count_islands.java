import java.io.*;
import java.util.*;


public class count_islands {
    public static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    public static void dfs(int[][] arr,int i , int j){
        arr[i][j]=1;
        for(int[] d: dir){
            int r = i + d[0];
            int c = j + d[1];
            if(r<arr.length && r>=0 && c>=0 && c<arr[0].length && arr[r][c]==0 ){
            dfs(arr,r,c);}
        }
    }
    
    public static int no_of_islands(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        
        int ans = 0;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(arr[i][j]==0){
                    ans++;
                    dfs(arr,i,j);
                }
            }
        }
        return ans;
    }
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[m][n];

      for (int i = 0; i < arr.length; i++) {
         String parts = br.readLine();
         for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
         }
      }
      
      System.out.println(no_of_islands(arr));

   }

}