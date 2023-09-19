class CLL{

    private Node head;
    private Node tail;

    CLL(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);

        if(head == null){
            head = node; 
            node.next = head;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val){
        
        if(head == null){
            return;
        }
        if(head.value == val){
            head = head.next;
            tail.next = head;
            return;
        }

        Node temp = head;
        Node preNode = head;
        do{
            if(temp.value == val){
            preNode.next = temp.next;
            return;
            }
            preNode = temp;
            temp = temp.next;
        }while(temp != head );
        System.out.println("does not exist");
    }

    public void display(){
       Node temp = head;
       if(head != null){
        do{
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }while(temp != head );
        System.out.println("HEAD");
       }
    }


    private class Node{
        int value;
        Node next;

        Node(int val){
            this.value = val;
        }
    }
}