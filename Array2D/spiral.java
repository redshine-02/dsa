import java.util.*;

public class spiral{

    public static Scanner sc=new Scanner(System.in);

    public static void in(int[][] A){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                A[i][j]=sc.nextInt();
            }
        }
    }

    public static void spiral1(int[][] A){
        int n=A.length;
        int m=A[0].length;

        int count=0;
        int total=m*n;

        int minr=0;
        int maxr=n-1;
        int minc=0;
        int maxc=m-1;

        while(count<total){
            for(int i=minr;i<=maxr && count<total;i++){
                System.out.println(A[i][minc]);
                count++;
            }
            minc++;
            for(int i=minc;i<=maxc && count<total;i++){
                System.out.println(A[maxr][i]);
                count++;
            }
            maxr--;
            for(int i=maxr;i>=minr && count<total;i--){
                System.out.println(A[i][maxc]);
                count++;
            }
            maxc--;
            for(int i=maxc;i>=minc && count<total;i--){
                System.out.println(A[minr][i]);
                count++;
            }
            minr++;
        }
    }
    
    public static void main(String[] args){
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        in(arr);
        //display(arr);
        spiral1(arr);

    }
}