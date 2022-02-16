import java.io.*;
import java.util.*;

public class longest_consecutive{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    //HashMap<Integer,Boolean> hm = new HashMap<>();
    HashMap<Integer, Boolean> hm = new HashMap<>();
    for(int ele: arr){
        hm.put(ele,true);
    }
    for(int ele : arr){
        if(hm.containsKey(ele-1)){
            hm.put(ele,false);
        }
    }
    int mtp=0;
    int mlen=0;
    for(int ele : arr){
        if(hm.get(ele)==true){
            int tempstr=ele;
            int templen=1;

            while(hm.containsKey(tempstr+templen)){
                templen++;
            }
            if(templen>mlen){
                mlen=templen;
                mtp=tempstr;
            }
        }
    }
    for(int i=mtp;i<mtp+mlen;i++){
        System.out.println(i);
    }
 }

}