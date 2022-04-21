import java.io.*;
import java.util.*;

public class infix_evaluation{
  
public static int calVal(int a , int b , char ch){
    if(ch == '+'){
        return a+b;
    }
    else if(ch == '-'){
        return a-b;
    }
    else if(ch == '*'){
        return a*b;
    }
    else if(ch == '/'){
        return a/b;
    }
    else {
        return 0;
    }
}

public static boolean isOptr(char ch){
    if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
        return true;
    }
    return false;
}

public static int precedence(char ch){
    if(ch == '+' || ch == '-'){
        return 1;
    }
    return 2;
}

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    Stack<Integer> operand = new Stack<>();
    Stack<Character> operator = new Stack<>();
    for(int i = 0 ; i < s.length() ; i++){
        char ch = s.charAt(i);
        if(ch == '('){
            operator.push(ch);
        }
        else if(ch>='0' && ch<='9'){
            operand.push(ch-'0');
        }
        else if(ch==')'){
            while(operator.peek()!='('&& operand.size()>1){
                char optr = operator.pop();     //+-x/
                int v2 = operand.pop();
                int v1 = operand.pop();
                int ans = calVal(v1,v2,optr);
                operand.push(ans);
            }
            operator.pop();
        }
        else if(isOptr(ch)){
           while(operator.size() > 0 && operand.size()>1 && operator.peek() != '(' &&  precedence(ch) <= precedence(operator.peek())){
                char optr = operator.pop();     //+-x/
                int v2 = operand.pop();
                int v1 = operand.pop();
                int ans = calVal(v1,v2,optr);
                operand.push(ans);
            }
            operator.push(ch);
        }
        
    }
    while(operator.size()!=0 && operand.size()>1){
            char optr = operator.pop();     //+-x/
                int v2 = operand.pop();
                int v1 = operand.pop();
                int ans = calVal(v1,v2,optr);
                operand.push(ans);
        }
        
    System.out.println(operand.peek());
   
 }
}