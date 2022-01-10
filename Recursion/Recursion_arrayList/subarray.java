import java.io.*;
import java.util.*;

public class subarray {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> ans = gss(str);
        System.out.println(ans);

    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch=str.charAt(0);
        String s = str.substring(1);

        ArrayList<String> rec = gss(s);
        ArrayList<String> myAns = new ArrayList<>();

        for(String ele : rec ){
            myAns.add(ele);
        }
        
        for(String ele : rec ){
            myAns.add(ch+ele);
        }

        return myAns;
    }

}