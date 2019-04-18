package com;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author:Fanleilei
 * Created:2019/4/18 0018
 *
 * 用队列实现栈
 */
public class StackByQueue {

    Queue<Integer> queue=new LinkedList<>();
    public void push(int v){

         queue.add(v);


    }
    public void pop(){
        for(int i=0;i<queue.size()-1;i++){
            Integer result=queue.poll();
            queue.add(result);
        }

        System.out.println(queue.poll());

    }

    public static void main(String[] args) {

      StackByQueue stack=new StackByQueue();
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.push(4);
      stack.pop();
      stack.pop();
        stack.push(5);
      stack.pop();
      stack.pop();
    }
}
