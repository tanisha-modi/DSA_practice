class CircularQueue{
    protected int[] data;
        final static int DEFAULT_SIZE = 10;
     protected   int end = 0;
      protected  int front = 0;
      private int size = 0; 

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }   

    public boolean isFull(){
        return size == data.length;  
    }


    private boolean isEmpty(){
        return size == 0;
    } 

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end%data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue id empty");
        }
        return data[front];
    }

    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int i = front;
        do{ 
            System.out.print(data[i] + " ");
            i++;
            i = i % data.length;
        }while(i != end);
        System.out.println("End");
    }
}