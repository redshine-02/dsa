import java.io.*;
import java.util.*;

public class target_sum_subset {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        int t = sc.nextInt();
        printTargetSumSubsets(arr, 0, "", 0, t);

    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String asf, int sum, int tar) {
        if(sum>tar){
            return;
        }

        if(idx==arr.length){
            if(sum==tar){
                System.out.println(asf+".");
            }
            return;
        }
        //print with
        printTargetSumSubsets(arr, idx+1, asf+arr[idx]+", ", sum+arr[idx], tar);

        //print without
        printTargetSumSubsets(arr, idx+1, asf, sum, tar);
    }

}