//
// Created by oEnzoRibas on 25/01/2026.
//

#include <iostream>
#include <memory>
#include <format>
#include <stdexcept>

struct Tracer {
    int id;
    Tracer (int id) : id(id) {
        std::cout << std::format(
        "Construct id: {} in {}\n",
        id,
        static_cast<const void*>(this)
    );
    }

    Tracer (const Tracer& other) : id(other.id) {
        std::cout << std::format(
        "Copy id: {} in {}\n",
        id,
        static_cast<const void*>(this)
    );
    }

    Tracer(Tracer&& other) noexcept : id(other.id) {
        other.id = -1;
        std::cout << std::format(
        "Move id: {} in {}\n",
        id,
        static_cast<const void*>(this)
    );
    }

    ~Tracer() {
        std::cout << std::format(
        "Destruct id: {} in {}\n",
        id,
        static_cast<const void*>(this)
    );
    }
};

void unique_ownership() {
    std::cout << "UNIQUE OWNERSHIP\n";
    std::unique_ptr<Tracer> z = std::make_unique<Tracer>(1);
    std::unique_ptr<Tracer> d = std::move(z);
}

void shared_ownership() {
    std::cout << "SHARED OWNERSHIP\n";
    std::shared_ptr<Tracer> a = std::make_shared<Tracer>(2);


    {
        std::shared_ptr<Tracer> b0 = a;
        std::cout << "use_count: " << a.use_count() << "\n";
    }

    {
        std::shared_ptr<Tracer> b1 = a;
        std::shared_ptr<Tracer> b2 = a;
        std::cout << "use_count: " << a.use_count() << "\n";
    }

    std::cout << "use_count: " << a.use_count() << "\n";
}
void risky() {
    Tracer b(1);
    throw std::runtime_error("RUNTIME EXCEPTION");
}

void RAII() {
    {
        Tracer b(10);

        std::cout <<"INSIDE SCOPE\n";
    }
    std::cout << "OUTSIDE SCOPE\n";

    std::cout << "EXCEPTION SAFETY\n";

    try {
        risky();
    }catch (...) {
        std::cout << "Caught exception\n";
    }

}

void unique_RAII() {
    auto a = std::make_unique<Tracer>(22);

    // {
    //     auto b = std::move(a);
    //     std::cout << "ownership moved\n";
    // }

    auto c = std::move(a);
    std::cout << "ownership moved\n" << "id: " << c->id << "\n";

    std::cout << "end of unique_RAII\n";

}

int main() {
    // unique_ownership();
    // shared_ownership();
    //RAII();
    unique_RAII();
    return 0;
};


