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
                cout << "hello" << endl;
                temp = ptr; // if key exist prt pointer will be returned otherwise NULL is returned
            }
            ptr = ptr->next;
        }
        return temp;
    }

    // 2. function to APPEND a node into the list  // append at the end of the list

    void AppendNode(Node *n)
    {
        if (NodeExist(n->key) != NULL) // checks whether the appending Node has unique key or not
        {
            cout << "Node already exist with key value " << n->key << endl
                 << "append another node with different key value" << endl;
        }
        else // else part run if apeending node has unique key
        {
            if (head == NULL) // if list has no node
            {
                head = n; // head will be pointer pointing to the first node i.e. n (appending node)
                cout << "Node appended" << endl;
            }
            else
            {
                Node *ptr = head;
                while (ptr->next != NULL) // traversing list // if list has nodes //ptr will give last node (ptr->next = NULL)
                {
                    ptr = ptr->next;
                }
                ptr->next = n; // appending at end
                cout << "Node appended" << endl;
            }
        }
    }

    // 3. function to PREPEND a node into the list // prepend at start of the list

    void PrependNode(Node *n)
    {
        if (NodeExist(n->key) != NULL) // checks whether the prepending Node has unique key or not
        {
            cout << "Node already exist with key value" << n->key << endl
                 << "prepend another node with different key value" << endl;
        }
        else
        {
            n->next = head;
            head = n; // n will now become the first node
            cout << "Node prepended" << endl;
        }
    }

    // 4. function to INSERT a node after a particular node in the list

    void InsertNodeAfter(int k, Node *n) // takes key of the node after which new 'n' Node to be inserted as parameter
    {
        Node *temp = NodeExist(k); // pointer to node with the key 'k' (after which new node to be inserted )
        if (temp == NULL)          // checks whether node with key 'k' exist or not
        {
            cout << "No Node exist with key value " << k << endl;
        }
        else
        {

            if (NodeExist(n->key) != NULL) // checks whether the new node has a unique key or not
            {
                cout << "Node already exist with key value " << n->key << endl
                     << "insert another node with different key value" << endl;
            }
            else
            {
                n->next = temp->next; // insertion of new key after temp
                temp->next = n;
                cout << "Node inserted" << endl;
            }
        }
    }

    // 5. function to DELETE a node by unique key // actually we are not deleting Node ..we are just unlinking node

    void DeleteNode(int k)
    {
        if (head == NULL) // if list is empty
        {
            cout << "Singly linked list is already empty. can't delete" << endl;
        }
        else if (head != NULL) // if list is not empty
        {
            if (head->key == k) // if first element is to be deleted
            {
                head = head->next;
                cout << "Node unlinked with key value :" << k << endl;
            }
            else // if centred or end Noe to be deleted
            {
                Node *temp = NULL;
                Node *preNode = head;           // previous Node while traversing
                Node *currentNode = head->next; // current Node while traversing

                while (currentNode != NULL)
                {
                    if (currentNode->key == k) // if current Node matches the key of node to be deleted
                    {
                        temp = currentNode;
                        currentNode = NULL; // to stop while loop after node is found
                    }
                    else
                    {
                        currentNode = currentNode->next; // traversing
                        preNode = preNode->next;
                    }
                }
                if (temp != NULL)
                {
                    preNode->next = temp->next; // join previous and next node //unlinking
                    cout << "Node Unlinked with key value : " << k << endl;
                }
                else
                {
                    cout << "Node with key " << k << " doesn't exist " << endl;
                }
            }
        }
    }

    // 6. function to UPDATE a node using key

    void UpdateNode(int k, int d) // key and data
    {
        Node *temp = NodeExist(k); // getting node with key k
        if (temp != NULL)
        {
            temp->data = d; // updation
            cout << "Node Updated" << endl;
        }
        else
        {
            cout << "Node doesn't exist with key : " << k << endl;
        }
    }

    // 7. printing of linked list

    void DisplayList()
    {
        if (head == NULL) // if list is empty
        {
            cout << "No node in singly linked list" << endl;
        }
        else
        {
            Node *temp = head;
            cout << "\nlinked list :" << endl;

            while (temp != NULL) // traversing and printing
            {
                cout << "(" << temp->key << "," << temp->data << ") --> ";
                temp = temp->next;
            }
        }
    }
};

int main()
{
    SinglyLinkedList S1; // object
    Node *n1 = new Node; // using new operator // creating object ..but have dynamic memory allocation --> heap me memory allocate ho rhi // Node *n1 --> stack me memory allocate hoti
    int option, key1, k1, data1;

    do
    {
        cout << "\n\n";
        cout << "What operations do you want to perform ? Select option number. Enter 0 to exit. " << endl
             << "1. AppendNode() " << endl
             << "2. PrependNode() " << endl
             << "3. InsertNodeAfter() " << endl
             << "4. DeleteNode() " << endl
             << "5. UpdateNode() " << endl
             << "6. DisplayList() " << endl
             << "7. clear screen " << endl
             << endl;

        cin >> option;

        switch (option) // calling different functions using switch-case
        {
        case 0:
            break;
        case 1:
            cout << "AppendNode() function called " << endl;
            cout << "enter the key and data to append in list " << endl;
            cin >> key1 >> data1;

            n1->data = data1;
            n1->key = key1;

            S1.AppendNode(n1);
            break;

        case 2:
            cout << "PrependNode() function called " << endl;
            cout << "enter the key and data to prepend in list " << endl;
            cin >> key1 >> data1;

            n1->data = data1;
            n1->key = key1;

            S1.PrependNode(n1);
            break;

        case 3:
            cout << "InsertNodeAfter() function called. " << endl
                 << "enter the key of existing Node after which new node to be inserted " << endl;
            cin >> k1;

            cout << "enter the key and data of new Node to insert into list " << endl;
            cin >> key1 >> data1;

            n1->data = data1;
            n1->key = key1;

            S1.InsertNodeAfter(k1, n1);
            break;

        case 4:
            cout << "DeleteNode() function called " << endl;
            cout << "enter the key of Node to delete from list " << endl;
            cin >> key1;

            S1.DeleteNode(key1);
            break;

        case 5:
            cout << "UpdateNode() function called " << endl;
            cout << "enter the key of Node to Update in list " << endl;
            cin >> key1;

            cout << "enter the new data to Update in list " << endl;
            cin >> data1;

            S1.UpdateNode(key1, data1);
            break;

        case 6:
            cout << "DisplayList() function called " << endl;
            S1.DisplayList();
            break;

        case 7:
            system("cls");
            break;

        default:
            cout << "enter proper option number " << endl;
        }
    } while (option != 0);
    cout << "exiting program...  " << endl;

    return 0;
}