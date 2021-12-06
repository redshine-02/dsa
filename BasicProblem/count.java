import java.util.*;
public class count {
    
    public static Scanner sc=new Scanner(System.in);

    public static int count(int n){
        int c=0;
        while(n>0){
            n=n/10;
            c++;
        }
        return c;
    }
    public static void main(String[] args)throws Exception{
        int n=sc.nextInt();
        System.out.println(count(n));
    }
}
