#include <iostream>
using namespace std;

class node
{
public:
    int key;
    int data;
    node *next; // data type is node which is same as the class ...bcoz the pointer will be pointing to a object which is of same datatype

    node()
    {
        key = 0;
        data = 0;
        next = NULL;
    }

    node(int k, int d)
    {
        key = k;
        data = d;
        next = NULL;
    }
};

int main()
{
    node n1(1, 100);
    node n2(2, 200);

    return 0;
}