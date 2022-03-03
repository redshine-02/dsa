import java.io.*;
import java.util.*;

public class merge_2_sorted {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    //write your code here
    int n = a.length;
    int m = b.length;
    int[] arr = new int[n+m];
    int i=0;
    int j=0;
    int k=0;
    while(i<n && j<m){
      if(a[i]<b[j]){
        arr[k]=a[i];
        i++;
      }
      else{
        arr[k]=b[j];
        j++;
      }
      k++;
    }
    while(i<n){
      arr[k]=a[i];
      i++;
      k++;
    }
    while(j<m){
      arr[k]=b[j];
      j++;
      k++;
    }
    return arr;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
    scn.close();
  }

}