import java.io.*;
import java.util.*;

public class nQueen_bnb {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    boolean[][] board = new boolean[n][n];
    boolean[] c = new boolean[n];
    boolean[] ld = new boolean[2*n-1];
    boolean[] rd = new boolean[2*n-1];
    nQueens(board , c , ld , rd , "" , 0);
  }
  
  
  
  public static void nQueens(boolean[][] board , boolean[] col , boolean[] ld , boolean[] rd , String asf , int r){
      if(r == board.length){
          System.out.println(asf+".");
          return;
      }
      for(int c = 0 ; c<board.length ; c++){
          board[r][c] = true;
          if(col[c]!=true && ld[r+c]!=true && rd[r-c+(board.length)-1]!=true ){
              col[c] = true;
              ld[r+c] = true;
              rd[r-c+(board.length)-1] = true;
              nQueens(board,col,ld,rd,asf+r+"-"+c+", ",r+1);
              col[c] = false;
              ld[r+c] = false;
              rd[r-c+(board.length)-1] = false;
          }
          board[r][c] = false;
      }
  }

}public class nQueen_bnb {
    
}
