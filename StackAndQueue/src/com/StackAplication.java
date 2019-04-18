package com;

/**
 * Author:Fanleilei
 * Created:2019/4/16 0016
 */
public class StackAplication {

    private int[] array;
    int top;

    public StackAplication() {
        this.array =new int[100];
        this.top=0;
    }

    /**
     * 向栈中插入一个数据
     * @param v
     */
    public void push(int v){
        this.array[this.top]=v;
        this.top++;
    }

    /**
     *
     * 从栈中取出一个元素
     * @return 栈顶元素
     */
    public int pop(){

        return this.array[--this.top];
    }

    /**
     *
     * 查看栈顶元素
     * @return  栈顶元素
     */
    public int peek(){
        return this.array[this.top-1];

    }

    /**
     *
     * 获取栈中元素的个数
     * @return 元素个数
     */
    public int size(){
        return this.top;

    }

    /**
     * 判断栈是否为空
     * @return true/false
     */

    public boolean isEmpty(){

        return this.top==0;
    }


    public static void main(String[] args) {
        StackAplication myStack=new StackAplication();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.size());
        System.out.println(myStack.peek());
        System.out.println();
    }
}
