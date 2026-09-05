#include <iostream>
#include "pytagoras.hpp"
#include <format>

int y = 12;
int x =2;

int* ptr = &y;

void bar(int* p) {
    if (!p) return;

    *p =5;
}

int main() {
    bar(nullptr);
    return 0;
}