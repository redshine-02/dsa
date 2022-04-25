import java.util.*;
public class score_paranthesis {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int count = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            
            if(ch == '('){
                st.push(0);
            }
            else{
                if(st.peek()==0){
                    st.pop();
                    st.push(1);
                }
                else{
                    int val = 0 ;
                    while(st.peek() != 0){
                        val += st.pop();
                    }
                    st.pop();
                    st.push(2*val);
                }
            }
        }
        
        while(st.size()>0){
            count+=st.pop();
        }
        return count;
    }
    
}