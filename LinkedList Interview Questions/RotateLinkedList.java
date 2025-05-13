import java.util.List;



 public class RotateLinkedList {
     private ListNode head;
     private ListNode tail;
     private int size;
     class ListNode {
         int val;
         ListNode next;

         public ListNode() {

         }

         public ListNode(int val) {
             this.val = val;
         }

         public ListNode(int val, ListNode next) {
             this.val = val;
             this.next = next;
         }
     }

     public RotateLinkedList() {
         this.size = 0;
     }

    public int size(ListNode head){
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
    public ListNode rotateRight1(int k){
         return rotateRight1(head,k);

    }
    public ListNode rotateRight1(ListNode head, int k) {

        int s=size(head);

        if (head==null||(k%s)<1||head.next==null){
            return head;
        }

        for (int i=0;i<k%s;i++){
            ListNode p=head;
            ListNode t=head;
            while (p.next!=null){
                t=p;
                p=p.next;
            }
            p.next=head;
            t.next=null;
            head=p;

        }
        return head;

}
     public ListNode rotateRight(int k){
         return rotateRight(head,k);

     }
    public ListNode rotateRight(ListNode head, int k) {

        int s=size(head);

        if (head==null||(k%s)<1||head.next==null){
            return head;
        }


            ListNode p=head;
            while (p.next!=null){
                p=p.next;
            }
            p.next=head;
            ListNode newLast=head;
            for (int i=1;i<s-(k%s);i++){
                newLast=newLast.next;
            }
            head=newLast.next;
            newLast.next=null;


        return head;

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
             System.out.print(temp.val + " -> ");
             temp = temp.next;
         }
         System.out.println("END");
     }

    public static void main(String[] args) {
         //rotateRight1 function
//        RotateLinkedList r=new RotateLinkedList();
//        for (int i=0;i<8;i++){
//            r.insertLast(i+1);
//        }
//        r.display();
//        //this rotateRight1 method is  modifying the original linked list(r). But if we print(display) linked list(r) then the output will not be the  linked list(r) that we want.
//        ListNode node=r.rotateRight1(3);
//        r.display();
//        while (node!=null){
//            System.out.print(node.val+"->");
//            node=node.next;
//        }
//        System.out.println("END");





//rotateRight function
        RotateLinkedList r=new RotateLinkedList();
        for (int i=0;i<8;i++){
            r.insertLast(i+1);
        }
        r.display();
        //this rotateRight method is  modifying the original linked list(r). But if we print(display) linked list(r) then the output will not be the  linked list(r) that we want.
        ListNode node=r.rotateRight(3);
        r.display();
        while (node!=null){
            System.out.print(node.val+"->");
            node=node.next;
        }
        System.out.println("END");
    }
}
