package EasyProblems.Week10;

import java.util.Stack;

public class demo76 {
    public static void main(String[] args) {
        System.out.println(calculate("3+2*2"));
    }
    public static int calculate(String s) {
        //None ( or ) edtion
        // calculate * or / first, and add up all elements
        if(s==null||s.isEmpty())
            return 0;
        Stack<Integer> stack=new Stack<>();
        int curN=0,len=s.length(),sum=0;
        char op='+';
        for (int i=0;i<len;i++){
            char curC=s.charAt(i);
            if(Character.isDigit(curC)){
                curN=curN*10+curC-'0'; //add a digit to a number, we need to 10*prev+cur
            }
            if(!Character.isDigit(curC)&&!Character.isWhitespace(curC)||i==len-1){
                //the current char is an operator or is the last c of string
                if(op=='-'){
                    stack.push(-curN);
                }else if(op=='+'){
                    stack.push(curN);
                }else if(op=='*'){
                    stack.push(stack.pop()*curN);
                }else if(op=='/'){
                    stack.push(stack.pop()/curN);
                }
                op=curC;
                curN=0;

            }
        }
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}
