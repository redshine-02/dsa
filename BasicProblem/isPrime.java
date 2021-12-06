import java.util.*;

public class isPrime{
    public static boolean Prime(int n){
        boolean t=true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                t=false;
                break;
            }
        }
        return t;
    }
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Prime(n);
    }
}