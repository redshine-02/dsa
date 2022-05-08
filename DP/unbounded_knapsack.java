import java.io.*;
import java.util.*;

public class unbounded_knapsack {
    public static void solve(int[] wt , int[] val , int[] dp , int tar){
        for(int i = 0 ; i<dp.length ; i++){
            int max = Integer.MIN_VALUE;
            int s = 0 ;
            for(int j = 0 ; j<wt.length ; j++){
                if(i-wt[j]>=0){
                    s = val[j] + dp[i-wt[j]];
                }
                max = Math.max(max,s);
            }
            dp[i] = max;
        }
        System.out.println(dp[tar]);
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
        int[] dp = new int[capacity+1];
        solve(wt,val,dp,capacity);
    }
}