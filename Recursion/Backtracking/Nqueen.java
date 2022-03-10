import java.io.*;
import java.util.*;

public class Nqueen {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        printNQueens(chess,"",0);
    }
    
    public static boolean isSafe(int r , int c ,  int[][] chess){
        for(int i = r-1 , j = c+1 ; i>=0 && j<chess.length ; i--,j++){
            if(chess[i][j]==1){
                return false;
            }
        }
        for(int i = r-1 , j = c ; i>=0  ; i--){
            if(chess[i][j]==1){
                return false;
            }
        }
        for(int i = r-1 , j = c-1 ; i>=0 && j>=0 ; i--,j--){
            if(chess[i][j]==1){
                return false;
            }
        }
        return true;
    }

    public static void printNQueens(int[][] chess, String asf, int row) {
        if(row == chess.length){
            System.out.println(asf+".");
            return;
        }
        
        for(int c = 0 ; c<chess.length ; c++){
            chess[row][c]=1;
            if(isSafe(row,c,chess)){
                printNQueens(chess,asf+row+"-"+c+", ",row+1);
            }
            chess[row][c]=0;
        }
        
    }
}
