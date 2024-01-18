
import java.util.Stack; 
public class Problem32{

    public int longestValidParentheses(String s) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max = 0;
        char[] c = s.toCharArray();

        for(int i = 0; i < c.length; i++){

            if(c[i] == '('){
                stack.push(i);
            }
            else{
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    stack.pop();
                    if(stack.isEmpty()){
                        stack.push(i);
                    }
                    else{
                        max = Math.max(max, i-stack.peek());
                    }
                  
                }
            }
        }
        return max;
    }
    
}