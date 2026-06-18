#pragma once
#include <iostream>

class ArrayList
{
private:
    int* arr;
    int count;
    int capacity;

    void increaseCapacity()
    {
        capacity *= 2;

        int* temp = new int[capacity];

        for (int i = 0; i < count; i++)
        {
            temp[i] = arr[i];
        }

        delete[] arr;
        arr = temp;
    }

public:
    ArrayList()
    {
        capacity = 4;
        count = 0;
        arr = new int[capacity];
    }

    ~ArrayList()
    {
        delete[] arr;
    }

    void add(int value)
    {
        if (count >= capacity)
        {
            increaseCapacity();
        }

        arr[count] = value;
        count++;
    }

    void insert(int index, int value)
    {
        if (index < 0 || index > count)
        {
            std::cout << "Invalid index" << std::endl;
            return;
        }

        if (count >= capacity)
        {
            increaseCapacity();
        }

        for (int i = count; i > index; i--)
        {
            arr[i] = arr[i - 1];
        }

        arr[index] = value;
        count++;
    }

    void remove(int index)
    {
        if (index < 0 || index >= count)
        {
            std::cout << "Invalid index" << std::endl;
            return;
        }

        for (int i = index; i < count - 1; i++)
        {
            arr[i] = arr[i + 1];
        }

        count--;
    }

    int get(int index)
    {
        if (index < 0 || index >= count)
        {
            std::cout << "Invalid index" << std::endl;
            return -1;
        }

        return arr[index];
    }

    int getCount()
    {
        return count;
    }

    int getCapacity()
    {
        return capacity;
    }

    void show()
    {
        if (count == 0)
        {
            std::cout << "List is empty" << std::endl;
            return;
        }

        for (int i = 0; i < count; i++)
        {
            std::cout << arr[i] << " ";
        }

        std::cout << std::endl;
    }
};
