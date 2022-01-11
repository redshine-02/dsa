import java.util.*;

public class Main {
    
    public static void main(String args[])throws Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        encoding(str , "");
    }

    public static void encoding(String s , String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }

        if(s.charAt(0)=='0'){
            return;
        }

        char ch1 = s.charAt(0);
        int v1 = ch1 - '0';
        encoding(s.substring(1), ans+(char)(v1+'a'-1));

        if(s.length()>1){
            char ch2 = s.charAt(1);
            int v2 = ch2 - '0';
            int num = v1*10+v2;
            if(num<=26){
            encoding(s.substring(2), ans+(char)(num+'a'-1));}
        }
    }
}
