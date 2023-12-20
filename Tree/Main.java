
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // BinaryTree tree = new BinaryTree();
        // tree.populate(sc);
        // tree.display();
        // tree.prettyDisplay();


        BST tree = new BST();
        int nums[] = {2, 5, 6, 4, 7, 34 ,65, 32, 73};
        tree.populate(nums);
        tree.display();
    }
}
