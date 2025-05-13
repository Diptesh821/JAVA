package CircularLinkedlist;

public class Main {
    public static void main(String[] args) {
        CLL list=new CLL();
        list.insertLast(5);
        list.insertLast(4);
        list.insertLast(9);
        list.insertLast(1);
        list.display();
        list.delete(9);
        list.display();
        list.delete(1);
        list.display();
        list.delete(5);
        list.display();
        list.delete(4);
        list.display();
    }
}
