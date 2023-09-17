// Linear seach is also known as sequential search

#include <iostream>
using namespace std;

void LinearSearch(int arr[], int n)
{

    for (int i = 0; i < 6; i++)
    {
        if (arr[i] == n)
        {
            cout << n << " found at index " << i << endl;
            break;
        }
        else if (i == 5)
        {
            cout << n << " not found" << endl;
        }
    }
}
int main()
{
    int arr[] = {12, 34, 43, 23, 98, 65};
    cout << "Enter the num you want to search" << endl;
    int num;
    cin >> num;

    LinearSearch(arr, num);

    return 0;
}