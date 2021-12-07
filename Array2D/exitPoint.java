import java.util.*;

public class exitPoint {

    public static Scanner sc=new Scanner(System.in);

    public static void in(int[][] A){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                A[i][j]=sc.nextInt();
            }
        }
    }
    
    public static void exit(int[][] arr){
        int dir=0;

        int i=0,j=0;
        int n=arr.length;
        int m=arr[0].length;
        while(true){
            dir+=arr[i][j];
            dir%=4;
            if(dir==0){
                j++;
            }
            else if(dir==1){
                i++;
            }
            else if(dir==2){
                j--;
            }
            else{
                //dir==3
                i--;

            }
            if(i<0 || j<0 || j>=m || i>=n){
                break;
            }
        }
        if(i<0){
            i++;
        }
        else if(j<0){
            j++;
        }
        else if(j>=n){
            j--;
        }
        else{
            i--;
        }
        System.out.println(i);
        System.out.println(j);
    }
    public static void main(String[] args){
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        in(arr);
        exit(arr);
        


    }
}
