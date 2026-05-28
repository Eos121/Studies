#include <iostream>
#include <string>

using namespace std;

void types()
{
    int *x = new int;
    double *y = new double;
    char *z = new char;
    bool *b = new bool;
    float *f = new float;

    cout << "input int: ";
    cin >> *x;

    cout << "input double: ";
    cin >> *y;

    cout << "input char: ";
    cin >> *z;

    cout << "input bool: ";
    cin >> *b;

    cout << "input float: ";
    cin >> *f;

    cout << endl;

    cout << "int -> " << *x << endl;
    cout << "double -> " << *y << endl;
    cout << "char -> " << *z << endl;
    cout << "bool -> " << *b << endl;
    cout << "float -> " << *f << endl;

    delete x;
    delete y;
    delete z;
    delete b;
    delete f;
}

void refs()
{
    double num;

    cout << "number: ";
    cin >> num;

    double &r = num;

    cout << "before = " << r << endl;

    r = r + 10;

    cout << "after = " << num << endl;
}

void dynamicArr()
{
    int size;

    cout << "size: ";
    cin >> size;

    int *m = new int[size];

    for(int i = 0; i < size; i++)
    {
        cout << "value " << i + 1 << ": ";
        cin >> m[i];
    }

    cout << "\narray:\n";

    for(int i = 0; i < size; i++)
    {
        cout << m[i] << " ";
    }

    cout << endl;

    delete[] m;
}

void textTask()
{
    string s;

    cin.ignore();

    cout << "write text: ";
    getline(cin, s);

    cout << "text = " << s << endl;
    cout << "symbols = " << s.size() << endl;
}

int main()
{
    int c;

    while(true)
    {
        cout << "\n1 - types" << endl;
        cout << "2 - reference" << endl;
        cout << "3 - dynamic array" << endl;
        cout << "4 - string" << endl;
        cout << "0 - exit" << endl;

        cout << "choose: ";
        cin >> c;

        if(c == 1)
        {
            types();
        }
        else if(c == 2)
        {
            refs();
        }
        else if(c == 3)
        {
            dynamicArr();
        }
        else if(c == 4)
        {
            textTask();
        }
        else if(c == 0)
        {
            cout << "bye";
            break;
        }
        else
        {
            cout << "error";
        }
    }

    return 0;
}
