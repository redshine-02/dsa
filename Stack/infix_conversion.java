import java.io.*;
import java.util.*;

public class infix_conversion{
  
public static boolean isOptr(char ch){
    if(ch == '+'|| ch == '-' || ch == '*' || ch == '/'){
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
    String exp = br.readLine();

    // code
    Stack<String> postfix = new Stack<>();
    Stack<String> prefix = new Stack<>();
    Stack<Character> operator = new Stack<>();
    
    for(int i = 0 ; i < exp.length(); i++){
        char ch = exp.charAt(i);
        String s = "";
        s+=ch;
        if(ch == '('){
            operator.push(ch);
        }
        else if(ch == ')'){
            while(operator.size()>0 && operator.peek()!='(' ){
               char c = operator.pop();
               String o2 = postfix.pop();
               String o1 = postfix.pop();
               String r2 = prefix.pop();
               String r1 = prefix.pop();
               prefix.push(c+r1+r2);
               postfix.push(o1+o2+c);
            }
            
            operator.pop();
        }
        else if(isOptr(ch)){
            while(operator.size()>0 && operator.peek()!='('&& precedence(ch)<=precedence(operator.peek())){
               char c = operator.pop();
               String o2 = postfix.pop();
               String o1 = postfix.pop();
               String r2 = prefix.pop();
               String r1 = prefix.pop();
               prefix.push(c+r1+r2);
               postfix.push(o1+o2+c);
            }
            operator.push(ch);
        }
        else{
            prefix.push(s);
            postfix.push(s);
        }
    }
    while(operator.size()>0){
               char c = operator.pop();
               String o2 = postfix.pop();
               String o1 = postfix.pop();
               String r2 = prefix.pop();
               String r1 = prefix.pop();
               prefix.push(c+r1+r2);
               postfix.push(o1+o2+c);
    }
    System.out.println(postfix.peek());
    System.out.println(prefix.peek());
 }
}