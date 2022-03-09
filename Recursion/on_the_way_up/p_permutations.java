import java.util.*;

public class p_permutations {

    public static void main(String args[])throws Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printperm(str,"");
        sc.close();
    }
    public static void printperm(String s , String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String res = s.substring(0,i) + s.substring(i+1);
            printperm(res, ans+ch);
        }
    }
}
