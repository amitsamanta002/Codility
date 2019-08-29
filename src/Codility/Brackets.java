package Codility;

import java.util.Stack;

public class Brackets {

    private static int validateBrackets(String str){

        Stack<Character> stack = new Stack <Character>();
        char[] chars = str.toCharArray();
        int returnFlag = 1;

        for(char ch:chars){
            if((ch=='(')||(ch=='{')||(ch=='[')){
                stack.push(ch);
            }
            else{
                if((ch==')')||(ch=='}')||(ch==']')){
                    char pch = stack.pop();
                    if((ch==')')&&(pch=='('))
                       continue;
                    else if((ch=='}')&&(pch=='{'))
                        continue;
                    else if((ch==']')&&(pch=='['))
                        continue;
                    else
                        return 0;
                }
            }
        }
        if(stack.isEmpty())
            return 1;
        else
            return 0;

    }

    public static void main(String[] args) {

        String expression = "[{(1+2)+(2+3)}*{(1*2))}]";
        int flag = validateBrackets(expression);
        System.out.println("Expression return="+flag);

        System.out.println("1. Valid Expression ; 0. Not a Valid Expression.");

    }
}
