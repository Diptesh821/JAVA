public class InsertRecursion {
    private Node head;
    private Node tail;
    private int size;

    public InsertRecursion() {
        this.size = 0;
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
    //head node will be returned from the below function
    private Node insertRec(int val,int index,Node node){
        if (index==0){
            Node temp=head;
            Node n=new Node(val);
            n.next=temp;
            size++;
            return n;

        }
        Node k=insertRec(val,index-1,node.next);
        node.next=k;
        return node;

    }
    public void insertRec(int val,int index){
        head=insertRec(val,index,head);
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        InsertRecursion list=new InsertRecursion();
        list.insertRec(1,0);
        list.display();
    }

}

