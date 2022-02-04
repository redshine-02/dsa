import java.util.*;

public class stair_min_moves {
    public static int solvet(int[] arr , int SRC , int dest , int[]dp){
        dp[dp.length-1]=0;
        for(int src = dp.length-2 ; src>=SRC ; src--){
            if(arr[src]>0){
                int m = Integer.MAX_VALUE;
                for(int jump = 1 ; jump<= arr[src] && jump+src<=dest; jump++){
                    if(dp[jump+src]!=0){
                        m = Math.min(m,dp[src+jump]); 
                    }
                }
                if(m!=Integer.MAX_VALUE){
                    dp[src] = m+1;
                }
            }
            
        }
        return dp[SRC];
    }
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    //     Integer[] dp = Integer int[n + 1];
    //     //Arrays.fill(dp,-1);
    // dp[n] = 0;

    // for (int i = n - 1; i >= 0; i--) {
    //   if (arr[i] == 0)
    //     continue;
    //   int min = Integer.MAX_VALUE;
    //   for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
    //     if (dp[i + j] != null) {
    //       min = Math.min(min, dp[i + j]);
    //     }
    //   }
    //   if (min != Integer.MAX_VALUE)
    //     dp[i] = min + 1;
    // }
    // System.out.println(dp[0]);
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        //System.out.println(solve(arr,0,n));
        dp[n]=0;
        for(int src = n-1 ;src>=0;src--){
            if(arr[src]==0){
                continue;
            }
            int m = Integer.MAX_VALUE;
            for(int jump = 1 ; jump<= arr[src] && jump+src<=n; jump++){
                    if(dp[jump+src]!=-1){
                        m = Math.min(m,dp[src+jump]); 
                    }
                }
                if(m!=Integer.MAX_VALUE){
                    dp[src] = m+1;
                }
        }
        
        System.out.println(dp[0]);
        sc.close();
    }
}
