import java.util.*;
public class implementation {
    
    public static void main(String[] args)throws Exception{
        Stack<Integer> st = new Stack<>();
        //underflow
        // st.pop();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        //overflow
        // while(true){
        //     st.push(10);
        // }
        System.out.println(st);  // [10,20,30,40,50] //error in case of overflow because then it will be an unreachable statement
    }
}
