package com;

import java.util.Stack;

/**
 * Author:Fanleilei
 * Created:2019/4/18 0018
 *
 * 用栈实现队列
 */
public class QueueByStack{

    private Stack<Integer> stack=new Stack<>();
    private Stack<Integer> resultant =new Stack<>();

    public void  add(int v){
        stack.push(v);
    }

    public Integer poll(){

        int length=stack.size();
        if(resultant.size()==0) {

            for (int i = 0; i <length ; i++) {

                Integer result = stack.pop();
                resultant.push(result);
            }
        }


            return resultant.pop();


    }



    public static void main(String[] args) {

        QueueByStack queque=new QueueByStack();

        queque.add(3);
        queque.add(1);
        queque.add(2);
        queque.add(4);




       System.out.println(queque.poll());
       System.out.println(queque.poll());
       System.out.println(queque.poll());
        queque.add(6);
        queque.add(7);
        queque.add(8);
       System.out.println(queque.poll());
       System.out.println(queque.poll());
       System.out.println(queque.poll());
       System.out.println(queque.poll());

    }
}
