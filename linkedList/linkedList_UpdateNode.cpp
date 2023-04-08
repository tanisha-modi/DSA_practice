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

    // 1. function to check if a NODE EXIST or not ..using key value //traversing of linked list

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

    void UpdateNode(int key, int data)
    {
        Node *temp = NodeExist(key);
        if (temp == NULL)
        {
            temp->data = data;
            cout << "Node successfully updated" << endl;
        }
        else
        {
            cout << "node of given key does not exist" << endl;
        }
    }
};
int main()
{
    Node *n1 = new Node;
    SinglyLinkedList S1;
    int k1, d1;

    cout << "Enter the key and data of the Node to be updated" << endl;
    cin >> k1 >> d1;

    S1.UpdateNode(k1, d1);
    return 0;
}