import java.util.*;
class InBuiltStack{
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(4);
        stack.push(10);
        stack.push(3);
        stack.push(90);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());


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
        System.out.println(deque.remove());
    }
}