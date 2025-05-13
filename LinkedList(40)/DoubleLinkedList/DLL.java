package DoubleLinkedList;

public class DLL {
    private class Node{
        private int value;
        private Node next;
        private Node prev;
        public Node(int value,Node next,Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;

        }
        public Node(int value){
            this.value=value;
        }

    }
    private Node head;

    public void insertFirst(int val){

            Node node=new Node(val);
            node.next=head;
            if (head!=null) {
                head.prev = node;
            }
            head=node;
    }
    public void display(){
        Node node=head;
        while (node!=null){
            System.out.print(node.value+"->");
            node=node.next;
        }
        System.out.println("END");
    }
    public void displayR(){
        Node node=head;
        Node last=null;
        while (node!=null){
            last=node;
            node=node.next;
        }

        while(last!=null){

            System.out.print(last.value+"->");
            last=last.prev;
        }

        System.out.println("START");
    }
    public void insert(int after,int val){
        Node p=find(after);
        if (p==null){
            System.out.println("does not exist");
        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        if (node.next!=null) {
            node.next.prev = node;
        }
        node.prev=p;


    }
    public Node find(int value){
        Node node=head;
        while (node!=null) {
            if (node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
}
