package CircularLinkedlist;

import SingleLinkedList.LL;

public class CLL {
    private Node head;
    private Node tail;
    private int size;
    public CLL(){
        this.head=null;
        this.tail=null;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;

        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void insertLast(int val){
        Node node=new Node(val);
        if (head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void display(){

        Node node=head;
        if (head==null){
            System.out.println("NULL");
            return;
        }
        do{
            System.out.print(node.value+"->");
            node=node.next;

        }
        while (node!=head);
        System.out.println("HEAD");
    }
    public void delete(int val){
        if (head==null){
            return;
        }
        Node node=head;
        if (node.next==head){
            head=null;
            tail=null;
            return;
        }
        if (node.next==tail){
            head=head.next;
            head.next=head;
        }
        if (node.value==val){
            head=head.next;
            tail.next=head;
            return;
        }


        do{
            if (tail==node.next){
                tail=node;
            }
            if (node.next.value==val){
                node.next=node.next.next;
                break;

            }

            node=node.next;
        }
        while (node!=head);


    }
}
