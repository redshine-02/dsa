import java.io.*;
import java.util.*;

public class lastIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        System.out.println(lastIndex(arr,arr.length-1,x));
        //System.out.println(lastIndex(arr,0,x));
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==-1){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }
        else{
            return lastIndex(arr,idx-1,x);
        }
        
    }

    // public static int lastIndex1(int[] arr, int idx, int x){
    //     if(idx==arr.length){
    //         return -1;
    //     }
    //     int index=lastIndex(arr,idx+1,x);
    //     if(index==-1){
    //         if(arr[idx]==x){
    //             return idx;
    //         }
    //         else{
    //             return index;
    //         }
    //     }
    //     else{
    //         return index;
    //     }}

}