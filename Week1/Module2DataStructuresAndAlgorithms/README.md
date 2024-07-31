# Week 1 theory based answers

## Exercise 1: Inventory Management System

### 1.	Understand the Problem

**Q1: Explain why data structures and algorithms are essential in handling large inventories.**

Efficient management of large inventories is vital for businesses. Data structures and algorithms are important for the following reasons:

- **Efficiency:** They allow quick operations like adding, updating, and searching for products, crucial as inventory size grows.
- **Scalability:** They help manage increasing data without significant performance loss.
- **Memory Management:** They optimize memory usage, ensuring the application remains responsive.
- **Maintainability:** Well-structured algorithms simplify code understanding, maintenance, and extension.
- **Reliability:** They maintain data integrity and consistency, vital for operations.

**Q2: Discuss the types of data structures suitable for this problem.**

Suitable data structures include HashMap, ArrayList, LinkedList, and TreeMap.

### Analysis

**Q1: Analyze the time complexity of each operation (add, update, delete) in your chosen data structure.**

- **HashMap:** 
  - Add: O(1) average, O(n) worst-case
  - Update: O(1) average
  - Delete: O(1) average

**Q2: Discuss how you can optimize these operations.**

Use a good hash function and maintain an appropriate load factor to minimize collisions and avoid frequent resizing.