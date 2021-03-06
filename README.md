# Scala Code Training

This repo aims to contain different algorithms and quizzes requested by several sources like Hacker Rank 
or coding interviews. Algorithm are analyzed in Big O notation describing the limiting behaviour of a function both 
runtime and space.

## Strings

### isPalindrome

Write an efficient algorithm to check if a string is a palindrome. A string is a palindrome if the string
matches the reverse of string.

 - Assumptions: if (input.isEmpty || input.length == 1) input is a palindrome

 - Big O

   - Runtime: O(N/2) (here we should avoid constant deletion, however O(N/2) is much better than O(N))  
   
   - Space: O(1) because it does not need extra space in runtime

## Arrays

### findKcomplementary

Write an efficient algorithm to find K-complementary pairs in a given array of integers. Given Array
A, pair (i, j) is K- complementary if K = A[i] + A[j]
 
 - Assumptions: given array can contains negative numbers and duplicate elements as countable in the result.

 - Big O
 
   - Runtime: O(N LogN) for sorting + O(N) for looping over elements. Therefor it is equals to O(N Log N) 

   - Space: O(N) for sorting

   **Note**: For a better runtime performance, implement this algorithm with HashMap and O (N), click in this
   [link](https://thecodebutchery.com/2015/03/29/codility-and-the-k-complementary-pairs-in-array-challenge/) 
   
## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing 
purposes. See deployment for notes on how to deploy the project on a live system.


To get the code:
-------------------

Clone the repository:

    $ git clone https://github.com/javigs82/scala-code-training.git


## Prerequisites

What things you need to install the software and how to install them
* [IntelliJ IDEA](https://www.jetbrains.com/idea/)
* JDK 1.8
* Scala
* STB

## Installing

A step by step series of examples that tell you have to get a development env running

```
sbt clean
```
```
sbt compile
```
```
sbt dist
```

## Running the tests

Explain how to run the automated tests for this system

```
sbt test
```

## Deployment

Add additional notes about how to deploy this on a live system choosing your preferred options
```
sbt run
```

## References

 - [why-collections-sort-uses-merge-sort-instead-of-quicksort](https://stackoverflow.com/questions/15154158/why-collections-sort-uses-merge-sort-instead-of-quicksort)
 
## Author
 
 * javigs82 [github](https://github.com/javigs82/)
 
## License
 
 This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details