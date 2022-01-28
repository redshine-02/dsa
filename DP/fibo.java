import java.io.*;
import java.util.*;

public class fibo{


//MEMOISATION : WITH THE HELP OF STORAGE WE SOLVE THE PROBLEM RECURSIVELY
public static int fibM(int n, int[]dp){
    if(n<=1){
       return dp[n]=n;
    }
    if(dp[n]!=-1){
        return dp[n];
    }
    int nm1=fibM(n-1,dp);
    int nm2=fibM(n-2,dp);
    return dp[n]=nm1+nm2;
}

//TABULATION
public static int fibT(int N, int[]dp){
    for(int n=0;n<dp.length;n++){
    if(n<=1){
       dp[n]=n;
       continue;
    }
    int nm1=dp[n-1];//fibM(n-1,dp);
    int nm2=dp[n-2];//fibM(n-2,dp);
    dp[n]=nm1+nm2;
        
    }
    return dp[N];
    
}


//RECURSION
public static int fibR(int n){
    if(n<=1){
       return n;
    }
    
    int nm1=fibM(n-1);
    int nm2=fibM(n-2);
    return nm1+nm2;
}


public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    //System.out.println(fibR(n));
    int[] dp =new int[n+1];
    Arrays.fill(dp,-1);
    System.out.println(fibM(n,dp));
 }

}