package com;

import java.util.Stack;

/**
 * Author:Fanleilei
 * Created:2019/4/16 0016
 *
 * 括号配对问题
 */
public class StackApplication2 {



    public static boolean isValid(String s){

        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);
            switch(ch) {
                case '(':
                case '[':
                case '{':
                    stack.push(ch);
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char result=stack.pop();
                    if(!((result=='('&&ch==')')||(result=='['&&ch==']')||(result=='{'&&ch=='}'))){
                        return  false;

                    }
                    break;
                    default:
                        break;
            }
        }
        //如果经过上面的过程，栈为空了
        if(stack.isEmpty()){

            return  true;
        }else {
            return  false;
        }

    }

    public static void main(String[] args) {

       // String s="[(2+3)*4+2]/11";//true
        String s="{(2+3)*4+2]/11";//false
        boolean t=isValid(s);
        System.out.println(t);
    }
}
