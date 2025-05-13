

public class reverse {
    private ListNode head;
    private ListNode tail;
    private int size;

    public reverse() {
        this.size = 0;
    }

    private  class ListNode {
        private int value;
        private ListNode next;
        public ListNode(){

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
    //Q10

    public void reverse(){
        reverse(head);
    }
    private void reverse(ListNode node){
        if (node==tail){
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;

    }


    //Q11
    public void reverseInPlace(){

        if (size<2){
            return;
        }
        ListNode prev=null;
        ListNode pres=head;
        ListNode next=pres.next;
        while (pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if (next!=null) {
                next = next.next;
            }
        }
        head=prev;

    }
    //Q11 - leetcode
    public ListNode reverseInPlaceLeetcode(){
        return reverseInPlaceLeetcode(head);
    }
    public ListNode reverseInPlaceLeetcode(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode pres=head;
        ListNode next=pres.next;
        while (pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if (next!=null) {
                next = next.next;
            }
        }
        return prev;

    }
    //Q12
    public void reverseBetween(int left,int right){
        reverseBetween(head,left,right);
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left==right){
            return head;
        }
        ListNode prev=null;
        ListNode pres=head;
        for (int i=0;(i<left-1)&&(pres!=null);i++){
            prev=pres;
            pres=pres.next;
        }
        ListNode last=prev;
        ListNode newEnd=pres;
        ListNode next=pres.next;
        for (int i=0;(i<right-left+1)&&(pres!=null);i++){
            pres.next=prev;
            prev=pres;
            pres=next;
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
        newEnd.next=pres;
        return head;
    }

    public static void main(String[] args) {
        //Q10
//        reverse list=new reverse();
//        for (int i=0;i<6;i++){
//            list.insertLast(i+1);
//        }
//        list.display();
//        list.reverse();
//        list.display();





        //Q11
//        reverse list1=new reverse();
//        for (int i=0;i<6;i++){
//            list1.insertLast(i+1);
//        }
//        list1.display();
//        list1.reverseInPlace();
//        list1.display();





        reverse list3=new reverse();
        for (int i=0;i<6;i++){
            list3.insertLast(i+1);
        }
        list3.display();
        //this reverseInPlaceLeetcode method is  modifying the original linked list(list3). But if we print(display) list3(linked list) then the output will not be the reverse of the original linked list(list3)
        ListNode node=list3.reverseInPlaceLeetcode();
        list3.display();
        while (node!=null){
            System.out.print(node.value+"->");
            node=node.next;
        }
        System.out.println("END");



        //Q12
//        reverse list2=new reverse();
//        for (int i=0;i<5;i++){
//            list2.insertLast(i+1);
//        }
//        list2.display();
//        list2.reverseBetween(2,4);
//        list2.display();

    }

}
