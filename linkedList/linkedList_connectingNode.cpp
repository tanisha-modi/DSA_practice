#include <iostream>
using namespace std;

class node
{
public:
    int key;    // key to identify any node to be deleted or updated
    int data;   // data of node
    node *next; // data type is node which is same as the class ...bcoz the pointer will be pointing to a object which is of same datatype

    node() // constructor
    {
        key = 0;
        data = 0;
        next = NULL;
    }

    node(int k, int d) // constructor
    {
        key = k;
        data = d;
        next = NULL;
    }
};

class SinglyLinkedList : public node
{
public:
    node *head; // points to the object of class node

    SinglyLinkedList() // constructor
    {
        head = NULL;
    }

    SinglyLinkedList(node *h) // constructor
    {
        head = h;
    }

    void appendNode(node *n)
    {
        next = n;
    }
    void prependNode(node *n)
    {
        next = head;
        head = n;
    }
    void insertNode(int key, node *n)
    {
    }
    void deleteNode(int key);
    void updateNode(int key);
};
int main()
{
    node n1(1, 100); // objects of class node ..creating nodes
    node n2(2, 200);
    node n3(3, 300);

    SinglyLinkedList s1(&n1); // object of class SinglyLinkedList // making connection between nodes using append and prepent etc function
    s1.appendNode(&n2);
    s1.prependNode(&n3);

    return 0;
}