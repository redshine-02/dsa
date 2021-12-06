import java.util.*;

public class GcdLCM {
    public static void hcf(int a,int b){
        int min=a<b?a:b;
        int max=a>b?a:b;
        if(max%min==0){
            System.out.println(min);
        }
        else{
            hcf(max%min,min);
        }
    }
    public static void lcm(int a,int b){
        int max=a>b?a:b;
        for(int i=max;i<=a*b;i++){
            if(i%a==0 && i%b==0){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        hcf(a,b);
        lcm(a,b);
    }
}
