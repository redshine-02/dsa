import java.util.*;
public class linear {
    public static int powlinear(int x,int n){
        if(n==0){
            return 1;
        }
        return x*powlinear(x,n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x = sc.nextInt();
        
        System.out.println(powlinear(x,n));
    }
}
