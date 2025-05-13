package SingleLinkedList;


public class Main {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(5);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(7);
        list.insertFirst(8);
        list.display();
        list.insertLast(10);
        list.insertLast(20);
        list.display();
        list.insert(3,3);
        list.display();
//        list.insert(12,8);
//        list.display();
//        list.insert(9,0);
//        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
//        SingleLinkedList.LL list2=new SingleLinkedList.LL();
//        list2.insertFirst(2);
//        list2.insertFirst(3);
//        list2.deleteLast();
//        list2.display();
        list.delete(4);
        list.display();
        list.delete(2);
        list.display();
    }
}
