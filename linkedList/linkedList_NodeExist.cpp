#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    int key;
    Node *next;

    Node()
    {
        data = 0;
        key = 0;
        next = NULL;
    }
    Node(int k, int d)
    {
        data = d;
        key = k;
        next = NULL;
    }
};

class SinglyLiskedList
{
public:
    Node *head;

    SinglyLiskedList()
    {
        head = NULL;
    }
    SinglyLiskedList(Node *n)
    {
        head = n;
    }

    Node *NodeExists(int k)
    {
        Node *temp = NULL;
        Node *ptr = head;

        while (ptr != NULL)
        {
            if (ptr->key == k)
            {
                temp = ptr;
            }
            ptr = ptr->next;
        }
        return temp;
    }
};

int main()
{
    Node n0(2, 14);
    SinglyLiskedList S2(&n0);

    Node *n1 = new Node;
    SinglyLiskedList S1;

    int k;

    cout << "enter the key of node" << endl;
    cin >> k;

    cout << "The address of Node with key value " << k << " is " << S2.NodeExists(k) << endl;
    cout << "The address of Node with key value " << k << " is " << S1.NodeExists(k) << endl;

    return 0;
}