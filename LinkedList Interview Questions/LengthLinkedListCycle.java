public class LengthLinkedListCycle {
    private ListNode head;
    private ListNode tail;
    private int size;

    public LengthLinkedListCycle() {
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

    public static void main(String[] args) {
        LengthLinkedListCycle list=new LengthLinkedListCycle();
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
    }
}
