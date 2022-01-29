import java.io.*;
import java.util.*;

public class goldmine {
    public static int goldm(int i, int j, int[][] grid, int[][] dp){
        if(i<0 ||i>=grid.length || j>=grid[0].length)
         return 0; 
        if(dp[i][j]!=0){
             return dp[i][j];
         }
         int op1=goldm(i-1,j+1,grid,dp);
         int op2=goldm(i,j+1,grid,dp);
         int op3=goldm(i+1,j+1,grid,dp);

         int max= Math.max(op1,Math.max(op2,op3));
         dp[i][j]=max+grid[i][j];

         return dp[i][j];
    }

    public static int goldr(int i, int j, int[][] grid){
        if(i<0 ||i>=grid.length || j>=grid[0].length)
         return 0; 
        
         int op1=goldr(i-1,j+1,grid);
         int op2=goldr(i,j+1,grid);
         int op3=goldr(i+1,j+1,grid);

         int max= Math.max(op1,Math.max(op2,op3));
         max=max+grid[i][j];

         return max;
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int[][] dp=new int[n][m];
        int ans=0;
        for(int i=0;i<n;i++){
            int temp=goldm(i,0,arr,dp);
            if(temp>ans){
                ans=temp;
            }
        }
        System.out.println(ans);
    }

}