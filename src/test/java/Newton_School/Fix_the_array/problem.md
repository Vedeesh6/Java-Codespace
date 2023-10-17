# [Problem: Fix the array](https://my.newtonschool.co/playground/code/niubzhiqvhtj)

You are given an array a containing n integers, where a[i] represents the i- th element of the array. Your goal is to make this array balanced by removing some elements from the array. An array is considered balanced if and only if the absolute difference between any two consecutive elements is at most k. Determine how many minimum elements you need to remove to make the array balanced.

## Input

Input consists of 3 lines: 
- The first line contains an integer n — the number of elements in the array.
- The second line contains n integers where a[i] represents the i- th element of the array.
- The third line contains an integer k: the maximum absolute difference allowed between any two consecutive elements. 

## Constraints

**1 ≤ n ≤ 10<sup>5</sup> <br>
1 ≤ a[i] ≤ 10<sup>9</sup> <br>
1 ≤ k ≤ 10<sup>5</sup>**

## Output

Print the minimum number of elements you have to remove from the array to make it balanced.

## Sample

- Input:
```
5
1 2 4 5 6
1
```

- Output:
```
2
```

## Explanation

- For case 1: <br> **We can remove the first two elements resulting the array to be- [4, 5, 6] with the adjacent difference between numbers <= 1. | 4 - 5 | <= 1 and | 5 - 6 | <= 1.**
