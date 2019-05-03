package com;

/**
 * Author:Fanleilei
 * Created:2019/5/3 0003
 * 自定义实现一个队列
 *
 */
public class MyQueue {

    //队列的实现用链表更优一些
    class Node{

        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private  Node head;
    private  Node last;

    public MyQueue() {
        this.head = null;
        this.last = null;
    }

    //判断队列是否为空
    private boolean isEmpty(){
        return this.head==null;


    }


    //返回队首元素，但不出列
    private int peek(){

        if(this.head!=null) {
           return this.head.value;
        }

        //栈中无元素了
       return  -1;
    }

    //进队列

    private void add(int item){
        //尾插
        Node node=new Node(item);
        node.next=null;
        if(this.head==null){

            this.head=this.last=node;

        }else{

            this.last.next=node;
            this.last=node;
        }


    }
    //出队列
    private int poll(){
        int v;
        if(this.head!=null) {
             v = this.head.value;

             this.head=this.head.next;


        //如果队列元素出完了
            if(this.head==null){
                this.last=null;

             }
            return v;
        }
        //栈中无元素了
        return  -1;



    }

    //返回元素个数

    private int size(){

        Node cur=this.head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;

        }

        return count;

    }
    public static void main(String[] args) {

        MyQueue queue=new MyQueue();
        queue.add(1);
        queue.add(3);


        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());

        System.out.println("出栈："+queue.poll());

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());

        System.out.println("出栈："+queue.poll());

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());

        System.out.println("出栈："+queue.poll());
    }
}
