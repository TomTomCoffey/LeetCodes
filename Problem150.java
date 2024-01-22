import java.util.Stack;

public class Problem150 {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stacker = new Stack<>();
        

        for(int i = 0; i < tokens.length; i++){


              if(tokens[i].equals("+"))
              {   int a = stacker.pop();
                 int b = stacker.pop();
                  stacker.push(helper(a, b, 1));
                
               }
               else if (tokens[i].equals("-")){
                   int a = stacker.pop();
                   int b = stacker.pop();
                   stacker.push(helper(a,b,2));
               }
               else if(tokens[i].equals("*")){
                   int a = stacker.pop();
                   int b = stacker.pop();
                   stacker.push(helper(a,b,3));
               }
               else if(tokens[i].equals("/")){
                   int a = stacker.pop();
                   int b = stacker.pop();
                   stacker.push(helper(a,b,4));
               }
               else{
                   stacker.push(Integer.parseInt(tokens[i]));
               }


          }
                return stacker.peek();
 }


        

    private int helper(int a, int b, int sign){

        if(sign == 1){
            return a + b;
        }
        if(sign == 2){
            return b - a;

        }
        if(sign == 3){
            return a * b;
        }

        return b/a;

    }
}
