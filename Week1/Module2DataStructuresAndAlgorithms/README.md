# Week 1 theory based answers

## Exercise 1: Inventory Management System

### Understand the Problem

**Explain why data structures and algorithms are essential in handling large inventories.**

Efficient management of large inventories is vital for businesses. Data structures and algorithms are important for the following reasons:

- **Efficiency:** They allow quick operations like adding, updating, and searching for products, crucial as inventory size grows.
- **Scalability:** They help manage increasing data without significant performance loss.
- **Memory Management:** They optimize memory usage, ensuring the application remains responsive.
- **Maintainability:** Well-structured algorithms simplify code understanding, maintenance, and extension.
- **Reliability:** They maintain data integrity and consistency, vital for operations.

**Discuss the types of data structures suitable for this problem.**

Suitable data structures include HashMap, ArrayList, LinkedList, and TreeMap.

### Analysis

**Analyze the time complexity of each operation (add, update, delete) in your chosen data structure.**

- **HashMap:** 
  - Add: O(1) average, O(n) worst-case
  - Update: O(1) average
  - Delete: O(1) average

**Q2: Discuss how you can optimize these operations.**

Use a good hash function and maintain an appropriate load factor to minimize collisions and avoid frequent resizing.

## Exercise 2: E-commerce Platform Search Feature

### Understand Asymptotic Notation

**Explain Big O notation and how it helps in analyzing algorithms.**

Big O notation describes the worst-case time or space complexity, helping compare efficiency and scalability.

**Describe the best, average, and worst-case scenarios for search operations.**

- **Best-case:** O(1)
- **Average-case:** O(n) for linear search, O(log n) for binary search
- **Worst-case:** O(n) for linear search, O(log n) for binary search

### Analysis

**Compare the time complexity of linear and binary search algorithms.**

- **Linear Search:** 
  - Best-case: O(1)
  - Average-case: O(n)
  - Worst-case: O(n)

- **Binary Search:** 
  - Best-case: O(1)
  - Average-case: O(log n)
  - Worst-case: O(log n)

**Discuss which algorithm is more suitable for your platform and why.**

Binary search is more suitable for large, frequently queried datasets due to its O(log n) time complexity.

