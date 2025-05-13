public class customStack {
    protected int[] data;
    private static final int defaultsize=10;
    public customStack(int size){
        this.data=new int[size];
    }
    int ptr=-1;
    public customStack(){
        this(defaultsize);
    }
    public boolean push(int item){
        if (isFull()){
            System.out.println("can not push!");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public boolean isFull(){
        return ptr== data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
    public int pop() throws StackException{
        if (isEmpty()){
            throw new StackException("can not pop from empty stack");
        }
        return data[ptr--];
    }
    public int peek() throws StackException{
        if (isEmpty()){
            throw new StackException("can not peek from empty stack");
        }
        return data[ptr];
        }
    }


