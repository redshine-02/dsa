import java.io.*;
import java.util.*;

public class Knapsack01 {
    public static void solve(int[] wt , int[] val , int[][] dp , int tar){
        int n = dp.length;
        for(int i = 0 ; i<dp.length ; i++){
            for(int  j = 0 ; j<dp[0].length ; j++){
                if(j == 0){
                    dp[i][j] = 0 ;
                }
                else if(i == 0){
                    dp[i][j] = 0;
                }
                else{
                    int val1 = dp[i-1][j];
                    int val2 = 0 ;
                    if(j-wt[i-1]>=0){
                        val2 =  val[i-1] + dp[i-1][j-wt[i-1]];
                        
                    }
                    dp[i][j] = Math.max(val1 , val2);
                }
            }
        }
        System.out.println(dp[n-1][tar]);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] val = new int[n];
        for(int i = 0 ; i<n ; i++){
            val[i] = sc.nextInt();
        }
        int[] wt = new int[n];
        for(int i = 0 ; i<n ; i++){
            wt[i] = sc.nextInt();
        }
        int capacity = sc.nextInt();
        int[][] dp = new int[n+1][capacity+1];
        solve(wt,val,dp,capacity);
    }
}