import java.io.*;
import java.util.*;

public class bubble_sort {

  public static void bubbleSort(int[] arr) {
    //write your code here
    int n=arr.length;
    for(int x=1;x<n;x++){//Mainting the no. of iterations we need to perform
      for(int i=0;i<n-x;i++){//Automatically from the last, the highest numbers are going to be shifted to the right
        if(isSmaller(arr,i+1,i)==true){//If the next number is smallee than present then swap
          swap(arr,i+1,i);
        }
      }
    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // return true if ith element is smaller than jth element
  public static boolean isSmaller(int[] arr, int i, int j) {
    System.out.println("Comparing " + arr[i] + " and " + arr[j]);
    if (arr[i] < arr[j]) {
      return true;
    } else {
      return false;
    }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    bubbleSort(arr);
    print(arr);
  }

}