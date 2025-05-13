//Q13
public class Palindrome {
    private ListNode head;
    private ListNode tail;
    private int size;

    public Palindrome() {
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
    public ListNode middleNode(){
        return middleNode(head);

    }
    public ListNode middleNode(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;

    }
    public ListNode reverseInPlace1(ListNode head){
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
    public boolean isPalindrome(){
        return isPalindrome(head);
    }
    private boolean isPalindrome(ListNode head){
        ListNode mid=middleNode(head);
        ListNode headSecond=reverseInPlace1(mid);
        ListNode rereverseHead=headSecond;
        //comparebothvalues
        while (head!=null&&headSecond!=null) {
            if (head.value != headSecond.value) {
                break;

            }
            headSecond = headSecond.next;
            head = head.next;
        }
            reverseInPlace1(rereverseHead);

            if (head==null||headSecond==null){
                return true;
            }
            return false;
        }

    public static void main(String[] args) {
        Palindrome list=new Palindrome();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        list.display();
        System.out.println(list.isPalindrome());

    }

}
