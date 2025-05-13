public class CircularQueue {
    protected int data[];
    private static final int defaultsize=10;
    private int size=0;
    protected int front=0;
    protected int end=0;
    public CircularQueue(int size){
        this.data=new int[size];
    }
    public CircularQueue(){
       this(defaultsize);
    }
    public boolean isFull(){
        return size==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean insert(int item){
        if (isFull()){

            System.out.println("Queue is full");
            return false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;


    }
    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed=data[front];
        front++;
        front=front%data.length;
        size--;
        return removed;
    }
    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed=data[front];
        return removed;

    }
    public void display(){
        if (isEmpty()){
            System.out.println("empty");
            return;
        }
        int i=front;
        do{
            System.out.print(data[i]+"->");
            i++;
            i=i%data.length;

        }
        while (i!=end);
        System.out.println("END");

    }

    public static void main(String[] args) throws Exception {
        CircularQueue queue=new CircularQueue(5);
        queue.insert(6);
        queue.insert(1);
        queue.insert(4);
        queue.insert(7);
        queue.insert(9);
        queue.insert(10);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
        System.out.println(queue.front());
        System.out.println(queue.remove());
        queue.display();
        System.out.println(queue.remove());
    }
}
