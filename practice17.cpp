#include <iostream>
#include <cmath>
#include <ctime>

using namespace std;

struct Point
{
    double x;
    double y;
};

double calcArea(Point* p)
{
    double a = sqrt(pow(p[1].x - p[0].x, 2) + pow(p[1].y - p[0].y, 2));
    double b = sqrt(pow(p[2].x - p[1].x, 2) + pow(p[2].y - p[1].y, 2));

    return a * b;
}

int main()
{
    srand(time(NULL));

    int opt;

    Point* rect = new Point[4];

    cout << "1 - manual input\n";
    cout << "2 - random\n";
    cin >> opt;

    if(opt == 1)
    {
        for(int i = 0; i < 4; i++)
        {
            cout << "point " << i + 1 << "\n";

            cout << "x: ";
            cin >> rect[i].x;

            cout << "y: ";
            cin >> rect[i].y;
        }
    }
    else if(opt == 2)
    {
        rect[0].x = 0;
        rect[0].y = 0;

        rect[1].x = rand() % 10 + 1;
        rect[1].y = 0;

        rect[2].x = rect[1].x;
        rect[2].y = rand() % 10 + 1;

        rect[3].x = 0;
        rect[3].y = rect[2].y;

        cout << "\npoints:\n";

        for(int i = 0; i < 4; i++)
        {
            cout << rect[i].x << " " << rect[i].y << endl;
        }
    }
    else
    {
        cout << "error input";
        delete[] rect;
        return 0;
    }

    cout << "\narea = " << calcArea(rect) << endl;

    delete[] rect;

    return 0;
}
