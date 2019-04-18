package com;

/**
 * Author:Fanleilei
 * Created:2019/4/16 0016
 */
public class MyLinkedList {


    private Node2 head;
    private Node2 last;


    /**
     *
     * 头插
     * @param node 插入的结点
     */
    public void addFirst(Node2 node){

        if(this.head==null){
            this.head=this.last=node;

        }else{

            node.next=this.head;
            this.head=node;
            this.head.next.pre=node;
        }


    }

    /**
     * 头删
     */
    public void removeFirst(){

        this.head=this.head.next;
        if(this.head==null){

            this.last=null;
        }
    }

    /**
     *  尾插
     * @param node 插入的结点
     */
    public void addLast(Node2 node){


        node.next=null;
        if(this.head==null){
            this.head=node;
            this.last=node;
        }else {
            node.pre = this.last;
            this.last.next = node;
            this.last = node;
        }

    }

    /**
     * 尾删
     */

    public void removeLast(){

      if(this.head.next== null){

          this.head=this.last=null;
      }else {
          this.last.pre.next = null;
      }


    }

    public  void disply(){

        Node2 cur=this.head;

        while(cur!=null){
            System.out.println(cur.value+" ");
            cur=cur.next;

        }
    }


    public static void main(String[] args) {

       MyLinkedList my=new MyLinkedList();
       my.addFirst(new Node2(1));
       my.addFirst(new Node2(2));
       my.addFirst(new Node2(2));
       my.disply();
       my.addLast(new Node2(4));

       System.out.println("-----------");
       //my.removeLast();
        my.removeFirst();
        my.disply();

    }
}

class Node2{
    int value;
    Node2 next;
    Node2 pre;

    public Node2(int value) {
        this.value = value;
    }
}
