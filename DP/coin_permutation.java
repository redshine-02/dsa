import java.io.*;
import java.util.*;

public class coin_permutation {

    public static int coinPermutation(int[] arr , int target , int[] dp){
        int n = dp.length;
        dp[0] = 1;
        for(int j = 0 ; j<n ; j++){
        for(int i = 0 ; i<arr.length ; i++){
            
                if(j-arr[i]>=0){
                    dp[j]+=dp[j-arr[i]];
                }
            }
        }
        return dp[n-1];
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        
        int[] dp = new int[target+1];
        int count  = coinPermutation(arr,target,dp);
        System.out.println(count);
    }
}