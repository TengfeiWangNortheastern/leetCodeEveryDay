package EasyProblems.Week1.ValidParenthesese20;

import java.util.*;

public class test {
    public static void main(String[] args) {
        String s= "[";
        String currnetC;
        Map<String,String> dictionary=new HashMap<String,String>();
        Stack<String> stack=new Stack<>();
        dictionary.put(")","(");
        dictionary.put("}","{");
        dictionary.put("]","[");

//        System.out.println(dictionary.get(s.substring(0,1)).equals("}"));
        for (int i = 0; i < s.length(); i++) {
            currnetC=s.substring(i,i+1);
            if(dictionary.containsKey(currnetC)) {
                String top = stack.isEmpty() ? "#$%" : stack.pop();
                if (!top.equals(dictionary.get(currnetC))) {
                    System.out.println(false);
                }
            }else{
                stack.push(currnetC);
            }

        }
//        return flag;
        System.out.println(stack.isEmpty());
    }

}
