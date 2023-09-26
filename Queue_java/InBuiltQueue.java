import java.util.*;
class InBuiltQueue{
    public static void main(String[] args){
        Queue<Integer> queue =  new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.remove());
        System.out.println(queue.remove());


        Deque<Integer> deque = new ArrayDeque();
        deque.add(8);
        deque.add(6);
        deque.add(9);
        deque.addLast(12);

        System.out.println(deque.remove());
        System.out.println(deque.remove());
        System.out.println(deque.removeLast());
        System.out.println(deque.remove());

    }
}