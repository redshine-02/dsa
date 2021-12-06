import java.util.*;
public class ceilFloor {
    public static Scanner sc=new Scanner(System.in);

    public static void input(int[] A){
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
    }

    public static void operation(int[] A,int a){
        int i=0;
        int j=A.length-1;
        int fl=0;
        int ce=0;
        while(i<=j){
            int mid=(i+j)/2;
            

        }
    }
    public static void main(String[] args)throws Exception{
        int n=sc.nextInt();
        int[] arr=new int[n];
        input(arr);
        int t=sc.nextInt();
        operation(arr,t);
    }
}
