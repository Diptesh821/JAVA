public class ReversekNodes {
    private ListNode head;
    private ListNode tail;
    private int size;

    public ReversekNodes() {
        this.size = 0;
    }

    private class ListNode {
        private int value;
        private ListNode next;

        public ListNode() {

        }

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        ListNode node = new ListNode(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertFirst(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public int nodesremaining(ListNode head){
        int c=0;
        while (head!=null){
            head=head.next;
            c+=1;
        }
        return c;
    }
    public ListNode reverseKGroup(int k){
       return reverseKGroup(head,k);
    }
    public ListNode reverseKGroup(ListNode head,int k){
        if (k<=1||head==null||head.next==null){
            return head;
        }
        ListNode current=head;
        ListNode prev=null;
        while (true){
            ListNode last=prev;
            ListNode newEnd=current;
            ListNode next=current.next;
            int remain=nodesremaining(newEnd);
            if (remain<k){
                break;
            }

            for (int i=0;i<k&&current!=null;i++){
                current.next=prev;
                prev=current;
                current=next;
                if (next!=null){
                    next=next.next;
                }
            }
            if (last!=null){
                last.next=prev;

            }
            else {
                head=prev;
            }
            newEnd.next=current;
            if (current==null){
                break;
            }
            prev=newEnd;

        }
        return head;
    }
    public ListNode reverseAlternateKGroup(int k){
        return reverseAlternateKGroup(head,k);
    }
    public ListNode reverseAlternateKGroup(ListNode head,int k){
        if (k<=1||head==null||head.next==null){
            return head;
        }
        ListNode current=head;
        ListNode prev=null;
        while (current!=null){
            ListNode last=prev;
            ListNode newEnd=current;
            ListNode next=current.next;
            int remain=nodesremaining(newEnd);
            if (remain<k){
                break;
            }

            for (int i=0;i<k&&current!=null;i++){
                current.next=prev;
                prev=current;
                current=next;
                if (next!=null){
                    next=next.next;
                }
            }
            if (last!=null){
                last.next=prev;

            }
            else {
                head=prev;
            }
            newEnd.next=current;
            for (int i=0;i<k&&current!=null;i++){
                prev=current;
                current=current.next;
            }


        }
        return head;
    }


    public static void main(String[] args) {
        //reverseKGroup
        ReversekNodes list=new ReversekNodes();
        for (int i=1;i<8;i++){
            list.insertLast(i);
        }
        list.display();
       ListNode n= list.reverseKGroup( 2);
        //this reverseKGroup method is  modifying the original linked list(list). But if we print(display) list(linked list) then the output will not be the  linked list(list) that we want.
        list.display();
        System.out.println(n.value);
        while (n!=null){
            System.out.print(n.value+"->");
            n=n.next;
        }
        System.out.println("END");





        //reverseAlternateKGroup
//        ReversekNodes list=new ReversekNodes();
//        for (int i=1;i<=10;i++){
//            list.insertLast(i);
//        }
//        list.display();
//        ListNode n= list.reverseAlternateKGroup( 3);
//        //this reverseAlternateKGroup method is  modifying the original linked list(list). But if we print(display) list(linked list) then the output will not be the  linked list(list) that we want.
//        list.display();
//        System.out.println(n.value);
//        while (n!=null){
//            System.out.print(n.value+"->");
//            n=n.next;
//        }
//        System.out.println("END");


    }




    }

