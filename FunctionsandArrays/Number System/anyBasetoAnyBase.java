import java.util.*;

public class anyBasetoAnyBase {
    public static int basdec(int num,int b){
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

    public static int decbas(int num,int b){
        int sum=0,pow=1;
        while(num>0){
            int r=num%b;
            num=num/b;
            //sum=sum*pow+r;       you want the sum in the reverse order don't forget
            sum+=r*pow;
            pow=pow*10;
        }
        return sum;
    }

    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int t=basdec(n, a);
        System.out.print(decbas(t, b));
        //sc.close();

    } 
}
