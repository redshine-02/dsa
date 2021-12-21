import java.util.*;

public class decimaltoAnyBase {
    public static int decbase(int num,int b){
        int sum=0,pow=1;
        while(num>0){
            int r=num%b;
            num=num/b;
            //sum=sum*pow+r;       you want the sum in the reverse order don't forget
            sum+=r*pow;     // reverse order mai add up hoga
            pow=pow*10;
        }
        return sum;
    }
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        System.out.print(decbase(n,a));
    }
}
