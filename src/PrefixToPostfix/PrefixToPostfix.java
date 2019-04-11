package PrefixToPostfix;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        List<String> prefixes = new ArrayList<>();
        prefixes.add("+1**23/14");

        prefixes = prefixToPostfix(prefixes);
    }

    public static List<String> prefixToPostfix(List<String> prefixes) {
        // Write your code here
        List<String> postfixes = new ArrayList<>();

        for(String prefix : prefixes){
            String infix = getInfix(prefix);
            String postfix = getPostfix(infix);
            System.out.println(postfix);
            postfixes.add(postfix);
        }

        return postfixes;
    }

    public static int getPrecendence(char c){
        switch (c){
            case '-':
                return 1;
            case '+':
                return 2;
            case '*':
                return 3;
            case '/':
                return 4;
        }
        return -1;
    }

    public static String getPostfix(String infix){
        String postfix = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i<infix.length(); ++i) {
            Character c = infix.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                postfix += c;
            } else {
                while (!stack.isEmpty() && getPrecendence(c) <= getPrecendence(stack.peek())) {
                    postfix += stack.pop();
                }

                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }
        return postfix;
    }

    public static String getInfix(String prefix){
        Stack<Character> stack = new Stack<>();
        String infix = "";

        for(Character c : prefix.toCharArray()){
            if(c == '/' || c == '*' || c == '+' || c == '-'){
                stack.push(c);
            }else{
                infix += c;
                if(!stack.isEmpty())
                    infix += stack.pop();
            }
        }

        return infix;
    }
}
