#include <iostream>
using namespace std;

class CircularQueue // first in first out //two-ends
{
private:
    int arr[5];
    int front, rear;                   // variable for indexing in array //rear is for rear end from where elements will be enqueued
                                       // front is for front end from where elements will be dequeued
    int N = sizeof(arr) / sizeof(int); // sizeof(arr)/sizeof(int) --> No. of elements
    int itemCount;

public:
    CircularQueue() // constructor
    {
        rear = front = -1; // rear and front initialized with index (-1)
        itemCount = 0;
        for (int i = 0; i < N; i++)
        {
            arr[i] = 0; // initializing values of queue with 0
        }
    }

    bool isFull() // function to check whether the queue is full or not
    {
        if ((rear + 1) % N == front) // sizeof(arr)/sizeof(int) --> No. of elements
        {
            return true;
        }
        else
            return false;
    }

    bool isEmpty() // function to check whether the queue is empty or not
    {
        if (rear == -1 && front == -1) // if same as initialized by constructor
            return true;
        else
            return false;
    }

    void enqueue(int value) // function to insert value in queue
    {
        if (isFull()) // firstly checking if the queue is full and no more values can be added
        {
            cout << "Queue is Full" << endl;
            return;
        }
        else if (isEmpty()) // if inserting 1st value to queue ..both rear and front will be incremented
        {
            rear = front = 0;
            arr[rear] = value; // value is inserted at index rear (from rear end)
        }
        else // on insertion of 2nd or next values ..only rear will be incremented
        {
            rear = (rear + 1) % N;
            arr[rear] = value; // value is inserted at index rear (from rear end)
        }
        itemCount++;
    }
    int dequeue() // function to print and remove value from the queue
    {
        int x;
        if (isEmpty()) // firstly check if the queue is empty or not
        {
            cout << "queue is empty " << endl;
            return 0;
        }
        else if (front == rear) // case : only one element is in queue
        {
            x = arr[front];
            arr[front] = 0; // putting 0 at dequeued value position
            rear = -1;      // setting values{index} as in case of empty queue
            front = -1;
            itemCount--;
            return x;
        }
        else
        {
            x = arr[front]; // case : queue has more than one value in it
            arr[front] = 0; // putting 0 at dequeued value position
            front = (front + 1) % N;
            itemCount--;
            return x;
        }
    }

    int count()
    {
        if (isEmpty()) // if queue is empty
        {
            return 0;
        }
        else
            return itemCount; //  itemCount keeps track of no. of elements in Queue
    }
    void display() // function to display all values of queue
    {

        for (int i = 0; i < 5; i++) // rear - front + 1 gives number of values in queue
        {
            cout << arr[i] << "  ";
        }
    }
};
int main()

{
    CircularQueue Q1;
    int option, position, value;

    do
    {
        cout << "\n\n";
        cout << "What operations do you want to perform ? Select option number. Enter 0 to exit. " << endl
             << "1. Enqueue " << endl
             << "2. dequeue " << endl
             << "3. isFull " << endl
             << "4. isEmpty " << endl
             << "5. count " << endl
             << "6. display " << endl
             << "7. clear screen " << endl
             << endl;

        cin >> option;

        switch (option) // calling different functions using switch-case
        {
        case 0:
            break;
        case 1:
            cout << "Enqueue function called " << endl;
            cout << "enter a value to insert in queue " << endl;
            cin >> value;
            Q1.enqueue(value);
            break;
        case 2:
            value = Q1.dequeue();
            cout << "dequeue function called - " << endl
                 << "dequeued value is " << value << endl;
            break;
        case 3:
            if (Q1.isFull())
            {
                cout << "Queue is Full " << endl;
            }
            else
            {
                cout << "Queue is not Full " << endl;
            }
            break;
        case 4:
            if (Q1.isEmpty())
            {
                cout << "Queue is Empty " << endl;
            }
            else
            {
                cout << "Queue is not Empty " << endl;
            }
            break;
        case 5:
            cout << "count function called " << endl
                 << "no. of items in queue are " << Q1.count() << endl;
            break;
        case 6:
            cout << "display function called " << endl;
            Q1.display();
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
// In circular queue : ek baar queue full hone k baad ..kuch values ko dequeue kr k .. values enqueue kr skte
//..pehle pura queue empty hona jruri ni h
