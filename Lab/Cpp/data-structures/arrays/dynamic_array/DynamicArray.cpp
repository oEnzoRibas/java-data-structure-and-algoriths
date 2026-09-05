//
// Created by oEnzoRibas on 25/01/2026.
//

#include "DynamicArray.h"
#include <iostream>

int main() {
    dynamic_array::DynamicArray<int> arr;

    arr.push_back(1);
    arr.push_back(211);
    arr.push_back(3);

    std::cout << "Array elements: ";
    arr.print();

    int last = arr.pop_back();
    std::cout << "\nPopped: " << last << "\n";

    std::cout << "Array after pop: ";
    arr.print();

    return 0;
}