import java.io.*;
import java.util.*;

public class tiling_mx1 {

    public static int ways(int N , int m){
        int[] dp = new int[N+1];
        for(int n = 1 ; n<=N ; n++ ){
            if(n==m){
                dp[n] = 2;
                continue;
            }
            else if(n<m){
                dp[n] = 1;
                continue;
            }
            dp[n] = dp[n-1] + dp[n-m];
        }
        return dp[N];
    }

    // public static int ways(int n , int m){
    //     if(m>n){
    //         return 1;
    //     }
    //     if(n==m){
    //         return 2;
    //     }

    //     int w = ways(n-1,m)+ways(n-m,m);
    //     return w;
    // }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = ways(n,m);
        System.out.println(ans);
    }
}