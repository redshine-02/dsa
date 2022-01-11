/*Backtracking is power that allows you to explore all paths and when we 
and when we recieve a deadlock then we backtrack
to get to the best path*/


/* Question requirement TLDR approach , where T=top
                                              L=left
                                              D=down
                                              R=Right */

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        //boolean[][] viz= new boolean[n][m];
        floodfill(arr, 0, 0, "",viz);
    }

//METHOD 1
    
    // asf -> answer so far
    // public static void floodfill(int[][] maze, int sr, int sc, String asf,boolean[][] viz) {
    //     if(sr<=maze.length || sc<=maze[0].length || sr>0 || sc<0 || maze[sr][sc]==1 || viz[sr][sc] == true){
    //         return;
    //     }
    //     if(sr==maze.length-1 && sc==maze[0].length-1){
    //         System.out.println(asf);
    //         return;
    //     }
    //     viz[sr][sc]=true;
    //     floodfill(maze,sr,sc-1,asf+"t",viz);
    //     floodfill(maze,sr-1,sc,asf+"l",viz);   
    //     floodfill(maze,sr,sc+1,asf+"d",viz);
    //     floodfill(maze,sr+1,sc,asf+"r",viz);
    //     viz[sr][sc]=false;
    // }

//METHOD 2

    // public static void floodfill(int[][] maze, int sr, int sc, String asf) {
    //     if(sr<=maze.length || sc<=maze[0].length || sr>0 || sc<0 || maze[sr][sc]==1){
    //         return;
    //     }
    //     if(sr==maze.length-1 && sc==maze[0].length-1){
    //         System.out.println(asf);
    //         return;
    //     }
    //     maze[sr][sc]=1;
    //     floodfill(maze,sr,sc-1,asf+"t");
    //     floodfill(maze,sr-1,sc,asf+"l");   
    //     floodfill(maze,sr,sc+1,asf+"d");
    //     floodfill(maze,sr+1,sc,asf+"r");
    //     maze[sr][sc]=0;
    // }

//METHOD 3
        static int[][] dir = {{0,-1},{-1,0},{0,1},{1,0}};
        static String[] dirN ={"t","l","d","r"};
        public static void floodfill(int[][] maze, int sr, int sc, String asf) {
        if(sr<=maze.length || sc<=maze[0].length || sr>0 || sc<0 || maze[sr][sc]==1 || viz[sr][sc] == true){
            return;
        }
        if(sr==maze.length-1 && sc==maze[0].length-1){
            System.out.println(asf);
            return;
        }
        maze[sr][sc]=1;
        for(int d=0;d<dir.length;d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            floodfill(maze, r, c, asf+dirN[d]);
        }
        maze[sr][sc]=0;
    }
}
