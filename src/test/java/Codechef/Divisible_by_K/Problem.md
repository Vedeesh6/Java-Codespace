# [Problem: Divisible by K](https://www.codechef.com/problems/DIVBYK)

You are given an array A consisting of N positive integers and a positive integer K.

Find whether there exists a subset S of the elements of A such that the product of all elements of S is divisible by K.

Note that a subset is obtained by deleting some or no elements without changing the order of the remaining elements.

## Input

- The first line of input will contain a single integer T, denoting the number of test cases.
- Each test case consists of multiple lines of input.
  - The first line of each test case contains two space-separated integers N and K — the number of elements of A and the above mentioned integer K.
  - The second line of each test case contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>,...., A<sub>N</sub> representing the array A.

## Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 100
- 1 ≤ A<sub>i</sub>,K ≤ 10<sup>9</sup>

## Output

For each test case, print on a new line the answer: YES if there exists a subset S and NO otherwise.

Each character of the output may be printed in either uppercase or lowercase, i.e, the strings Yes, YES, yes, yEs` will all be treated as identical.

## Sample

- Input:
```
3
2 2
7 8
5 3
1 1 2 1 1
3 6
7 2 3
```

- Output:
```
YES
NO
YES
```

## Explanation

- For case 1: Consider the subset S=[8]. The product of all the elements is 8 which is divisible by K=2.
- For case 2: There exists no subset of A such that the product of all elements of the subset is divisible by K.
