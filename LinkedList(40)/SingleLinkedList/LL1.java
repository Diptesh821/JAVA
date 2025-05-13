package SingleLinkedList;

//only using head
public class LL1 {
    private Node head;
    private Node tail;
    private int size;
    public LL1(){
        this.size=0;
    }

    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;

        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        if (head==null) {
            head=node;
            head.next=null;
            size+=1;
        }
        else{
            node.next=head;
            head=node;
            size+=1;
        }


    }
    public void display(){
        Node s=head;
        while(s!=null){
            System.out.print(s.value+"->");
            s=s.next;
        }
        System.out.println("END");
    }

}
