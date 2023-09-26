class QueueMain{
    public static void main(String[] args) throws Exception{
        // CustomQueue queue = new CustomQueue(5);
        CircularQueue queue = new CircularQueue(5);


        queue.insert(1);
        queue.insert(2);
        queue.insert(5);
        queue.insert(8);
        queue.insert(12);

        queue.display();
        System.out.println(queue.remove());
        queue.display();
        queue.insert(1222);
        queue.display();
    }
}