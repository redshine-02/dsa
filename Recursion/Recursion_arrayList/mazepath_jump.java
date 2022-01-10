import java.util.*;

public class mazepath_jump {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m =sc.nextInt();
        ArrayList<String> ans = mazepath(0,0,n-1,m-1);
        System.out.println(ans);
    }

    public static ArrayList<String> mazepath_jump(int sr,int sc,int dr, int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> myAns = new ArrayList<>();

        for(int jump=1; sr+jump<=dr; jump++){
            ArrayList<String> hm = mazepath_jump(sr+jump, sc, dr, dc);
            for(String ele : hm){
                myAns.add("h"+jump+ele);
            }
        }

        for(int jump=1; sc+jump<=dc; jump++){
            ArrayList<String> vm = mazepath_jump(sr+jump, sc, dr, dc);
            for(String ele : vm){
                myAns.add("v"+jump+ele);
            }
        }

        for(int jump=1; sr+jump<=dr && sc+jump<=dc; jump++){
            ArrayList<String> dm = mazepath_jump(sr+jump, sc+jump, dr, dc);
            for(String ele : dm){
                myAns.add("d"+jump+ele);
            }
        }
        return myAns;
    }
}
