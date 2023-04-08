#include <iostream>
using namespace std;
class Node // node class for creating nodes
{
public:
    int key;    // key to identify any node to be deleted or updated
    int data;   // data of node
    Node *next; // data type is node which is same as the class ...bcoz the pointer will be pointing to a object which is of same datatype

    Node() // constructor of node
    {
        key = 0;
        data = 0;
        next = NULL;
    }
    Node(int k, int d) // constructor of node
    {
        key = k;
        data = d;
        next = NULL;
    }
};

class SinglyLinkedList
{
public:
    Node *head; // points to the object of class node //points to first element of linked list

    SinglyLinkedList() // constructor
    {
        head = NULL;
    }

    SinglyLinkedList(Node *h) // constructor
    {
        head = h;
    }

    Node *NodeExist(int k) // POINTER FUNCTION : will return pointer
    {
        Node *ptr = head;  // checking starts from head
        Node *temp = NULL; // new empty pointer variable is made

        while (ptr != NULL) // loop executes until pointer ptr is NULL
        {
            if (ptr->key == k) // if key exist // -> is used to access the members of the /structure or the unions using pointers.
            {
                temp = ptr; // if key exist prt pointer will be returned otherwise NULL is returned
            }
            ptr = ptr->next;
        }
        return temp;
    }

    void DeleteNode(int k)
    {
        if (head == NULL)
        {
            cout << " singly Linked List already empty. can't delete" << endl;
        }
        else if (head != NULL)
        {
            if (head->key == k)
            {
                head = head->next;
                cout << "Node unlinked" << endl;
            }
            else
            {
                Node *temp = NULL;
                Node *pre_ptr = head;
                Node *current_ptr = head->next;

                while (current_ptr != NULL)
                {
                    if (current_ptr->key = k)
                    {
                        temp = current_ptr;
                        current_ptr = NULL;
                    }
                    else
                    {
                        pre_ptr = pre_ptr->next;
                        current_ptr = current_ptr->next;
                    }
                    if (temp != NULL)
                    {
                        pre_ptr->next = temp->next;
                        cout << "Node unlinked " << endl;
                    }
                    else
                    {
                        cout << "node of given key value does not exist" << endl;
                    }
                }
            }
        }
    }
};

int main()
{
    Node *n1 = new Node;
    SinglyLinkedList S1;
    int k1;

    cout << "Enter the key of the Node to be deleted" << endl;
    cin >> k1;

    S1.DeleteNode(k1);

    return 0;
}