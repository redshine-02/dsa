import java.io.*;
import java.util.*;

public class celebrity_problem {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < arr.length ; i++){
            st.push(i);
        }
        while(st.size()>=2){
            int j = st.pop();
            int i = st.pop();
            if(arr[i][j] == 1){
                st.push(j);
            }
            else{
                st.push(i);
            }
        }
        
        int pc = st.peek();
        boolean ans = true;
        
        for(int i = 0 ; i < arr.length ; i++){
            if(pc!=i && (arr[pc][i]==1 || arr[i][pc] == 0)){
                ans = false;
                break;
            }
        }
        if(ans == true){
            System.out.println(pc);
        }
        else{
            System.out.println("none");   
        }
    }
    

}