import java.util.*;

public class search {

    public static Scanner sc=new Scanner(System.in);

    public static void in(int[][] A){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                A[i][j]=sc.nextInt();
            }
        }
    }

    public static void searchsort(int[][] arr,int x){
        int n=arr.length;
        //starting point is top right
        int i=0;
        int j=n-1;
        while(i<n && j>=0){
            if(arr[i][j]==x){
                System.out.println(i);
                System.out.println(j);
                return;
            }
            else if(arr[i][j]<x){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println("Not Found");
    }
    
    public static void main(String[] args){
        int n=sc.nextInt();
        //This program is for a nxn matrix
        int m=n;
        int[][] arr=new int[n][m];
        in(arr);
        int x=sc.nextInt();
        searchsort(arr,x);
        


    }
}
