package MazePath;


import java.io.*;
import java.util.*;

public class crossword {

  public static void solution(char[][] arr, String[] words, int vidx) {
    if(vidx == words.length){
        print(arr);
        return;
    }
    
    String word = words[vidx];
    for(int i  = 0 ; i<arr.length ; i++){
        for(int  j = 0 ; j<arr[0].length ; j++){
            if(arr[i][j]=='-' || arr[i][j] == word.charAt(0)){
                if(canPlaceHorizontal(arr,word,i,j)){
                    boolean[] weplace = placeHorizontal(arr,word,i,j);
                    solution(arr,words,vidx+1);
                    unPlaceHorizontal(arr,weplace,i,j);
                }
                if(canPlaceVertical(arr,word,i,j)){
                    boolean[] weplace = placeVertical(arr,word,i,j);
                    solution(arr,words,vidx+1);
                    unPlaceVertical(arr,weplace,i,j);
                }
            }
        }
    }

  }
  
  public static void unPlaceVertical(char[][] arr , boolean[] weplace , int x , int y){
      for(int i = 0 ; i<weplace.length ; i++){
          if(weplace[i]){
              arr[x+i][y]='-';
          }
      }
  }
  
  public static void unPlaceHorizontal(char[][] arr , boolean[] weplace , int x , int y){
      for(int i = 0 ; i<weplace.length ; i++){
          if(weplace[i]){
              arr[x][y+i]='-';
          }
      }
  }
  
  public static boolean[] placeVertical(char[][] arr ,  String word , int ii ,int j){
      boolean[] weplace = new boolean[word.length()];
      for(int i = 0 ; i<word.length() ; i++){
          if(arr[i+ii][j]=='-'){
              arr[i+ii][j] = word.charAt(i);
              weplace[i]=true;
          }
      }
      return weplace;
  }
  
  public static boolean[] placeHorizontal(char[][] arr ,  String word , int i ,int jj){
      boolean[] weplace = new boolean[word.length()];
      for(int j = 0 ; j<word.length() ; j++){
          if(arr[i][jj+j]=='-'){
              arr[i][jj+j] = word.charAt(j);
              weplace[j]=true;
          }
      }
      return weplace;
  }
  
  public static boolean canPlaceVertical(char[][] arr , String word , int i , int j){
      if(i-1>=0 && arr[i-1][j]!='+'){
          return false;
      }
      else if(i+word.length()<arr.length && arr[i+word.length()][j]!='+'){
          return false;
      }
      for(int ii = 0 ; ii<word.length() ; ii++){
          if(i+ii>=arr.length){
              return false;
          }
          if(arr[i+ii][j]=='-' || arr[i+ii][j]== word.charAt(ii)){
              continue;
          }
          else{
              return false;
          }
      }
      return true;
  }
  
  public static boolean canPlaceHorizontal(char[][] arr , String word , int i , int j){
      if(j-1>=0 && arr[i][j-1]!='+'){
          return false;
      }
      else if(j+word.length()<arr[0].length && arr[i][j+word.length()]!='+'){
          return false;
      }
      for(int jj = 0 ; jj<word.length() ; jj++){
          if(j+jj>=arr[0].length){
              return false;
          }
          if(arr[i][j+jj]=='-' || arr[i][j+jj]== word.charAt(jj)){
              continue;
          }
          else{
              return false;
          }
      }
      return true;
  }


  public static void print(char[][] arr) {
    for (int i = 0 ; i < arr.length; i++) {
      for (int j = 0 ; j < arr.length; j++) {
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }

  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    char[][] arr = new char[10][10];
    for (int i = 0 ; i < arr.length; i++) {
      String str = scn.next();
      arr[i] = str.toCharArray();
    }
    int n = scn.nextInt();
    String[] words = new String[n];
    for (int i = 0 ; i  < words.length; i++) {
      words[i] = scn.next();
    }
    solution(arr, words, 0);
  }
}