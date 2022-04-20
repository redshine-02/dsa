import java.io.*;
import java.util.*;

public class duplicate_paranthesis {
    public static boolean balanced(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            
            if( ch != ')'){
                st.push(ch);
            }
            else{
                if(st.peek()=='('){
                    return true;
                }
                while(st.peek()!='('){
                    st.pop();
                }
                if(st.peek()=='('){
                    st.pop();
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();//sc.next() mai wrong answer aa rha hai
        System.out.println(balanced(s));
    }

}
