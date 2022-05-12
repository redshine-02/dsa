import java.util.*;
public class coin_change_comb_inf {

    public static int cc_comb(int[] arr , int idx , int tar , String asf){
        if(tar<0){
            return 0;
        }
        if(tar == 0){
            System.out.println(asf);
            return 1;
        }
        int count = 0 ;
        for(int i = idx ; i<arr.length ; i++){
            if(tar-arr[i]>=0){
                count+=cc_comb(arr, i , tar-arr[i], asf+arr[i]);
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
        int ans = cc_comb(arr, 0 , tar,"");
        System.out.println(ans);
    }

}
