# Java Algorithms

<p align='center'>
  <img src="https://user-images.githubusercontent.com/5893219/171964209-fef20d39-334c-4113-92f9-033ef284db91.png" />
</p>

# Table of contents

  - [Big O Notation](#big-o-notation)
  - [Data Structure](#data-structure)
  - [Array](#array)
  - [Hashtable](#hashtable)
  - [LinkedList](#linkedlist)
  - [Thanks and how to contribute](#thanks-and-how-to-contribute)

# Big O Notation

Big O notation is a **mathematical notation** that describes the limiting behavior of a function when the argument tends towards a particular value or infinity.

In computer science, big O notation is **used to classify algorithms according to how their run time (performance – time complexity) or space requirements (memory – spacial complexity) grow as the input size grows**.

Big O notation is **a way to measure how well a computer algorithm scales as the amount of data involved increases**.

> Ex: Array[10 elements] vs Array[10 thousand elements]

**It is not always a measure of speed but instead a measure of how well a computer algorithm scales**.

    (n = 1)  45n^3 + 20n^2 + 19 = 84
    (n = 2)  45n^3 + 20n^2 + 19 = 459 
    (n = 10) 45n^3 + 20n^2 + 19 = 47.019 (n is still a small number)
    (n = 10) 45n^3 = 45.000 => O(n^3) here the impact on performance grows

### *Why is Big O notation important?*

It is important to define the part of the algorithm that has the greatest affect ultimately on the final answer.

### *The notations are:*

| Name                | Notation    |
| ------------------- | ----------- |
| - Constant Time     | O(1)        |
| - Logarithmic Time  | O(log n)    |
| - Linear Time       | O(n)        |
| - Linearithmic Time | O(n log n)  |
| - Quadric Time      | O(n²)       |
| - Cubic Time        | O(n³)       |
| - Exponencial Time  | O(b^n), b> 1|
| - Factorial Time    | O(n!)       |

We always wanna shoot for EXCELLENT, if not possible shoot for GOOD, if not possible shoot for FAIR and so on…

| Excellent/Good    | Fair      | Bad           | Horrible      |
| ----------------- | --------- | ------------- | ------------- |
| O(1)              | O(n)      | O(n log n)    | O(n^2)        |
| O(log n)          |           |               | O(2^n)        |
|                   |           |               | O(n!)         |

## Time Complexity

It is how long a program takes to process a given input. It is defined as the number of times a particular instruction set is executed rather than the total time is taken. It is because the total time took also depends on some external factors like the compiler used, processor’s speed, etc. 

## Space Complexity

The space complexity of an algorithm or a computer program is the amount of memory space required to solve an instance of the computational problem as a function of characteristics of the input. It is the memory required by an algorithm until it executes completely. (Wikipedia)

### *What makes space complexity increase?*

assigning variables
creating new data structures
function calling and allocation (if we create things with the function being called).

# Data Structure

### *What is a data structure?*

- A data structure (DS) is **a way to store and organize data in a computer, so that it can be used efficiently**.

- A data structure is **a data organization, management, and storage format that enables efficient access and modification**. 
  
- More precisely, a data structure is **a collection of data values, the relationships among them, and the functions or operations that can be applied to the data**.

- **Methods and techniques used to maintain (handle and storage) data in an organized fashion**. Define data dependency and relationships.

# Array

### *When and where is a static Array used?*

- Storing and accessing sequential data
- Temporarily storing objects
- Used by IO routines as buffers
- Lookup tables and inverse lookup tables
- Can be used to return multiple values from a function
- Used in dynamic programming to cache answres to subproblems

# Hashtable

- The Hashtable class implements a hash table, which maps keys to values.
- Any non-null object can be used as a key or as a value.
- To successfully store and retrieve objects from a hashtable, the objects used as keys must implement the hashCode method and the equals method.
- Hashtables are often used to track item frequencis. For instance, counting number of times a word appears in a given text.

### *Features of Hashtable:*

- It is **similar to HashMap**, but is synchronized.
- Hashtable stores key/value pair in hash table.
- **In Hashtable we specify an object that is used as a key, and the value we want to associate to that key. The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table**.
- The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
HashMap doesn’t provide any Enumeration, while Hashtable provides not fail-fast Enumeration.

# LinkedList

A linked list is a **linear data structure**, in which the **elements are not stored at contiguous memory locations**. The elements in a linked list are linked using pointers. 

It consists of individual enteties called **nodes that have the acpability to connect other nodes and create a chain**.

Three types:

1. Singly Linked List
2. Doubly Linked List
3. Circular Linked List

# Thanks and how to contribute

Hello there!

This repo will be always under construction!

It serves as a personal lab for practicing the power of JAVA. Definitely a quick access place for my references.

It also consists basically of isolated classes and focuses fundamentally on algorithms that implement the several data structure operations. 

Here there are my codes and also other people's codes that temporarily serve as guidelines until I can implement and improve my programming.

You are welcome to collaborate if you wish.

Feel free to grab some code that might interest you.

Thanks for stopping by!

<p align='center'>
  <img src="https://img.shields.io/badge/Jakarta-Java-007396?style=for-the-badge&logo=java&logoColor=white" />&nbsp;&nbsp;
  <img src="https://img.shields.io/badge/IDE-VS%20Code-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white" />&nbsp;&nbsp; 
</p>

<!-- FOOTER (Author / Visit My Online Resume / Download My PDF Resume) -->
<hr>
<p align='center'>
  <a href="#"><img
      src="https://img.shields.io/badge/author-%C2%A9%20Siomara%20Cintia%20Pantarotto.%20All%20rights%20reserved.-008080?style=social"></a>&nbsp;&nbsp;
  <a href="https://siomara.com.br/"><img
      src="https://img.shields.io/badge/visit-My Online Resume-008080?style=social"></a>&nbsp;&nbsp;
  <a href="https://siomara.com.br/ResumePANTAROTTO.pdf"><img
      src="https://img.shields.io/badge/download-My PDF Resume-008080?style=social"></a>
</p>
