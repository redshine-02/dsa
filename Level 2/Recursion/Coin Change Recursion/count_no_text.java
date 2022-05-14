import java.util.*;
public class count_no_text {
//     public int count(String s , int idx , int[] dp){
//         if(idx == s.length()){
//             return dp[idx]=1;
//         }
//         if(dp[idx]!=-1){
//             return dp[idx];
//         }
//         int c = 0 ;
//         int ch = s.charAt(idx) - '0';
//         int jump = 3;
//         if(ch == 7 || ch == 9){
//             jump++;
//         }
//         for(int i = 0 ; i<jump && idx+i<s.length() && s.charAt(idx) == s.charAt(idx+i) ; i++ ){
//             c += count(s,idx+i+1,dp);
//             c %= 1000000007;
//         }
//          return dp[idx] = c;
//     }
   

// public int countTexts(String pressedKeys) {
//     int n = pressedKeys.length();
//     int[] dp = new int[n+1];
//     Arrays.fill(dp,-1);
//     int ans = count(pressedKeys,0,dp);
//     return dp[0];
// }
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