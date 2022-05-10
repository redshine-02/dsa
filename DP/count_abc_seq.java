import java.io.*;
import java.util.*;

public class count_abc_seq {
    
    public static int sequences(String s){
        int a = 0 ; 
        int ab = 0 ;
        int abc = 0 ;
        for(int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i) == 'a'){
                a = 2*a + 1;
            }
            else if(s.charAt(i) == 'b'){
                ab = 2*ab + a;
            }
            else if(s.charAt(i) == 'c'){
                abc = 2*abc + ab;
            }
        }
        return abc;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = sequences(s);
        System.out.println(ans);
    }
}