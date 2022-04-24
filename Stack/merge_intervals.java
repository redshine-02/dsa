import java.io.*;
import java.util.*;

public class merge_intervals {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time
        
        Arrays.sort(arr, (a,b)->{
           return a[0] - b[0]; 
        });
        
        Stack<int []> st = new Stack<>();
        
        st.push(arr[0]);
        for(int i = 1 ; i<arr.length ; i++){
            int[] l = st.pop();
            int s1 = l[0];
            int e1 = l[1];
            
            int s2 = arr[i][0];
            int e2 = arr[i][1];
            
            if(s2<=e1){
                int em = Math.max(e1,e2);
                int[] merge = {s1,em};
                st.push(merge);
            }
            else{
                st.push(l);
                st.push(arr[i]);
            }
        }
        
        int[][] ans = new int [st.size()][2];
        for(int i = ans.length-1 ; i>=0 ; i--){
            int[] temp = st.pop();
            ans[i][0] = temp[0];
            ans[i][1] = temp[1];
        }
        
        for(int i = 0 ; i<ans.length ; i++){
            System.out.println(ans[i][0] + " " + ans[i][1]);
        }
    }

}