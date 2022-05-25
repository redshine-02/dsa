import java.util.*;

public class mazepath_jumps {
    public static boolean inRange(int r , int c , int n , int m){
        if(r<0 || c<0 || r>=n || c>=m){
            return false;
        }
        return true;
    }
    //************************    MAZE PATH WITH JUMP     *********************************** */
    public static int mazePath_02(int sr , int sc , int dr , int dc , int[][] dir , String[] dirN , String asf){
        if(sr == dr && sc ==dc){
            System.out.println(asf);
            return 1;
        }
        int count = 0 ;
        for(int d = 0 ; d<dir.length ; d++){
            for(int jump =1 ; jump<=Math.max(dr,dc) ; jump++){
            int r = sr + (dir[d][0]*jump);
            int c = sc + (dir[d][1]*jump);
            if(inRange(r,c,dr+1,dc+1)){
                count+=mazePath_02(r, c, dr, dc, dir, dirN, asf+dirN[d]+jump);
            }
        }
        }
        return count;
    }

    public static void mazePath(){
        int n = 3;
        int m = 3;
        int[][] dir = {{1,0},{0,1},{1,1}};
        String[] dirN = {"H","V","D"};
        
        int ans = mazePath_02(0,0,n-1,m-1,dir,dirN,"");
        System.out.println(ans);
    }
    public static void main(String[] args){
        mazePath();
    }
}
