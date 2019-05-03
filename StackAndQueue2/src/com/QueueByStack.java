package com;

import java.util.Stack;

/**
 * Author:Fanleilei
 * Created:2019/5/3 0003
 *
 * 用栈实现队列
 */
public class QueueByStack {

    private  Stack<Integer> stack=new Stack<>();
    private  Stack<Integer> newStack=new Stack<>();

    private void add(int item){
        stack.push(item);

    }
    private void poll(){


        //将老栈中的元素放到新栈中
        int length=stack.size();//stack.size()不能放在for循环里面，因为在进行将老栈中的元素放到新栈中时，老栈的长度是变化着的
        if(newStack.size()==0) {
            for (int i = 0; i <length ; i++) {
                Integer t = stack.pop();
                newStack.push(t);
            }
        }
        System.out.println(newStack.pop());

    }
    private void peek(){


        if(newStack.size()==0) {
            int length=stack.size();
            for (int i = 0; i < length; i++) {
                Integer t = stack.pop();
                newStack.push(t);
            }
        }
        System.out.println(newStack.peek());

    }
    private int size(){
         return stack.size()+newStack.size();

    }

    public static void main(String[] args) {
        QueueByStack queue=new QueueByStack();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        queue.peek();

        queue.poll();
        queue.poll();
        System.out.println(queue.size());
        queue.peek();

        queue.poll();

    }
}
