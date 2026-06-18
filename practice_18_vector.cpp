#pragma once
#include <iostream>

class Vector
{
private:
    int* data;
    int size;
    int capacity;

    void resize()
    {
        capacity *= 2;

        int* newData = new int[capacity];

        for (int i = 0; i < size; i++)
        {
            newData[i] = data[i];
        }

        delete[] data;
        data = newData;
    }

public:
    Vector()
    {
        capacity = 2;
        size = 0;
        data = new int[capacity];
    }

    ~Vector()
    {
        delete[] data;
    }

    void pushBack(int value)
    {
        if (size >= capacity)
        {
            resize();
        }

        data[size] = value;
        size++;
    }

    void insert(int index, int value)
    {
        if (index < 0 || index > size)
        {
            std::cout << "Wrong index\n";
            return;
        }

        if (size >= capacity)
        {
            resize();
        }

        for (int i = size; i > index; i--)
        {
            data[i] = data[i - 1];
        }

        data[index] = value;
        size++;
    }

    void remove(int index)
    {
        if (index < 0 || index >= size)
        {
            std::cout << "Wrong index\n";
            return;
        }

        for (int i = index; i < size - 1; i++)
        {
            data[i] = data[i + 1];
        }

        size--;
    }

    int get(int index)
    {
        if (index < 0 || index >= size)
        {
            std::cout << "Wrong index\n";
            return -1;
        }

        return data[index];
    }

    int getSize()
    {
        return size;
    }

    int getCapacity()
    {
        return capacity;
    }

    void print()
    {
        for (int i = 0; i < size; i++)
        {
            std::cout << data[i] << " ";
        }

        std::cout << std::endl;
    }
};
