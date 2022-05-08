import java.io.*;
import java.util.*;

public class arrange_buildings{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] dp = new int[2][n+1];
    dp[0][1] = 1;
    dp[1][1] = 1;
    for(int j = 2 ; j<=n ; j++){
        dp[0][j] = dp[1][j-1]+dp[0][j-1];
        dp[1][j] = dp[0][j-1];
    }
    long val = dp[0][n]+dp[1][n];
    System.out.println((val*val));
 
 }

}