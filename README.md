# Data Structures & Algorithms

![C++](https://img.shields.io/badge/C%2B%2B-blue?logo=cplusplus)
![Java](https://img.shields.io/badge/Java-orange?logo=openjdk)
![Python](https://img.shields.io/badge/Python-3.x-yellow?logo=python)
![License](https://img.shields.io/badge/License-MIT-green)

A personal repository for studying, implementing, testing, and analyzing **Data Structures and Algorithms (DSA)**.

This repository brings together implementations and exercises developed throughout the **Algorithms and Data Structures** courses, as well as additional implementations created in the `lab/` environment.

The main goal is not only to implement algorithms, but to understand their **design, correctness, complexity, trade-offs, and practical applications**.

## Books & References

### Nivio Ziviani — Projeto de Algoritmos

<p align="center">
  <img src="books/projeto_de_algoritmos-nivio_ziviani.webp" width="150">
</p>

A major reference for algorithms, data structures, analysis, and implementation.

---

### Robert Sedgewick — Algorithms in C++

<p align="center">
  <img src="books/algorithms_cpp_1_4-robert_sedgewick.jpg" width="150">
  <img src="books/algorithms_cpp_5-robert_sedgewick.jpg" width="150">
</p>

Reference for classical algorithms and data structures with a strong focus on implementation.

---

## Languages

The repository contains implementations in different languages depending on the course and experiment.

Currently:

- **C++** — primary language for lower-level implementations and algorithm experiments
- **Java** — implementations related to the university coursework
- **Python** — experiments, numerical analysis, visualization, and prototyping

The same algorithm may eventually be implemented in more than one language to compare implementation complexity and language-level abstractions.

---

## Complexity

One of the main objectives of this repository is to go beyond implementation and understand the computational cost of each solution.

For each relevant algorithm or data structure, the analysis should consider:

```text
Time Complexity
Space Complexity
Best Case
Average Case
Worst Case
```

When applicable:

```text
Amortized Complexity
Recurrence Relations
Number of Comparisons
Number of Memory Accesses
Number of Disk I/O Operations
```

For external-memory algorithms, particular attention is given to **disk I/O**, since minimizing the number of accesses to secondary storage can be more important than minimizing CPU operations.

---

The purpose of the laboratory is to answer questions such as:

> How does this algorithm work internally?

> Why does it have this complexity?

> What changes if the input size increases?

> What are the trade-offs between two implementations?

> When should one data structure be preferred over another?

---

## Implementation Philosophy

Implementations in this repository prioritize:

- Clarity
- Correctness
- Explicit algorithms
- Complexity analysis
- Testability
- Reproducibility
- Understanding over abstraction

Whenever possible, algorithms are implemented **from scratch** before relying on standard-library implementations.

The standard library may be used later for comparison and benchmarking.

---

## License

This project is licensed under the MIT License.

See [LICENSE](LICENSE) for details.

Copyright (c) 2025 Enzo R. L. D. Ribas
