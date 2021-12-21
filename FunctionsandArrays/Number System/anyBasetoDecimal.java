import java.util.*;

public class anyBasetoDecimal {
    public static int decbase(int num,int b){
        int sum=0,pow=1;
        while(num>0){
            int r=num%10;
            num=num/10;
            //sum=sum*pow+r;       you want the sum in the reverse order don't forget
            sum+=r*pow;
            pow=pow*b;
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

