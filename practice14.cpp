#include <iostream>
#include <string>

using namespace std;

void averageNums(int *arr, int n)
{
    int evenSum = 0;
    int oddSum = 0;

    int evenCount = 0;
    int oddCount = 0;

    int *ptr = arr;

    for(int i = 0; i < n; i++)
    {
        if(*ptr % 2 == 0)
        {
            evenSum += *ptr;
            evenCount++;
        }
        else
        {
            oddSum += *ptr;
            oddCount++;
        }

        ptr++;
    }

    if(evenCount != 0)
    {
        cout << "average even: " << (double)evenSum / evenCount << endl;
    }

    if(oddCount != 0)
    {
        cout << "average odd: " << (double)oddSum / oddCount << endl;
    }
}

void words(string *text, int size)
{
    string *p = text;

    string big = *p;
    string small = *p;

    for(int i = 0; i < size; i++)
    {
        if(p->length() > big.length())
        {
            big = *p;
        }

        if(p->length() < small.length())
        {
            small = *p;
        }

        p++;
    }

    cout << "biggest word: " << big << endl;
    cout << "smallest word: " << small << endl;
}

void allSum(float *nums, int size)
{
    float result = 0;

    float *p = nums;

    for(int i = 0; i < size; i++)
    {
        result += *p;
        p++;
    }

    cout << "sum = " << result << endl;
}

int main()
{
    int a[5] = {4, 7, 2, 9, 10};

    averageNums(a, 5);

    cout << endl;

    string s[5] = {"hello", "java", "computer", "pc", "keyboard"};

    words(s, 5);

    cout << endl;

    float b[5] = {1.1, 5.4, 2.8, 7.2, 3.0};

    allSum(b, 5);

    return 0;
}
