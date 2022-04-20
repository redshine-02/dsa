import java.util.*;
class Solution {
    public static int[] nsor(int[] arr){
    if(arr.length == 0 ){
        return null;
    }
    int[] sol = new int[arr.length];
    Arrays.fill(sol,arr.length);
    Stack<Integer> st = new Stack<>();
    for(int i = 0 ; i< arr.length ; i++){
        while(st.size()!=0 && arr[i]<arr[st.peek()]){
            sol[st.peek()]=i;
            st.pop();
        }
        st.push(i);
    }
    return sol;
}
   public static int[] nsol(int[] arr){
    if(arr.length == 0 ){
        return null;
    }
    int[] sol = new int[arr.length];
    Arrays.fill(sol,-1);
    Stack<Integer> st = new Stack<>();
    for(int i = arr.length-1 ; i>=0 ; i--){
        while(st.size()!=0 && arr[i]<arr[st.peek()]){
            sol[st.peek()]=i;
            st.pop();
        }
        st.push(i);
    }
    return sol;
}
   
   
   public int largestRectangleArea(int[] heights) {
       int[] l = nsol(heights);
       int[] r = nsor(heights);
       
       int max = 0;
       for(int i = 0 ; i<heights.length ; i++){
           int val = heights[i]*(r[i]-l[i]-1);
           if(val>max){
               max = val;
           }
       }
       return max;
   }
}