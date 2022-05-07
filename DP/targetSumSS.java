import java.io.*;
import java.util.*;

public class targetSumSS {
    // public static boolean targetSS(int[] arr ,  int target , boolean[][] dp){
    //     int n = dp.length;
    //     int m = dp[0].length;
    //     for(int i = 0 ; i<n ; i++){
    //         for(int j = 0 ; j<m ; j++){
    //             if(j==0){
    //                 dp[i][j] = true;
    //             }
    //             else if(i == 0){
    //                 dp[i][j] = false;
    //             }
    //             else{
    //                 boolean nocall = dp[i-1][j];
    //                 boolean yescall = false;
    //                 if(j-arr[i-1]>=0){
    //                     yescall=dp[i-1][j-arr[i-1]];
    //                 }
    //                 dp[i][j] = nocall || yescall;
    //             }
    //         }
    //     }
    //     return dp[n-1][m-1];
    // }
    public static boolean targetSS(int[] arr , int idx , int target){
        if(idx == arr.length || target == 0){
            if(target == 0 ){
                return true;
            }
            return false;
        }
        boolean no = targetSS(arr , idx+1 , target);
        boolean yes = false;
        if(target-arr[idx]>=0){
            yes = targetSS(arr, idx+1 , target - arr[idx]);
        }
        return yes || no;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        // boolean[][] dp = new boolean[n+1][target+1];
        // boolean ans = targetSS(arr, target , dp);
        boolean ans = targetSS(arr, 0 , target);
        System.out.println(ans);
    }
}