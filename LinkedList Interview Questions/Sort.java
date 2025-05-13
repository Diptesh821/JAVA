//https://leetcode.com/problems/sort-list/description/
public class Sort {
   private ListNode head;
    private ListNode tail;
    private int size;

    public Sort() {
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

    public ListNode get(int index){
        ListNode node =head;
        for (int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public void bubbleSort(){
        bubbleSort(size-1,0);
    }
    private void bubbleSort(int row,int col){
        if (row==0){
            return;
        }
        if (col<row){
            ListNode first=get(col);
            ListNode second=get(col+1);
            if (first.value>second.value){
                //swap
                if (first==head){
                    head=second;
                    first.next=second.next;
                    second.next=first;
                }
                else if (second==tail) {
                    ListNode prev=get(col-1);
                    prev.next=second;
                    first.next=null;
                    second.next=first;
                    tail=first;

                }
                else {
                    ListNode prev=get(col-1);
                    prev.next=second;
                    first.next=second.next;
                    second.next=first;

                }
            }
            bubbleSort(row,col+1);


        }
        else {
            bubbleSort(row-1,0);
        }
    }

    public static void main(String[] args) {
        Sort first1=new Sort();
        first1.insertLast(1);
        first1.insertLast(3);
        first1.insertLast(5);
        first1.insertLast(1);
        first1.insertLast(2);
        first1.insertLast(9);
        first1.insertLast(14);
        first1.display();
        System.out.println(first1.size);
        first1.bubbleSort();
        first1.display();






    }



}
