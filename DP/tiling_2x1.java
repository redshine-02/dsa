import java.io.*;
import java.util.*;

public class tiling_2x1 {

    public static int func_tab(int N ){
        int[] dp = new int[N+1];
        for(int n = 0 ; n<dp.length ; n++){
        if(n==1 || n==0){
            dp[n]=1;
            continue;
        }
        dp[n] = dp[n-1] + dp[n-2];
        }
        return dp[N];
    }

    public static int func(int n , int[] dp){
        if(n==1 || n==0){
            return dp[n]=1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n] = func(n-1,dp) + func(n-2,dp);
        return dp[n];
    }

    public static int func(int n){
        if(n<=1){
            return 1;
        }
        int a = 1;
        int b = 1;
        int ans = 0 ;
        for(int i = 2 ; i<=n ; i++){
            ans = a+b;
            a = b ;
            b = ans;
        }
        return ans;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1]; 
        int ans = func(n,dp);
        System.out.println(ans);
    }
}
