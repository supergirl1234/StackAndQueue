package com;

/**
 * Author:Fanleilei
 * Created:2019/5/3 0003
 *
 * 自定义一个栈并进行栈的一系列操作
 * 压栈、出栈、查看栈顶元素、栈的长度、判断这个栈是否为空栈
 */
public class MyStack {
     //栈的实现用数组更为优一些
    private int[] array;//存放元素的数组
    private int top;//栈顶指针，指向下一个要插入数据的位置

    public MyStack() {
        this.array = new int[100];
        this.top = 0;
    }

    //压栈
    private  void push(int item){

       this.array[this.top]=item;
       this.top++;
    }

    //出栈
    private int pop(){

        this.top--;
        return this.array[this.top];
    }
    //查看栈顶元素
    private int peek(){

        return this.array[this.top-1];
    }
    //查看栈的长度
    private int size(){

        return this.top;
    }
    //判断栈是否为空
    private boolean isEmpty(){

        return this.top==0;
    }
    public static void main(String[] args) {

        MyStack stack=new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());


    }
}
