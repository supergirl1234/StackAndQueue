package com;

/**
 * Author:Fanleilei
 * Created:2019/4/18 0018
 */
public class MyLinkedList2 {

    class  Node{
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    //链表的第一个结点
    Node head;
    public  void addFirst(int v){
        Node node=new Node(v);
        node.next=this.head;
        this.head=node;

    }
    public void addLast(int v){

        Node node=new Node(v);
        node.next=null;
        if(this.head==null){
            this.head=node;

        }else{

            Node last=this.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=node;
        }
    }
    public  boolean addIndex(int index,int v){

        Node node=new Node(v);
        if(index==0){
            node.next=this.head;
            this.head=node;
        }else {
            Node cur = this.head;
            for (int i = 0; (cur != null) && i < index - 1; i++) {
                cur = cur.next;

            }
            if (cur == null) {
                return false;
            }

            node.next = cur.next;
            cur.next = node;

        }

        return  true;

    }


    public boolean contain(int v){
        for( Node cur=this.head;cur!=null;cur=cur.next){
            if(cur.value==v){
                return  true;
            }
        }
        return  false;
    }

    public void remove(int v){
        if(this.head==null){

        }else if(this.head.value==v){
            this.head=this.head.next;
        }else{

            Node pre=this.head;
            if(pre.next!=null){
                while(pre.next.value==v){
                    pre.next=pre.next.next;

                }
            }

        }

    }

    public void disply(){

        Node cur=this.head;
        while(cur!=null){

            System.out.print(cur.value+" ");
            cur=cur.next;
        }
    }

    public static void main(String[] args) {

        MyLinkedList2 example=new MyLinkedList2();

        example.addFirst(1);
        example.disply();
        System.out.println();
        example.addFirst(2);
        example.disply();
        System.out.println();
        example.addFirst(3);
        example.disply();
        System.out.println();

        example.addIndex(2,4);
        example.disply();
        System.out.println();

        example.remove(2);
        example.disply();
    }


}
