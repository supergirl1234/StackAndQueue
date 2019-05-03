package com;

import java.util.Stack;

/**
 * Author:Fanleilei
 * Created:2019/5/3 0003
 *
 * 括号匹配问题
 */
public class StackPractice1 {

    private static boolean  bracketMatch(String str){


        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++) {
            char s = str.charAt(i);
            switch (s){

                case '(':
                case '[':
                case '{':
                    stack.push(s);
                    break;
                case ')':
                case ']':
                case '}': {
                    if (stack.isEmpty()) {
                        return false;

                    }
                    char v = stack.pop();
                    if (!((v=='('&&s==')')||
                            ( v=='['&&s==']')||
                            (v=='{'&&s=='}'))) {
                        return false;
                    }
                    break;
                }

                default:break;


            }
        }

        //判断栈中是否还有剩余
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        //String str="{[(1+2)/3+3]*2";
        String str="[(1+2)/3+3]*2";
        System.out.println(bracketMatch(str));

    }
}
