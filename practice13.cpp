#include <iostream>
#include <cstdlib>
#include <ctime>
#include <cmath>

using namespace std;

int main()
{
    srand(time(NULL));


//1

/*
    int k;

    cout << "enter size: ";
    cin >> k;

    int mas[100];

    int plus = 0;
    int minus = 0;

    for(int i = 0; i < k; i++)
    {
        mas[i] = rand() % 50;

        cout << mas[i] << " ";

        if(mas[i] % 2 == 0)
        {
            plus++;
        }
        else
        {
            minus++;
        }
    }

    cout << "\neven = " << plus;
    cout << "\nodd = " << minus;
*/


//2

/*
    int n;

    cout << "how many corners: ";
    cin >> n;

    int kut[100];

    int suma = 0;

    for(int i = 0; i < n; i++)
    {
        cout << "angle " << i + 1 << ": ";
        cin >> kut[i];

        suma = suma + kut[i];
    }

    if(suma == 180 * (n - 2))
    {
        cout << "polygon exists";
    }
    else
    {
        cout << "polygon impossible";
    }
*/


//3

/*
    int n;

    cout << "size: ";
    cin >> n;

    int arr[100];

    for(int i = 0; i < n; i++)
    {
        arr[i] = rand() % 30;

        cout << arr[i] << " ";
    }

    int oldNum;
    int newNum;

    cout << "\nnumber: ";
    cin >> oldNum;

    cout << "replace with: ";
    cin >> newNum;

    for(int i = 0; i < n; i++)
    {
        if(arr[i] == oldNum)
        {
            arr[i] = newNum;
        }
    }

    cout << "\nresult:\n";

    for(int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
*/


//4

/*
    double nums[91];

    for(int i = 0; i <= 90; i++)
    {
        nums[i] = sin(i * 3.14 / 180);
    }

    for(int i = 0; i <= 90; i++)
    {
        cout << nums[i] << " ";

        if(i % 8 == 0)
        {
            cout << endl;
        }
    }
*/


//5

/*
    int n;

    cout << "size: ";
    cin >> n;

    int a[100];

    for(int i = 0; i < n; i++)
    {
        a[i] = rand() % 100;

        cout << a[i] << " ";
    }

    int t;

    cout << "\n1-up 2-down: ";
    cin >> t;

    bool check = true;

    if(t == 1)
    {
        for(int i = 0; i < n - 1; i++)
        {
            if(a[i] > a[i + 1])
            {
                check = false;
            }
        }

        if(check)
        {
            cout << "array growing";
        }
        else
        {
            cout << "array not growing";
        }
    }

    if(t == 2)
    {
        for(int i = 0; i < n - 1; i++)
        {
            if(a[i] < a[i + 1])
            {
                check = false;
            }
        }

        if(check)
        {
            cout << "array decreasing";
        }
        else
        {
            cout << "array not decreasing";
        }
    }
*/
    
    return 0;
}
