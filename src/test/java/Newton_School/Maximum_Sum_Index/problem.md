# [Problem: Maximum Sum Index](https://my.newtonschool.co/playground/code/0kq3cd9zpt64)

You are given an integer array 'nums' of size n. For each index i, you need to calculate the sum of all elements in the array except the element at index i. Your task is to find the index that has the maximum sum of its elements. If there are multiple indices with the same maximum sum, print the smallest index among them. ( Assume 1 based indexing)

## Input

Input consists of two lines:
- The first line contains an integer n — the size of the array.
- The second line contains n positive integers nums[0], nums[1], …, nums[n-1] (1 ≤ nums[i] ≤ 1000) — the elements of the array.

## Constraints

**1 ≤ n ≤ 10<sup>6</sup> <br>
0 ≤ nums[i] ≤ 10<sup>9</sup>**

## Output

Output a single integer, the index (1- based) that has the maximum sum of its elements.

## Sample

- Input:
```
6
1 3 1 2 2 3
```

- Output:
```
1
```

## Explanation

- For case 1: <br> **The sums for each index will be:
[11, 9, 11, 10, 10, 9]
Maximum sum is 11, and the indices are 1 and 3. Hence the output is 1.**
