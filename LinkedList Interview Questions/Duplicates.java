public class Duplicates {
    private Node head;
    private Node tail;
    private int size;

    public Duplicates() {
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
    public void duplicates(){
        if (head.next==null){
            System.out.println("only one node present so no duplicates ");
        }
        Node temp=head;
        Node k=head;
        while(temp.next!=null){
            if (temp.value==temp.next.value){
                temp.next=temp.next.next;
                size--;
            }
            else{
                temp=temp.next;

            }

        }
        tail=temp;
        tail.next=null;



    }
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
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
        Duplicates d=new Duplicates();

        d.insertLast(1);
        d.insertLast(1);
        d.insertLast(1);
        d.insertLast(2);
        d.insertLast(4);
        d.insertLast(4);
        d.display();
        d.duplicates();
        d.display();
    }
}
