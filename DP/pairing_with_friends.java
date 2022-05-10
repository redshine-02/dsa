import java.io.*;
import java.util.*;

public class pairing_with_friends {
    
    public static int count(int N){
        int[] dp = new int[N+1];
        for(int n = 0 ; n<=N ; n++){
            if(n<=2){
                dp[n]=n;
                continue;
            }
            dp[n] = dp[n-1]+(n-1)*dp[n-2];
        }
        return dp[N];
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = count(n);
        System.out.println(ans);
    }

}