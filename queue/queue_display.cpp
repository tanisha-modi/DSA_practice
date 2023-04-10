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
    void display() // function to display all values of queue
    {
        cout << "the values are as follows :" << endl;
        for (int i = 0; i < (rear - front + 1); i++) // rear - front + 1 gives number of values in queue
        {
            cout << arr[i] << "  ";
        }
    }
};

int main()
{
    queue Q1;
    Q1.display();

    return 0;
}