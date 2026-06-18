#include <iostream>
#include "Vector.h"

using namespace std;

int main()
{
    Vector vec;

    int choice;

    do
    {
        cout << "\n1. Add to end" << endl;
        cout << "2. Insert by index" << endl;
        cout << "3. Remove by index" << endl;
        cout << "4. Get element" << endl;
        cout << "5. Show size" << endl;
        cout << "6. Show capacity" << endl;
        cout << "7. Print vector" << endl;
        cout << "0. Exit" << endl;

        cin >> choice;

        if (choice == 1)
        {
            int value;
            cout << "Value: ";
            cin >> value;

            vec.pushBack(value);
        }
        else if (choice == 2)
        {
            int index, value;

            cout << "Index: ";
            cin >> index;

            cout << "Value: ";
            cin >> value;

            vec.insert(index, value);
        }
        else if (choice == 3)
        {
            int index;

            cout << "Index: ";
            cin >> index;

            vec.remove(index);
        }
        else if (choice == 4)
        {
            int index;

            cout << "Index: ";
            cin >> index;

            cout << "Element: " << vec.get(index) << endl;
        }
        else if (choice == 5)
        {
            cout << "Size: " << vec.getSize() << endl;
        }
        else if (choice == 6)
        {
            cout << "Capacity: " << vec.getCapacity() << endl;
        }
        else if (choice == 7)
        {
            vec.print();
        }

    } while (choice != 0);

    return 0;
}
