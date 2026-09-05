//
// Created by oEnzoRibas on 25/01/2026.
//
#pragma once

#include <cstdint>
#ifndef DSA_CPP_DYNAMICARRAY_H
#define DSA_CPP_DYNAMICARRAY_H

#pragma once

namespace dynamic_array {

    template <typename T>
    class DynamicArray {
    public:
        DynamicArray();
        explicit DynamicArray(std::size_t capacity);
        ~DynamicArray();

        void push_back( const  T& value);

        T pop_back();

        T& operator[](std::size_t index);

        const T& operator[](std::size_t index) const;

        std::size_t size() const;
        std::size_t capacity() const;

        void print();

    private:
        T* data;
        std::size_t sz;
        std::size_t cap;
    };
} // dynamic_list

#include "DynamicArray.tpp"

#endif //DSA_CPP_DYNAMICARRAY_H