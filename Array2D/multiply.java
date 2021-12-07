import java.util.*;

public class multiply {

    public static Scanner sc=new Scanner(System.in);

    public static void in(int[][] A){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                A[i][j]=sc.nextInt();
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
    public static int[][] mularray(int[][] A,int[][] B){
        int n1=A.length;
        int m1=A[0].length;
        //int n2=B.length;
        int m2=B[0].length;
        int[][] C=new int[n1][m2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                int sum=0;
                for(int k=0;k<m1;k++){
                    sum+=A[i][k]*B[k][j];
                }
                C[i][j]=sum;
            }
        }
        return C;
    }
    public static void main(String[] args){
        int n1=sc.nextInt();
        int m1=sc.nextInt();
        int[][] arr1=new int[n1][m1];
        in(arr1);
        int n2=sc.nextInt();
        int m2=sc.nextInt();
        int[][] arr2=new int[n2][m2];
        in(arr2);
        if(m1==n2){
            int[][] C=mularray(arr1,arr2);
            display(C);

        }
        else{
            System.out.print("Invalid input");
        }
    }
}
