import java.util.*;

public class Main {

    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        ArrayList<String> ans = getkpc(n);
        System.out.println(ans);
    }

    public static ArrayList<String> getkpc(String n){
        if(n.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = n.charAt(0);
        String s= n.substring(1);

        ArrayList<String> rec = getkpc(s);
        ArrayList<String> myAns = new ArrayList<>();

        int idx = ch - '0';
        String code = codes[idx];

        for(int i=0;i<code.length();i++){
            char nc = code.charAt(i);
            for(String ele : rec){
                myAns.add(nc+ele);
            }
        }
        return myAns;
    }
    
}
