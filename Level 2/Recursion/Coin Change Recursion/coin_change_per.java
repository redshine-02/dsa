import java.util.*;
public class coin_change_per {

    public static int cc_permute(int[] arr ,int tar , String asf){
        if(tar<0){
            return 0;
        }
        if(tar == 0){
            System.out.println(asf);
            return 1;
        }
        int count = 0 ;
        for(int i = 0 ; i<arr.length ; i++){
            if(tar-arr[i]>=0){
                count+=cc_permute(arr, tar-arr[i], asf+arr[i]);
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
        int ans = cc_permute(arr,tar,"");
        System.out.println(ans);
    }

}
