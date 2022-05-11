import java.util.*;

public class minimum_path_floodFill {
    public static boolean inRange(int r , int c , int n , int m , boolean [][] maze){
        if(r<0 || c<0 || r>=n || c>=m || maze[r][c] == true){
            return false;
        }
        return true;
    }
    public static int length = (int)1e9;
    public static String s;
    public static int floodFill_01(int sr , int sc , int dr , int dc , int[][] dir , String[] dirN ,boolean[][] maze , String asf){
        if(sr == dr && sc ==dc){
            if(length>=asf.length()){
                length =  asf.length();
                s = asf;
            }
            
            return 1;
        }
        maze[sr][sc] = true;
        int count = 0 ;
        for(int d = 0 ; d<dir.length ; d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if(inRange(r,c,dr+1,dc+1,maze)){
                
                count+=floodFill_01(r, c, dr, dc, dir, dirN,maze, asf+dirN[d]);
                
            }
        }
        maze[sr][sc] = false ;
        return count;
    }
    public static void floodfill(){
        int n = 3;
        int m = 4;
        boolean[][] maze = new boolean[n][m];
        int[][] dir = {{1,0},{0,1},{1,1}};
        String[] dirN = {"H","V","D"};
        length = (int)1e9;
        s="";
        
        int ans = floodFill_01(0,0,n-1,m-1,dir,dirN,maze,"");
        System.out.println(ans);
    }
    public static void main(String[] args){
        length = (int)1e9;
        s="";
        floodfill();
        System.out.println(length + "\t"+ s);
    }
}
