import java.io.*;
import java.util.*;

public class count_binary_string{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 1;
    int b = 1;
    if(n==0){
        System.out.println("0");
    }
    else{
        
        while(--n>0){
            int temp = a;
            a = a+b;
            b = temp;
        }
        System.out.println(a+b);
        
    }
    // int[][] dp = new int[2][n+1];
    // dp[0][1] = 1;
    // dp[1][1] = 1;
    // for(int j = 2 ; j<=n ; j++){
    //     dp[0][j] = dp[1][j-1]+dp[0][j-1];
    //     dp[1][j] = dp[0][j-1];
    // }
    // System.out.println(dp[0][n]+dp[1][n]);
 }

}