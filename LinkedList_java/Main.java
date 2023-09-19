public class Main {
    public static void main(String[] args) {


//  SINGLY LINKED LIST ----------------------------------------------------------------

        // LL list = new LL();
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(34);
        // list.insertLast(100);
        // list.display();
        // list.insert(400, 2);
        // list.display();

        // System.out.println(list.deleteFirst());
        // list.display();
        // System.out.println(list.deleteLast());
        // list.display();


        // DOUBLY LINKED LIST ----------------------------------------------------------

        // DLL Dlist = new DLL();
        // Dlist.insertFirst(3);
        // Dlist.insertFirst(2);
        // Dlist.insertFirst(34);
        // Dlist.insertLast(99);
        // Dlist.display();
        // Dlist.insert(0, 8);
        // Dlist.display(); 


        // CIRCULAR LINKED LIST

        CLL list = new CLL();
        list.insert(24);
        list.insert(100);
        list.insert(24);
        list.display();
        list.delete(30);
        list.display();
    }
}
