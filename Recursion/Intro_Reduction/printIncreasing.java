import java.util.*;

public class printIncreasing {
    public static void increasing(int[] arr, int idx){
        if(idx==arr.length){
            return;
        }
        increasing(arr,idx+1);
        System.out.println(arr[idx]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        increasing(arr,0);
    }
}
