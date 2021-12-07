import java.util.*;

public class rotate90 {

    public static Scanner sc=new Scanner(System.in);

    public static void in(int[][] A){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                A[i][j]=sc.nextInt();
            }
        }
    }

    public static void transpose(int[][] arr){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    if(i<j){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;}
                }
            }
    }

    public static void rotate(int[][] arr) {
        transpose(arr);
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            int lo=0;
            int hi=m-1;
            while(lo<=hi){
                int temp=arr[i][lo];
                arr[i][lo]=arr[i][hi];
                arr[i][hi]=temp;
                lo++;
                hi--;
            }
        }

    }

    public static void display(int[][] A){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        int n=sc.nextInt();
        int m=n;
        int[][] arr=new int[n][m];
        in(arr);
        rotate(arr);
        display(arr);


    }

    
}
