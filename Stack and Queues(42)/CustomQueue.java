public class CustomQueue {
    private int[] data;
    private static final int defaultsize=10;
    private int end=0;
    public CustomQueue(int size){
        data=new int[size];
    }
    public CustomQueue(){
        this(defaultsize);
    }
    public boolean isFull(){
        return end==data.length;
    }

    public boolean isEmpty(){
        return end==0;

    }
    public boolean insert(int item){
        if (isFull()){
            System.out.println("can not insert");
            return false;
        }
        data[end]=item;
        end++;
        return true;
    }
    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed=data[0];
        for (int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;

    }
    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];

    }
    public void display(){
        for (int i=0;i<end;i++){
            System.out.print(data[i]+"<-");
        }
        System.out.println("END");
    }

}
