import java.util.*;
public class count_no_text {
    public int countTexts(String pressedKeys) {
        int n = pressedKeys.length();
        long[] dp = new long[n+1];
        dp[0] = 1 ;
        dp[1] = 1;
        int mod = (int)1e9+7;
        for(int i = 1 ; i<=n ; i++){
            char ch = pressedKeys.charAt(i-1);
            dp[i] = dp[i-1];
            if(i>=2 && pressedKeys.charAt(i-2) == ch ){
                dp[i] = (dp[i] + dp[i-2])%mod;
            }
            else{
                continue;
            }
            if(i>=3 && pressedKeys.charAt(i-3) == ch ){
                dp[i] = (dp[i] + dp[i-3])%mod;
            }
            else{
                continue;
            }
            if((ch=='7' || ch=='9') && i>=4 && pressedKeys.charAt(i-4) == ch){
                dp[i] = (dp[i] + dp[i-4])%mod;
            }
        }
        return (int)dp[n];
    }
}