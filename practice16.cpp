#include <iostream>
#include <ctime>
#include <cstdlib>

using namespace std;

void show(float*** m,int a,int b,int c)
{
    for(int i=0;i<a;i++)
    {
        cout << "block " << i + 1 << endl;

        for(int j=0;j<b;j++)
        {
            for(int k=0;k<c;k++)
            {
                cout << m[i][j][k] << " ";
            }

            cout << endl;
        }

        cout << endl;
    }
}

int main()
{
    srand(time(NULL));

    int *num = new int;
    double *db = new double;
    char *sym = new char;
    bool *flag = new bool;

    cout << "int: ";
    cin >> *num;

    cout << "double: ";
    cin >> *db;

    cout << "char: ";
    cin >> *sym;

    cout << "bool: ";
    cin >> *flag;

    cout << endl;

    cout << *num << endl;
    cout << *db << endl;
    cout << *sym << endl;
    cout << *flag << endl;

    double *value = new double;

    double &link = *value;

    cout << "\ninput number: ";
    cin >> link;

    cout << "ref = " << link << endl;

    int size;

    cout << "\narray size: ";
    cin >> size;

    int *a = new int[size];

    for(int i=0;i<size;i++)
    {
        a[i] = size - i;
    }

    cout << "\narray:\n";

    for(int i=0;i<size;i++)
    {
        cout << a[i] << " ";
    }

    cout << endl;

    int x,y,z;

    cout << "\ninput x y z: ";
    cin >> x >> y >> z;

    float*** arr = new float**[x];

    for(int i=0;i<x;i++)
    {
        arr[i] = new float*[y];

        for(int j=0;j<y;j++)
        {
            arr[i][j] = new float[z];
        }
    }

    for(int i=0;i<x;i++)
    {
        for(int j=0;j<y;j++)
        {
            for(int k=0;k<z;k++)
            {
                arr[i][j][k] = rand() % 50;
            }
        }
    }

    cout << endl;

    show(arr,x,y,z);

    delete num;
    delete db;
    delete sym;
    delete flag;

    delete value;

    delete[] a;

    for(int i=0;i<x;i++)
    {
        for(int j=0;j<y;j++)
        {
            delete[] arr[i][j];
        }

        delete[] arr[i];
    }

    delete[] arr;

    return 0;
}
