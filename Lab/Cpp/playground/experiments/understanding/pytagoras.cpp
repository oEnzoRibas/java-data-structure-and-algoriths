#include "pytagoras.hpp"
#include <cmath>
#include <format>
#include <iostream>

static int y = 13;

static int* ptr = &y;

double_t calculate_pytagoras(double_t a, double_t b) {
    std::cout << std::format("Pointer inside main.cpp -> {} ", static_cast<const void*>(ptr));
    return (pow(0,2) + pow(y,2));
}