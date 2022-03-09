import java.util.*;

public class logarithm {
    public static int log(int x,int n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            int t = log(x,n/2);
            return t*t;
        }
        else{
            int t = log(x,n/2);
            return x*t*t;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(log(x,n));
    }
}
