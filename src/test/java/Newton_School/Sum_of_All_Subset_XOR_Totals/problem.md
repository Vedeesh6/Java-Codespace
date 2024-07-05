# [Problem: Sum of All Subset XOR Totals](https://my.newtonschool.co/playground/code/1v6ulpvx968v)

The XOR total of an array is defined as the bitwise XOR of all its elements, or 0 if the array is empty.
For example, the XOR total of the array [2,5,6] is 2 XOR 5 XOR 6 = 1.
Given an array nums, return the sum of all XOR totals for every subset of nums. 
Note: Subsets with the same elements should be counted multiple times.
An array a is a subset of an array b if a can be obtained from b by deleting some (possibly zero) elements of b.

## Input

There are two lines of input:
- The first line of input will take an integer representing the size of array nums.
- The second line of input will take n space-separated integers representing the elements of the array.

## Constraints

**1 ≤ nums.length ≤ 12 <br>
1 ≤ nums[i] ≤ 20** 

## Output

Print a single integer that represents the sum of all XOR totals for every subset of nums.

## Sample

- Input:
```
2
1 3

3
5 1 6
```

- Output:
```
6

28
```

## Explanation

- For case 1: <br> **The 4 subsets of [1,3] are: The empty subset has an XOR total of 0. [1] has an XOR total of 1. [3] has an XOR total of 3. [1,3] has an XOR total of 1 XOR 3 = 2. 0 + 1 + 3 + 2 = 6** <br>
- For case 2: <br> **The 8 subsets of [5,1,6] are: The empty subset has an XOR total of 0.
  [5] has an XOR total of 5.
  [1] has an XOR total of 1.
  [6] has an XOR total of 6.
  [5,1] has an XOR total of 5 XOR 1 = 4.
  [5,6] has an XOR total of 5 XOR 6 = 3.
  [1,6] has an XOR total of 1 XOR 6 = 7.
  [5,1,6] has an XOR total of 5 XOR 1 XOR 6 = 2.
0 + 5 + 1 + 6 + 4 + 3 + 7 + 2 = 28**
