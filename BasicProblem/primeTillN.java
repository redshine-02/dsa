import java.util.*;

public class primeTillN{
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

    public static void PrimeRange(int a,int b){
        for(int i=a;i<=b;i++){
            if(Prime(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        PrimeRange(a,b);
    }
}
