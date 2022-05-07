import java.io.*;
import java.util.*;

public class goldmine {

    public static void goldminet(int[][] grid , int[][] dp){
        int n = grid.length;
        int m = grid[0].length;
        for(int j = m-1 ; j>=0 ; j--){
            for(int i = 0 ; i<n ; i++){
                if(j==m-1){
                    dp[i][j] = grid[i][j];
                }
                else if(i==0){
                    dp[i][j] = grid[i][j] + Math.max(dp[i+1][j+1],dp[i][j+1]);
                }
                else if(i==n-1){
                    dp[i][j] = grid[i][j] + Math.max(dp[i-1][j+1],dp[i][j+1]);
                }
                else{
                    dp[i][j] = grid[i][j] + Math.max(dp[i][j+1] , (Math.max(dp[i-1][j+1],dp[i+1][j+1])));
                }
            }
        }
    }
    
    // public static int goldminem(int[][] grid , int i , int j , int[][] dp){
    //     if(i<0 || j<0 || j>=grid[0].length || i>=grid.length ){
    //         return 0;
    //     }
    //     if(dp[i][j]!=0){
    //         return dp[i][j];
    //     }
    //     int op1 = goldmine(grid , i-1 , j+1 , dp);
    //     int op2 = goldmine(grid ,  i  , j+1 , dp);
    //     int op3 = goldmine(grid , i+1 , j+1 , dp);
    //     dp[i][j] = grid[i][j] + Math.max(op1 , Math.max(op2 , op3));
    //     return dp[i][j];
    // }
    
    // public static int goldmine(int[][] grid , int i , int j ){
    //     if(i<0 || j<0 || j>=grid[0].length || i>=grid.length ){
    //         return 0;
    //     }
    //     int op1 = goldmine(grid , i-1 , j+1 );
    //     int op2 = goldmine(grid ,  i  , j+1 );
    //     int op3 = goldmine(grid , i+1 , j+1 );
    //     int max = grid[i][j] + Math.max(op1 , Math.max(op2 , op3));
    //     return max;
    // }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        
        int[][] dp = new int[n][m];
        goldminet(grid , dp);
        
        
        int ans = 0; 
        for(int i = 0 ; i <n ; i++){
            // int p = goldmine(grid , i , 0 , dp );
            // int p = goldmine(grid , i , 0 );
            if(ans<dp[i][0]){
                ans = dp[i][0];
            }
        }
        
        System.out.println(ans);
    }

}