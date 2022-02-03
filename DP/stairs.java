import java.io.*;
import java.util.*;

public class stairs {

// ************************* RECURSION  ************************* //
    public static int stairs(int n ){
        if(n==0){
         return 1;
        }
        int count=0;
        if(n-1>=0){
            count+=stairs(n-1);
            //c++;
        }
        if(n-2>=0){
            count+=stairs(n-2);
            //c++;
        }
        if(n-3>=0){
            count+=stairs(n-3);
            //c++;
        }
        return count;
    }

    // ************************* MEMOIZATION  ************************* //

    public static int stairsM(int n ,int[] dp ){
        if(n==0){
         return dp[n]=1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int count=0;
        if(n-1>=0){
            count+=stairs(n-1);
            //c++;
        }
        if(n-2>=0){
            count+=stairs(n-2);
            //c++;
        }
        if(n-3>=0){
            count+=stairs(n-3);
            //c++;
        }
        return dp[n]=count;
    }
// ************************* TABULATION  ************************* //
    
public static int stairsT(int N , int[] dp){
    for(int n=0;n<=N;n++){
        if(n==0){
            dp[n]=1;
            continue;
        }
        int count=0;
        if(n-1>=0){
            count+=dp[n-1];
            //c++;
        }
        if(n-2>=0){
            count+=dp[n-2];
            //c++;
        }
        if(n-3>=0){
            count+=dp[n-3];
            //c++;
        }
        dp[n]=count;
    }
    return dp[N];
}

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp =new int[n+1];
        Arrays.fill(dp,-1);
        //System.out.println(stairs(n));
        //System.out.println(stairsM(n,dp));
        System.out.println(stairsT(n,dp));
    }

}