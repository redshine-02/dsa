import java.util.*;
public class subArray {
    public static void subArray(int[] arr){
        for(int start=0;start<=arr.length-1;start++){
            for(int end=start;end<=arr.length-1;end++){
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        subArray(arr);
    }
}
