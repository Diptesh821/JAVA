package DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DLL list=new DLL();
        list.insertFirst(5);
        list.insertFirst(2);
        list.insertFirst(4);
        list.insertFirst(7);
        list.display();
        list.displayR();
        list.insert(2,8);
        list.display();


    }

}
