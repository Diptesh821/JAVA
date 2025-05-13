package SingleLinkedList;

//using both head and tail
public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }

    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;

        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
            if (tail==null){
                tail=head;
            }
            size+=1;



    }
    public void display(){
        Node s=head;
        while(s!=null){
            System.out.print(s.value+"->");
            s=s.next;
        }
        System.out.println("END");
    }
    public void insertLast(int val){
        if (head==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size+=1;

    }
    public void insert(int val,int index){
        if (index==0){
            insertFirst(val);
            return;
        }
        if (index==size){
            insertLast(val);
            return;
        }

        Node temp=head;
        for (int i=0;i<index-1;i++){
            temp=temp.next;

        }
//        Node node=new Node(val,temp.next);
        Node node=new Node(val);
        node.next=temp.next;
        temp.next=node;
        size+=1;

    }

    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if (head==null){
            tail=null;
        }
        size-=1;
        return val;
    }
//    public int deleteLast(){
//        int val=tail.value;
//       if (size<=1){
//           return deleteFirst();
//       }
//        Node s=head;
//        for (int i=0;i<size-2;i++){
//            s=s.next;
//        }
//        s.next=null;
//        tail=s;
//        return val;
//    }
    public Node get(int index){
        Node node =head;
        for (int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public int deleteLast(){

        if (size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val=tail.value;
        secondLast.next=null;
        tail=secondLast;
        return val;
    }
    public int delete(int index){
        if (index==0){
            return deleteFirst();
        }
        if (index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;

        return val;
    }
    public Node find(int value){
        Node node=head;
        while (node!=null){
            if (node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
}
