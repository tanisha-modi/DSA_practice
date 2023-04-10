#include <iostream>
using namespace std;

class queue // first in first out //two-ends
{
private:
    int arr[5];
    int front, rear; // variable for indexing in array //rear is for rear end from where elements will be enqueued
                     // front is for front end from where elements will be dequeued

public:
    queue() // constructor
    {
        rear = front = -1;          // rear and front initialized with index (-1)
        for (int i = 0; i < 5; i++) // initializing values of queue with 0
        {
            arr[i] = 0;
        }
    }

    bool isFull()
    {

        if (rear == (sizeof(arr) / sizeof(int)) - 1) // function to check whether the queue is full or not
        {                                            // sizeof(arr)/sizeof(int) --> No. of elements
            return true;
        }
        else
            return false;
    }

    bool isEmpty() // function to check whether the queue is empty or not
    {

        if (rear == -1 && front == -1) // if same as initialized by constructor
        {
            return true;
        }
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
        }
        else // on insertion of 2nd or next values ..only rear will be incremented
        {
            rear++;
        }
        arr[rear] = value; // value is inserted at index rear (from rear end)
    }
};

int main()
{
    int value;
    cout << "enter value to be enqueueed " << endl;
    cin >> value;
    queue Q1;

    Q1.enqueue(value);

    return 0;
}
