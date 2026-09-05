#include <iostream>
#include <cstdint>

int main() {
    std::cout << (~uint8_t(0) << 2);
}
