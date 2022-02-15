import java.io.*;
import java.util.*;

public class highest_freq {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        char maxfre = s.charAt(0);
        for(Character ele : hm.keySet()){
            if(hm.get(maxfre)<hm.get(ele)){
                maxfre=ele;
            }
        }
        System.out.println(maxfre);
    }

}