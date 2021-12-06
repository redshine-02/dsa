import java.util.*;
public class reverse {
    
    public static Scanner sc=new Scanner(System.in);

    public static int reversed(int n){
        int sum=0;
        while(n>0){
            int ld=n%10;
            n=n/10;
            sum=(sum*10)+ld;
        }
        return sum;
    }
    public static void main(String[] args)throws Exception{
        int n=sc.nextInt();
        System.out.println(reversed(n));
    }
}
