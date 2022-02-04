import java.io.*;
import java.util.*;

public class min_cost_maze {
    public static int maze_min(int sr , int sc ,int[][] arr ,int[][] dp){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(i==n-1 && j==m-1){
                    dp[i][j]=arr[i][j];
                }
                else if(i==n-1){
                    dp[i][j]=arr[i][j]+dp[i][j+1];
                }
                else if(j==m-1){
                    dp[i][j]=arr[i][j]+dp[i+1][j];
                }
                else{
                    int min = Math.min(dp[i][j+1],dp[i+1][j]);
                    dp[i][j]=arr[i][j]+min;
                }
            }
        }

         return dp[sr][sc];
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for( int i = 0; i < n ; i++ ){
            for( int j = 0 ; j < m ; j++ ){
                arr[i][j]=sc.nextInt();
            }
        }
        int[][] dp = new int[n][m];
        System.out.println(maze_min(0,0,arr,dp));
    }

}
