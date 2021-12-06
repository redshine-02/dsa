import java.util.*;
public class StateofWakanda {
    public static Scanner sc=new Scanner(System.in);

    public static void in(int[][] A){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                A[i][j]=sc.nextInt();
            }
        }
    }

    public static void stateofwakanda(int[][] arr){
        for(int j=0;j<arr[0].length;j++){
            if(j%2==0){
                for(int i=0;i<arr.length;i++){
                    System.out.println(A[i][j]);
                }
            }
            else{
                for(int i=arr.length-1;i>=0;i--){
                    System.out.println(A[i][j]);
                }
            }
        }
    }
    public static void main(String[] args)throws Exception{
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        in(arr);
        stateofwakanda(arr);
    }
}
