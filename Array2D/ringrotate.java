import java.util.*;

public class ringrotate {

    public static Scanner sc=new Scanner(System.in);

    public static void in(int[][] A){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                A[i][j]=sc.nextInt();
            }
        }
    }

    public static void ringrotat(int[][] arr) {
    }
    
    public static void main(String[] args){
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        in(arr);
        ringrotat(arr);


    }

    
}

