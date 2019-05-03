package com;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author:Fanleilei
 * Created:2019/5/3 0003
 *
 * 用队列实现栈
 */
public class StackByQueue {

    private Queue<Integer> queque=new LinkedList<>();


    private  void push(int item){

        queque.add(item);


    }

   private  Integer pop(){

        //将队列中的元素（除去最后一个元素）都先出队列，再进队列，这样最后一个元素就变成了队列中的首位

            for (int i = 0; i < queque.size()-1; i++) {
                Integer s = queque.poll();
                queque.add(s);
            }


        return queque.poll();


    }

    private Integer peek(){

        //将队列中的元素（除去最后一个元素）都先出队列，再进队列，这样最后一个元素就变成了队列中的首位


        for (int i = 0; i < queque.size()- 1; i++) {
            Integer s = queque.poll();
            queque.add(s);
        }

        Integer value=queque.peek();//因为如果进行了上面的操作，再进行pop操作时，就等于进行了2次上面的操作，所以要把它还原，所以有了下面的操作
        queque.poll();
        queque.add(value);

        return value;

    }

    private int size(){
        return queque.size();

    }

    public static void main(String[] args) {
        StackByQueue stack=new StackByQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.size());
       System.out.println("栈顶元素："+stack.peek());
        System.out.println("出栈："+stack.pop());
        System.out.println("出栈："+stack.pop());
        System.out.println("出栈："+stack.pop());


    }
}
