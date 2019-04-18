package com;

import org.omg.CORBA.NO_IMPLEMENT;

/**
 * Author:Fanleilei
 * Created:2019/4/16 0016
 */
public class QueueApplication {


    private Node head;
    private Node last;

    public QueueApplication() {

        this.head=this.last=null;
    }

    /**
     * 插入元素到队尾
     * @param v
     */
    public  void push(int v){

        Node node=new Node(v);

        if(this.head==null){

            this.head=node;
            this.last=node;
        }else{

            this.last.next=node;
            this.last=node;
        }



    }

    /**
     * 出队列
     * @return 队首元素
     */
    public int pop(){
        int v=this.head.vaule;

        this.head=this.head.next;
        if(this.head==null){

           this.last=null;

        }

        return v;
    }

    /**
     * 队列长度
     * @return 队列长度
     */
    public int size(){


        Node cur=this.head;
        int count=0;
        while (cur!=last){
            count++;
            cur=cur.next;

        }
        return count+1;
    }

    /**
     *
     * 返回队首元素,但不出列
     * @return 队首元素
     */
    public int front(){
        return  this.head.vaule;

    }

    /**
     *
     * 返回队尾元素
     * @return 队尾元素
     */
    public int last(){
        return  this.last.vaule;

    }

    /**
     *
     * 判断队列是否为空
     * @return true/false
     */

    public boolean isEmpty(){

        return this.head==null;
    }

    public static void main(String[] args) {

       QueueApplication myQueue=new QueueApplication();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        myQueue.push(7);

        System.out.println(myQueue.front());
        System.out.println(myQueue.last());
        System.out.println(myQueue.size());


    }
}
class Node{

    int vaule;
    Node next;

    public Node(int vaule) {
        this.vaule = vaule;
    }
}