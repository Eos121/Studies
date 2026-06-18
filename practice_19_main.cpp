#include <iostream>
#include "ArrayList.h"

using namespace std;

int main()
{
    ArrayList list;

    int choice;

    do
    {
        cout << "\n===== ARRAY LIST =====" << endl;
        cout << "1. Add element" << endl;
        cout << "2. Insert element" << endl;
        cout << "3. Remove element" << endl;
        cout << "4. Get element" << endl;
        cout << "5. Show count" << endl;
        cout << "6. Show capacity" << endl;
        cout << "7. Print list" << endl;
        cout << "0. Exit" << endl;

        cin >> choice;

        switch (choice)
        {
        case 1:
        {
            int value;
            cout << "Enter value: ";
            cin >> value;

            list.add(value);
            break;
        }

        case 2:
        {
            int index, value;

            cout << "Index: ";
            cin >> index;

            cout << "Value: ";
            cin >> value;

            list.insert(index, value);
            break;
        }

        case 3:
        {
            int index;

            cout << "Index: ";
            cin >> index;

            list.remove(index);
            break;
        }

        case 4:
        {
            int index;

            cout << "Index: ";
            cin >> index;

            cout << "Element: " << list.get(index) << endl;
            break;
        }

        case 5:
        {
            cout << "Count: " << list.getCount() << endl;
            break;
        }

        case 6:
        {
            cout << "Capacity: " << list.getCapacity() << endl;
            break;
        }

        case 7:
        {
            list.show();
            break;
        }
        }

    } while (choice != 0);

    return 0;
}
