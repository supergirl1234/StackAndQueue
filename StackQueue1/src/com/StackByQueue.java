package com;

import java.util.LinkedList;
import java.util.Queue;

/*
* 用队列实现栈
*
* */
public class StackByQueue {

    Queue<Integer> queue=new LinkedList<>();


    public void push(Integer num){
              queue.add(num);

    }

    public Integer pop(){


        /*将队列前面的元素（除了最后一个元素）都先出队列，再进队列，这样最后一个元素就变成了队列中的首位，这样子，最后一个进队列的就会先出队列*/
       for(int i=0;i<queue.size()-1;i++) {
            queue.add(queue.poll());
        }

        return queue.poll();

    }

    public Integer size(){
        return queue.size();


    }
    public Integer peek(){
        if(queue.size()==0){
            return null;
        }
        /*将队列前面的元素（除了最后一个元素）都先出队列，再进队列，这样子最后一个元素就会成为队列的首元素*/
        for(int i=0;i<queue.size()-1;i++) {
            queue.add(queue.poll());
        }
        Integer result=queue.peek();//此时的栈顶元素
        queue.add(queue.poll());//要再将栈顶元素还原到它原本的位置（队列中最后），要不然在进行pop操作时，就会进行两次上面的“出队列，再进队”列操作
        return result;

    }

    public static void main(String[] args) {

         StackByQueue stack=new StackByQueue();
         stack.push(1);
         stack.push(2);
         stack.push(3);
         stack.push(4);
        System.out.println("出栈："+stack.pop());
        System.out.println("出栈："+stack.pop());

        System.out.println("栈顶元素："+stack.peek());
        System.out.println("栈的长度："+stack.size());

        System.out.println("出栈："+stack.pop());
         stack.push(5);
         stack.push(6);
        System.out.println("出栈："+stack.pop());

    }
}
