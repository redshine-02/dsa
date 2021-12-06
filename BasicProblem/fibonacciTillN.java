import java.util.*;

public class fibonacciTillN {
    public static void fibonacci(int num){
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=3;i<=num;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibonacci(n);
    }
}
