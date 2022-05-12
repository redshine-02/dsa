import java.util.*;
public class coin_change_per_single
 {

    public static int cc_per(int[] arr ,  int tar , String asf){
        if(tar<0){
            return 0;
        }
        if(tar == 0){
            System.out.println(asf);
            return 1;
        }
        int count = 0 ;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]>0 && tar-arr[i]>=0){
                int val = arr[i];
                arr[i]=-arr[i];
                count+=cc_per(arr, tar-val, asf+val);
                arr[i]=-arr[i];
            }
        }

        return count;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        int ans = cc_per(arr, tar ,"");
        System.out.println(ans);
    }

}
