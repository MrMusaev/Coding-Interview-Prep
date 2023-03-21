# Coding Interview Preparation Path
This repository collects coding questions (and answers) to prepare coding interviews. The questions categorised based on main topics like Data Structures, Recursion, Algorithms and Common Coding Interview Patterns. Each category includes subcategories covering main topics in this topic. Each question has difficulty level, company tags and a source link (whenever available)

**I've created the project to prepare coding interviews. I'm not an expert in this field (yet), so any contributions and improvements are welcome!**

### Structure 
1. [**Questions**](questions) - includes the *problem statement*, *relevant tags: difficulty, company and source link* (when available) to the most popular coding platforms. You can try to solve it yourself first or/and move to the solution description section
2. [**Methods**](methods) - this section provides one or multiple description of methods to solve the problems. It usually starts with the naive solution and goes into optimized ones. This basically helps to solve the problem before jumping into the solution and improves a **thinking process** (the most important part of coding interviews). Each solution description contains links to solutions in the end.
3. [**Solutions**](solutions) - this section contains the solutions to the problems in Java and Python. These two are probably the most demanded and the most loved languages in the industry, so I try to provide solutions in both of them. 

### Acknowledgements

- [Sherzod Obidov](https://sherxon.com) - a senior software engineer at Google from Uzbekistan, and this project is also inspired from his similar project [AlgoDS](https://github.com/sherxon/AlgoDS). Some questions are taken from this project
- [Educative.io](https://educative.io) - probably creators of the best courses for technical interviews preparation. Most questions are taken from their [Ace Java Coding Interview](https://www.educative.io/path/ace-java-coding-interview) Skill Path

### Stats (so far)
* Questions collected - 161
* Full description provided - 10
* Methods provided - 1
* Java solutions - 1
* Python solutions - 0

## Contents 

### Data Structures

#### 1. Array
1. [Remove even integers from an array](questions/datastructures/array/01-remove-even-integers.md) (*easy*)
2. [Find minimum/maximum value in the array](questions/datastructures/array/02-find-min-max-element.md) (*easy*)
3. [Reverse array](questions/datastructures/array/03-reverse-array.md) (*easy*)
4. [Contains duplicate](questions/datastructures/array/04-contains-duplicate.md) (*easy*)
5. [Merge two sorted arrays](questions/datastructures/array/05-merge-two-sorted-array.md) (*easy*)
6. [Find two numbers that add up to "n"](questions/datastructures/array/06-find-two-numbers-add-up-to-n.md) (*easy*)
7. [First non-repeating integer in array](questions/datastructures/array/07-first-non-repeating-integer.md) (*easy*)
8. [Find k-th minimum/maximum in array](questions/datastructures/array/08-find-kth-min-max-element.md) (*medium*)
9. [Find peak element](questions/datastructures/array/09-find-peak-element.md) (*medium*)
10. [Maximum sum subarray](questions/datastructures/array/10-maximum-subarray.md) (*medium*)
11. [Array of products except itself](questions/datastructures/array/11-products-except-itself.md) (*medium*)
12. [Right rotate the array by "n" index](questions/datastructures/array/12-right-left-rotate-array-the-array-n-index.md) (*medium*)
13. [Re-arrange positive and negative values](questions/datastructures/array/13-rearrange-positive-and-negative-values.md) (*medium*)
14. [Re-arrange sorted array in max/min form](questions/datastructures/array/14-rearrange-sorted-array-in-max-min-form.md) (*medium*)
15. [Shuffle an Array](questions/datastructures/array/15-shuffle-array.md) (*medium*)
16. [Find all duplicates in array](questions/datastructures/array/16-find-all-duplicates.md) (*medium*)
17. [Find Minimum in Rotated Sorted Array](questions/datastructures/array/17-find-minimum-rotated-sorted-array.md) (*medium*)
18. [Search in Rotated Array](questions/datastructures/array/18-search-in-rotated-array.md) (*medium*)
19. [Longest Increasing Subsequence](questions/datastructures/array/19-longest-increasing-subsequence.md) (*medium*)
20. [Rotate image / matrix](questions/datastructures/array/20-rotate-image-matrix.md) (*medium*)

#### 2. Linked List
1. Singly Linked List Implementation: addition, insertion, search, deletion (*easy*)
2. Length of Linked List: iterative and recursive (*easy*)
3. Doubly Linked List Implementation: addition, insertion, search, deletion (*easy*)
4. Find the Middle Node of a Linked List (*easy, medium*)
5. Remove duplicates from a Linked List (*easy*)
6. Union & Intersection of Two Linked Lists (*medium*)
7. Return / Remove the Nth node from end of SLL (*medium*)
8. Merge two sorted SLLs (*medium*)
9. Find Linked List Cycle (*medium*)
10. Check if DLL is palindrome (*medium*)
11. Merge k Sorted Lists (*hard*)

#### 3. Stack & Queue
1. Stack Implementation: push, pop, top, isEmpty (*easy*)
2. Queue Implementation: enqueue, dequeue, top, isEmpty, isFull (*easy*)
3. Generate Binary Numbers from 1 to n using a Queue 
4. Implement Two Stacks using one Array
5. Reversing the First k Elements of a Queue
6. Implement Queue using Stack 
7. Implement Stack using Queue
8. Sort the values in a Stack
9. Evaluate postfix expressions using a Stack
10. Next greater element using a Stack
11. Check for balanced parentheses using a Stack
12. Solve a celebrity problem using a Stack
13. Create a Stack where min() gives minimum in O(1) time

#### 4. Recursion (not DS, but better to learn here)
1. Sum of integers from 1 to n (*easy*)
2. Factorial of a number (*easy*)
3. Computing nth fibonacci number (*easy, medium*)
4. Power of a number (*easy*)
5. Check for Prime number (*easy*)
6. Greatest Common Divisor (*easy*)
7. Least Common Multiple (*easy*)
8. Decimal number to binary (*easy*)
9. Search value in a SLL (*easy*)
10. Reverse a string (*medium*)
11. Check if a string is palindrome (*medium*)
12. Print all permutations of a string (*medium*)
13. Tower of Hanoi (*medium*)

#### 5. Binary (Search) Tree
1. Binary Search Tree Implementation: insertion, search, deletion (*easy*)
2. Pre-order, In-order, Post-order traversal of Binary Tree (*easy*)
3. Find the height of a BT (*easy*)
4. Copy of BT (*easy*)
5. Find ancestors of a given node (*easy*)
6. Invert Binary Tree
7. Binary Tree left / right side view
8. Sum of left leaves 
9. Flatten BT to a Linked List
10. Symmetric tree 
11. Same tree
12. Balanced BT
13. Maximum and minimum depth of a BT
14. Sorted List to Balanced BST
15. Validate BST
16. Find the kth minimum/maximum value in a BST (*easy*)
17. Lowest common ancestor of BST 
18. Mode in BST
19. Most frequent subtree sum
20. Find the largest element in each row in BT

#### 6. Graph
1. Breadth First Search: BFS (*easy*)
2. Depth First Search: DFS (*easy*)
3. Cycle detection in a directed graph (*easy*)
4. Find "Mother Vertex" in a Directed Graph (*easy*)
5. Count the number of edges in an Undirected Graph (*easy*)
6. Check if a path exists between two vertices (*easy*)
7. Check if directed graph is Tree or not
8. Find the shortest path: Dijkstra
9. Find the shortest path: Bellman-Ford
10. Remove edge from a Directed Graph
11. Prim's Minimum Spanning Tree (MST) (*review*)
12. KrusKal's Minimum Spanning Tree (MST) (*review*)
13. Topological Sorting (*review*)
14. Is Graph connected (*review*)
15. Undirected Graph bridge detection (*review*)
16. A* heuristic path finding (*review*)

#### 7. Trie
1. Trie implementation: insertion, search, deletion
2. Total number of words in a Trie
3. Find all the words in a Trie
4. Sort the elements of an Array using a Trie
5. Word formation from a Given Dictionary using a Trie 

#### 8. Heap
1. Max Heap implementation (*easy*)
2. Min Heap implementation (*easy*)
3. Convert a Max-Heap to a Min-Heap
4. Find k the smallest elements in an Array
5. Find k the largest elements in an Array 

#### 9. Hash Table
1. Hash Table implementation: add, remove, search
2. Find whether an Array is a subset of another Array
3. Check if the given Arrays are disjoint
4. Find symmetric pairs in an Array
5. Trace the complete path of a journey
6. Find two pairs in an Array such that a + b = c + d
7. Find If a Subarray with a Sum Equal to 0 Exists
8. First Non-Repeating Integer in an Array
9. Remove Duplicate from a Linked List using Hashing
10. Union and Intersection of Lists using Hashing
11. Find Two Numbers that Add up to "n"

### Algorithms

#### 10. Search & Sort
1. Bubble Sort (*easy*)
2. Selection Sort (*easy*)
3. Insertion Sort (*easy*)
4. Counting Sort
5. Quick Sort (*medium*)
6. Merge Sort (*medium*)
7. Linear Search (*easy*)
8. Binary Search (*easy*)
9. Find two numbers that add up to "n" (*easy*)
10. Search in a rotated array (*easy*)
11. Find the Median of Two Sorted Arrays
12. Find duplicates in an Array
13. Search in Sorted Matrix (*medium*)
14. Count element occurrence
15. Search insertion position
16. Sparse search
17. Dutch national flag problem

#### 11. Greedy Algorithms
1. Make a change machine!
2. Connecting "n" pipes with minimum cost
3. Find the Egyptian fraction
4. Minimum number of platforms required for a train station
5. Find the largest number 

#### 12. Divide and Conquer
1. Euclidean algorithm
2. Peak element
3. Missing number in a sorted Array
4. Find the closest number
5. Shuffle integers
6. Collect coins in minimum steps
7. Merge a number of sorted arrays
8. Find the floor and ceiling of a number
9. Inversion count in an Array

#### 13. Dynamic Programming
1. Fibonacci series using Recursion
2. The 0/1 Knapsack Problem
3. Longest common substring
4. Shortest common super-sequence
5. Longest palindromic subsequence
6. The coin change problem 
7. Egg dropping problem
8. Strings interleaving
9. Edit distance problem

#### 14. Graph Algorithms
1. Calculate the number of nodes in a given graph level
2. Print the transpose of a Graph
3. Count the paths between two nodes
4. Check if a Graph is strongly connected
5. Print all the connected components in a Graph
6. Removing a giving edge
7. Check if a Graph is bipartite

### Coding Interview Patterns (*coming soon*)

#### 15. Sliding Window

#### 16. Two Pointers

#### 17. Fast and Slow Pointers

#### 18. Merge Intervals

#### 19. Linked List: In-place reversal

#### 20. Two Heaps

#### 21. K-way Merge

#### 22. Top K elements

#### 23. Modified Binary Search

#### 24. Subsets

#### 25. Greedy Techniques

#### 26. Backtracking

#### 27. Dynamic Programming II

#### 28. Cyclic Sort

#### 29. Topological Sort

#### 30. Stacks

#### 31. Tree Depth First Search

#### 32. Tree Breadth First Search

#### 33. Trie II

#### 34. Hash Map II

#### 35. Knowing What to Track

#### 36. Union Find

#### 37. Custom Data Structures

#### 38. Bitwise Manipulation

