import java.io.*;
import java.util.*;

public class paint_fence {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[][] dp = new int[2][n+1];
        dp[0][2] = k ;
        dp[1][2] = k*(k-1);
        for(int i = 3 ; i<=n ; i++){
            dp[0][i] = dp[1][i-1];
            dp[1][i] = (dp[0][i-1]+dp[1][i-1])*(k-1);
        
        }
        System.out.println(dp[0][n]+dp[1][n]);    
        
    }
}