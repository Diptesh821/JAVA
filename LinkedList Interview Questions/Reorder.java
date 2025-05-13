public class Reorder {
    private ListNode head;
    private ListNode tail;
    private int size;

    public Reorder() {
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

    public ListNode middleNode() {
        return middleNode(head);

    }

    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }

    public ListNode reverseInPlace1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;
        while (pres != null) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;

    }

    public void reorderList() {
        reorderList(head);
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode mid = middleNode(head);
        ListNode hs = reverseInPlace1(mid);
        ListNode hf = head;
        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        //next of tail to null
        if (hf != null) {
            hf.next = null;
        }

    }

    public static void main(String[] args) {

        Reorder list = new Reorder();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
        list.display();
        list.reorderList();
        list.display();
    }
}
