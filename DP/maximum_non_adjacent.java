import java.io.*;
import java.util.*;

public class maximum_non_adjacent {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        
        int inc = arr[0];
        int ex = 0 ;
        
        for(int i = 1 ; i<n ; i++){
            int temp = Math.max(inc , ex);
            inc = ex + arr[i];
            ex = temp;
        }
        
        System.out.println(Math.max(inc,ex));
    }
}