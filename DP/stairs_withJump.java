import java.io.*;
import java.util.*;

public class stairs_withJump {
    // ************************* TABULATION  ************************* //
    public static int solvet(int[] arr , int src , int dest , int[] dp){
        for(int i=dp.length-1;i>=src;i--){
        if(i==dest){
            dp[i]=1;
            continue;
        }
        int count = 0;
        for(int jump = 1;jump<=arr[i] && jump+i<=dest ; jump++){
            count+=dp[i+jump];//solvem(arr,src+jump,dest,dp);
        }
        dp[i]=count;
        }
        return dp[src];
    }
    // ************************* MEMOIZATION  ************************* //
    public static int solvem(int[] arr , int src , int dest , int[] dp){
        if(src==dest){
            return dp[src]=1;
        }
        if(dp[src]!=-1){
            return dp[src];
        }
        int count = 0;
        for(int jump = 1;jump<=arr[src] && jump+src<=dest ; jump++){
            count+=solvem(arr,src+jump,dest,dp);
        }
        return dp[src]=count;
    }
    // ************************* RECURSION  ************************* //
    public static int solve(int[] arr , int src , int dest){
        if(src==dest){
            return 1;
        }
        int count = 0;
        for(int jump = 1;jump<=arr[src] && jump+src<=dest ; jump++){
            count+=solve(arr,src+jump,dest);
        }
        return count;
    }
    

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        //System.out.println(solve(arr,0,n));
        //System.out.println(solvem(arr,0,n,dp));
        System.out.println(solvet(arr,0,n,dp));
    }

}