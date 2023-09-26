class StackMain{
    public static void main(String[] args) throws StackException{
        // CustomStack stack = new CustomStack(5);
        // DynamicStack stack = new DynamicStack(5);
        CustomStack stack = new DynamicStack(5);

        stack.push(34);
        stack.push(4);
        stack.push(10);
        stack.push(3);
        stack.push(3);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}