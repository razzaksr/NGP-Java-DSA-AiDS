package stacks;

import java.util.Stack;

public class BalanceViaStack {
    public static boolean isValid(String expression){
        Stack<Character> stk = new Stack<>();
        char[] tempChars = expression.toCharArray();
        for(char each:tempChars){
            if(each=='{'||each=='('||each=='[')
                stk.push(each);
            else if(each=='}'||each==')'||each==']'){
                if(stk.isEmpty()) return false;
                char popped = stk.pop();
                if(each=='}'&&popped!='{'||
                each==']'&&popped!='['||each==')'&&popped!='(')
                    return false;
            }
        }
        return stk.isEmpty(); 
    }
    public static void main(String[] args) {
        System.out.println("Is Balanced "+isValid("()"));
        System.out.println("Is Balanced "+isValid("()[]{}"));
        System.out.println("Is Balanced "+isValid("(]"));
        System.out.println("Is Balanced "+isValid("([])"));
        System.out.println("Is Balanced "+isValid("([)]"));
    }
}
