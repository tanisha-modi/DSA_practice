class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }
    // @override
    public boolean push(int item){

        // this cares care of it being full 
        if(this.isFull()){

            // double the array size
            int[] temp = new int[2 * data.length];

            // copy all previous items in new data
            // for(int i = 0; i < data.length; i++){
            //     temp[i] = data[i];
            // }
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }
        
        // at this point we know that array is not full
        // insert item
        return super.push(item);

    }
}