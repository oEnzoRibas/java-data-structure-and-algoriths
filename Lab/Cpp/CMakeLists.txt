cmake_minimum_required(VERSION 3.20)

project(dsa_cpp LANGUAGES CXX)

set(CMAKE_CXX_STANDARD 20)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

add_executable(experiments
        playground/experiments/main.cpp
)

add_executable(understanding
        playground/experiments/understanding/pytagoras.cpp
        playground/experiments/understanding/main.cpp
        playground/experiments/understanding/pytagoras.hpp
)
add_executable(ownership fundamentals/ownership/ownership.cpp)

add_executable(
        dynamic_list data-structures/arrays/dynamic_array/DynamicArray.cpp
        data-structures/arrays/dynamic_array/DynamicArray.tpp)
