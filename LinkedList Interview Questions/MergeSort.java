public class MergeSort {
    private ListNode head;
    private ListNode tail;
    private int size;

    public MergeSort() {
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
public ListNode getMid(ListNode head){
        ListNode midprev=null;
        while (head!=null&&head.next!=null){
            midprev=(midprev==null)?head:midprev.next;
            head=head.next.next;
        }
        ListNode mid=midprev.next;
        midprev.next=null;
        return mid;
}

    public  ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
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
    public ListNode sortList(){
        return sortList(head);
    }

        public  ListNode sortList(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        ListNode mid=getMid(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return mergeTwoLists(left,right);
    }

    public static void main(String[] args) {

        MergeSort list=new MergeSort();
        for (int i=10;i>0;i--){
            list.insertLast(i);
        }
        list.display();
        //this sortList method is  modifying the original linked list(list). But if we print(display) list(linked list) then the output will not be the list(linked list) that we want.
        ListNode node=list.sortList();
        list.display();
        while (node!=null){
            System.out.print(node.value+"->");
            node=node.next;
        }

        System.out.println("END");
    }
}
