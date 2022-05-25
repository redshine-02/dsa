import java.io.*;
import java.util.*;

public class goldmineII {
	static int max = 0;
	public static void travelAndSpace(int[][] arr ,  int i , int j , boolean[][] vis , ArrayList<Integer> bag){
	    if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || vis[i][j]==true || arr[i][j]==0){
	        return;
	    }
	    vis[i][j] = true;
	    bag.add(arr[i][j]);
	    travelAndSpace(arr,i-1,j,vis,bag);
	    travelAndSpace(arr,i,j+1,vis,bag);
	    travelAndSpace(arr,i,j-1,vis,bag);
	    travelAndSpace(arr,i+1,j,vis,bag);
	}
	public static void getMaxGold(int[][] arr){
	    boolean[][] vis = new boolean[arr.length][arr[0].length];
	    for(int i  = 0 ; i<arr.length ; i++){
	        for(int j = 0 ; j<arr[0].length ; j++){
	            if(arr[i][j]!=0 && vis[i][j]==false){
	                ArrayList<Integer> bag = new ArrayList<>();
	                travelAndSpace(arr,i,j,vis,bag);
	                
	                int sum = 0 ;
	                for(int ele : bag){
	                    sum +=ele;
	                }
	                if(sum>max){
	                    max = sum;
	                }
	            }
	        }
	    }
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[m][n];
		for(int i = 0; i < arr.length; i++){
			for(int j = 0 ; j  < arr[0].length; j++){
				arr[i][j] = scn.nextInt();
			}
		}
		max = 0;
		getMaxGold(arr);
		System.out.println(max);
	}
		
}