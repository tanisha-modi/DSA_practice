class DLL{
     
     Node head;

     public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
     }

// DISPLAY
    public void display(){
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next; 
        }
        System.out.println("END");


        // DISPLAY REVERSE

        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev; 
        }
        System.out.println("START");
    }
    

     // INSERT LAST
     public void insertLast(int val){
        Node node = new Node(val);
        node.next = null;

        if(head == null){
            head = node; 
            node.prev = null;       
        }

        Node temp = head;
        while(temp.next !=null){
            temp = temp.next;
        }
        node.prev = temp;
        temp.next = node;

     }

     // INSERT AFTER INDEX
     public void insert(int val, int after){
        Node p = find(after);

        if(p == null){
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next!=null){

        node.next.prev = node;
        }
     }

     // FIND
    public Node find(int value){
        Node node = head;
        while(node !=null){
            if(node.value == value){
                   return node;
            }
            node = node.next;
        }
        return null;
    }


    private class Node{
        int value; 
        Node next;
        Node prev;

        public Node(int val){
            this.value = val;
        }
        public Node(int val, Node next, Node prev){
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }
}