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
        rear = front = -1;                                    // rear and front initialized with index (-1)
        for (int i = 0; i < (sizeof(arr) / sizeof(int)); i++) // sizeof(arr)/sizeof(int) --> No. of elements
        {
            arr[i] = 0; // initializing values of queue with 0
        }
    }

    bool isEmpty() // function to check whether the queue is empty or not
    {
        if (rear == -1 && front == -1) // if same as initialized by constructor
            return true;
        else
            return false;
    }
};

int main()
{
    queue Q1;
    cout << Q1.isEmpty();

    return 0;
}
