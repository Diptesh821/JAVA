public class DetectCycle {
    private ListNode head;
    private ListNode tail;
    private int size;

    public DetectCycle() {
        this.size = 0;
    }

    private class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }
    //this method is used to convert a normal linked list to a linked list with cycle.
    public void cycle(int value){
        ListNode node=find(value);
        tail.next=node;

    }
    public ListNode find(int value){
        ListNode node=head;
        while (node!=null){
            if (node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public int lengthCycle(){
        return lengthCycle(head);
    }

    public int lengthCycle(ListNode head){
        ListNode f=head;
        ListNode s=head;
        int length=0;
        while(f!=null&&f.next!=null){
            f=f.next.next;
            s=s.next;
            if (f==s){
                do{
                    s=s.next;
                    length+=1;
                }
                while (s!=f);
                return length;

            }

        }
        return 0;
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
    public ListNode detectCycle() {

        return detectCycle(head);
    }
    public ListNode detectCycle(ListNode head){
        if (head==null){
            return head;
        }
        ListNode first=head;
        ListNode second=head;
        int length=lengthCycle();
        if (length==0){
         return null;
        }
        for(int i=0;i<length;i++){
            second= second.next;
        }
        while (first!=second){
            first=first.next;
            second=second.next;
        }
        return first;



    }



    public static void main(String[] args) {
        DetectCycle list=new DetectCycle();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
        list.insertLast(8);
        list.display();
        list.cycle(4);
        System.out.println( list.lengthCycle());
        ListNode node= list.detectCycle();
        System.out.println(node.value);

    }

}
