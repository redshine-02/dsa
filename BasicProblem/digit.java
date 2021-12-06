import java.util.*;
public class digit {
    
    public static Scanner sc=new Scanner(System.in);

    public static int count(int n){
        int c=0;
        while(n>0){
            n=n/10;
            c++;
        }
        return c;
    }

    public static void digitlefttoright(int num){
        int c=count(num);
        int n=num;
        while(n>0){
            int ld=n/(int)Math.pow(10,c-1);
            n=n%(int)Math.pow(10,c-1);
            System.out.println(ld);
            c--;
        }
    }

    public static void digitrighttoleft(int num){
        int n=num;
        while(n>0){
            int ld=n%10;
            n=n/10;
            System.out.println(ld);
        }
        
    }
    public static void main(String[] args)throws Exception{
        int n=sc.nextInt();
        digitlefttoright(n);
        System.out.println();
        System.out.println();
        System.out.println();
        digitrighttoleft(n);
    }
}