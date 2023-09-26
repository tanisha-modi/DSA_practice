class CustomStack{
        protected int[] data;
        final static int DEFAULT_SIZE = 10;
        int ptr = -1;
    // public static void main(String[] args){
    // }
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an Empty Stack");
            // System.out.println("Stack is empty");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an Empty Stack");
        }
        return data[ptr];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }


    public boolean isFull(){
        return ptr == data.length - 1; // ptr is last index
    }


    private boolean isEmpty(){
        return ptr == -1;
    }
}