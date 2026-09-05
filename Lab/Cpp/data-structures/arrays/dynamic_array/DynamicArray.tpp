//
// Created by oEnzoRibas on 25/01/2026.
//
#pragma once

#include <cstddef>
#include <iostream>

#include "DynamicArray.h"

namespace dynamic_array {

    template <typename T>
    DynamicArray<T>::DynamicArray()
        : data(nullptr), sz(0), cap(0) {}

    template <typename T>
    DynamicArray<T>::DynamicArray(std::size_t capacity)
        : data(new T[capacity]), sz(0), cap(capacity) {}

    template <typename T>
    DynamicArray<T>::~DynamicArray() {
        delete[] data;
    }

    template<typename T>
    void DynamicArray<T>::push_back(const T& value) {
        if (sz >= cap ) {
            std::size_t newCap = cap == 0 ? 1 : cap * 2;
            T* newData = new T[newCap];
            for (std::size_t i = 0; i < sz; i++) {
                newData[i] = data[i];
            }
            delete [] data;
            data = newData;
            cap = newCap;
        }
        data[sz++] = value;
    }

    template<typename T>
    T DynamicArray<T>::pop_back() {
        if (sz > 0) --sz;
        T element = data[sz];
       return element;
    }

    template<typename T>
    T& DynamicArray<T>::operator[](std::size_t index) {
        return data[index];
    }

    template<typename T>
    const T &DynamicArray<T>::operator[](std::size_t index) const {
        return data[index];
    }

    template<typename T>
    std::size_t DynamicArray<T>::size() const {
        return sz;
    }

    template<typename T>
    std::size_t DynamicArray<T>::capacity() const {
        return cap;
    }

    template<typename T>
    void DynamicArray<T>::print() {
        std::cout << "\n[\n" ;
        for (int i = 0; i < sz; i++) {
            std::cout << data[i] << "\n";
        }
        std::cout << "]\n";
    }
} // dynamic_array