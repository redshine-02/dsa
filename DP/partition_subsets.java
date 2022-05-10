import java.io.*;
import java.util.*;

public class partition_subsets {
        
    public static long partitionKSubset(int n, int k) {
        if(n<k){
            return 0;
        }
        if(n==k){
            return n;
        }
        long a = partitionKSubset(n-1,k);
        long b = partitionKSubset(n-1,k-1);
        long ans = (a*k) + b;
        return ans;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        long res = partitionKSubset(n, k);
        System.out.println(res);
    }
}