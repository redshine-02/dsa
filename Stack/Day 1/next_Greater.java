import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }
//  ********** BRUTE FORCE ********** 
//  public static int[] solve(int[] arr){
//    int[] a = new int[arr.length];
//    Arrays.fill(a,-1);
//    for(int i = 0 ; i<arr.length-1 ; i++){
//        int max = arr[i];
//        for(int j = i+1 ; j<arr.length ; j++){
//            if(arr[j]>max){
//                max=arr[j];
//                break;
//            }
//        }
//        if(max!=arr[i]){
//            a[i]=max;
//        }
//    }
//    return a;
//  }

}
