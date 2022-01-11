import java.io.*;
import java.util.*;

public class p_kpc {
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printKPC( str , "" );

    }

    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        char ch = str.charAt(0);
        String s = str.substring(1);

        int idx = ch - '0';
        String code = codes[idx];

        for(int i=0;i<code.length();i++){
            char nc = code.charAt(i);
            printKPC(s,asf+nc);
        }
        
    }

}