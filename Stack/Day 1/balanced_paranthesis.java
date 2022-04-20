import java.io.*;
import java.util.*;

public class balanced_paranthesis {
    public static boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}'){
                if(st.size()==0){
                    return false;
                }
                if(ch == ')' && st.peek()!='('){
                    return false;
                }
                else if(ch == ']' && st.peek()!='['){
                    return false;
                }
                else if(ch == '}' && st.peek()!='{'){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        if(st.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isBalanced(s));
    }

}
