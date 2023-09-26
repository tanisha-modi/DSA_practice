class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }
    // @override
    public boolean insert(int item){

        // this cares care of it being full 
        if(this.isFull()){

            // double the array size
            int[] temp = new int[2 * data.length];

            // copy all previous items in new data
            // for(int i = 0; i < data.length; i++){
            //     temp[i] = data[i];
            // }
            System.arraycopy(data, (front + i ) % data.length, temp, 0, data.length);
            data = temp;
        }
        front = 0;
        end = data.length;
         
        // at this point we know that array is not full
        // insert item
        return super.insert(item);

    }
}