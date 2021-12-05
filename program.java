import java.io.*;
import java.util.*;

public class program{

    public static Scanner sc=new Scanner(System.in);

    public static int[][] arrcreate(int n,int m){
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    public static int[][] arrmul(int[][] a,int[][] b){
        int n1=a.length;
        int m1=a[0].length;
        int n2=b.length;
        int m2=b[0].length;
        int[][] C=new int[n1][m2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                int sum=0;
                for(int k=0;k<m1;k++){
                    sum+=a[i][k]*b[k][j];
                }
                C[i][j]=sum;
            }
        }
        return C;
    }
    public static void display(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

public static void main(String[] args) throws Exception {
    // write your code here
    
    int n1=sc.nextInt();
    int m1=sc.nextInt();
    int[][] arr1=arrcreate(n1,m1);
    int n2=sc.nextInt();
    int m2=sc.nextInt();
    int[][] arr2=arrcreate(n2,m2);
    if(m1==n2){
    int[][] arr3=arrmul(arr1,arr2);
    display(arr3);
    }
    else{
        System.out.println("Invalid input");
    }
    
    
 }

}
