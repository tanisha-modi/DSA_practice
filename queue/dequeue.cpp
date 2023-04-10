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
    bool isEmpty() // function to check whether the queue is empty or not
    {
        if (rear == -1 && front == -1) // if same as initialized by constructor
            return true;
        else
            return false;
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
            return x;
        }
        else
        {
            x = arr[front]; // case : queue has more than one value in it
            arr[front] = 0; // putting 0 at dequeued value position
            front++;
            return x;
        }
    }
};

int main()
{
    queue Q1;
    Q1.dequeue();

    return 0;
}