import java.util.*;

public class Main {

    public static ArrayList<String> mazepath(int sr, int sc, int dr , int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();

        if(sc+1<=dc){
            ArrayList<String> hm = mazepath(sr, sc+1, dr, dc);
            for(String ele : hm){
                myAns.add("h"+ele);
            }
        }
        if(sr+1<=dr){
            ArrayList<String> vm = mazepath(sr+1, sc, dr, dc);
            for(String ele : vm){
                myAns.add("v"+ele);
            }
        }
        return myAns;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> ans = mazepath(0,0,n-1,m-1);
        System.out.println(ans);
    }
    
}
