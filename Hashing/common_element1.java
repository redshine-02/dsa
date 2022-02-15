import java.io.*;
import java.util.*;

public class common_element1{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc  = new Scanner(System.in);
    //String s = sc.next();
    int n1=sc.nextInt();
    int[] a = new int[n1];
    for(int i=0;i<n1;i++){
        a[i]=sc.nextInt();
    }
    int n2=sc.nextInt();
    int[] b = new int[n2];
    for(int i=0;i<n2;i++){
        b[i]=sc.nextInt();
    }
    HashMap<Integer, Integer> hm = new HashMap<>();
    //Hashmap<Integer,Integer> hm = new Hashmap<>();
    for(int ele : a){
        hm.put(ele,hm.getOrDefault(ele,0)+1);
    }

    for(int ele : b){
        if(hm.containsKey(ele)){
            System.out.println(ele);
            hm.remove(ele);
        }
    }

 }

}public class common_element1 {
    
}
