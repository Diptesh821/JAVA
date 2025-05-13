//https://leetcode.com/problems/merge-two-sorted-lists/description/
public class LL {
    private Node head;
    private Node tail;
    private int size;


    public LL() {
        this.size = 0;
    }

    private static class Node {
        private int value;
        private Node next;
        public Node(){

        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
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
    public static LL merged(LL first,LL second){
        Node head1= first.head;
        Node head2=second.head;
        LL ans=new LL();
        while (head1!=null&&head2!=null){
            if (head1.value<=head2.value){
                ans.insertLast(head1.value);
                head1=head1.next;

            }
            else {
                ans.insertLast(head2.value);
                head2=head2.next;
            }

        }
        while (head2!=null){
            ans.insertLast(head2.value);
            head2=head2.next;

        }
        while (head1!=null){
            ans.insertLast(head1.value);
            head1=head1.next;

        }
        return ans;

    }

//leetcode
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode dummyHead = new ListNode();
//        ListNode tail = dummyHead;
//        while (list1 != null && list2 != null) {
//            if (list1.val < list2.val) {
//                tail.next = list1;
//                list1 = list1.next;
//                tail = tail.next;
//            } else {
//                tail.next = list2;
//                list2 = list2.next;
//                tail = tail.next;
//            }
//        }
//        while (list1!=null){
//            tail.next=list1;
//            list1=list1.next;
//            tail=tail.next;
//        }
//        while (list2!=null){
//            tail.next=list2;
//            list2=list2.next;
//            tail=tail.next;
//        }
//        return dummyHead.next;
//    }

    public static Node mergeTwoLists(Node list1, Node list2) {
        Node dummyHead = new Node();
        Node tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        while (list1!=null){
            tail.next=list1;
            list1=list1.next;
            tail=tail.next;
        }
        while (list2!=null){
            tail.next=list2;
            list2=list2.next;
            tail=tail.next;
        }
        tail.next=null;
        return dummyHead.next;
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
        //merged function
        LL first=new LL();
        LL second=new LL();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);
        first.display();
        second.display();
        LL ans=merged(first,second);
        ans.display();






        //mergeTwoLists function
        LL first1=new LL();
        LL second1=new LL();
        first1.insertLast(1);
        first1.insertLast(3);
        first1.insertLast(5);
        second1.insertLast(1);
        second1.insertLast(2);
        second1.insertLast(9);
        second1.insertLast(14);
        Node node=mergeTwoLists(first1.head,second1.head);
        while (node!=null){
            System.out.print(node.value+"->");
            node=node.next;
        }
        System.out.println("END");



    }
}
