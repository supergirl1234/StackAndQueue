package com;
import java.util.Stack;

/*
* 用两个栈实现一个队列
* */
public class QueueByStack {

    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();

    public void add(Integer num){
        stack1.push(num);

    }

    public Integer poll(){

        /*当第二个栈stack2是空时，将栈stack1中的元素全部出栈放到stack2中，此时最先进入到栈stack1中的元素就会被放到最顶端，就会在stack2中先出栈*/
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()) {

                stack2.push(stack1.pop());
            }

        }

        return stack2.pop();
    }

    public Integer size(){

        return stack1.size()+stack2.size();
    }

    public Integer peek(){

        /*栈stack2中的栈顶元素就是最先进入栈stack1中的元素*/
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()) {

                stack2.push(stack1.pop());
            }

        }
        return stack2.peek();
    }
    public static void main(String[] args) {

        QueueByStack queue=new QueueByStack();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("出队列："+queue.poll());
        System.out.println("出队列："+queue.poll());
        System.out.println("出队列："+queue.poll());


        queue.add(6);
        queue.add(7);
        System.out.println("队列长度"+queue.size());
        System.out.println("队列顶部元素："+queue.peek());

        System.out.println("出队列："+queue.poll());
        System.out.println("出队列："+queue.poll());
        System.out.println("出队列："+queue.poll());



    }
}
