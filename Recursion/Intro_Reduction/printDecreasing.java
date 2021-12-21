import java.util.*;

public class printDecreasing {
    public static void decreasing(int[] arr, int idx){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        decreasing(arr,idx+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        decreasing(arr,0);
    }
}
