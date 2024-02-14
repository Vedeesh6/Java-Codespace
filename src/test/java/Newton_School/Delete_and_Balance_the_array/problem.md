# [Problem: Delete and Balance the array](https://my.newtonschool.co/playground/code/td60f0o9dlv3)

You are given an array `a` containing n integer. Your goal is to make this array balanced by removing some elements from the array. You can also rearrange the elements of the array. An array is considered balanced if and only if the absolute difference between any two consecutive elements is at most k. Your task is to delete minimum possible numbers from the array to make it balanced. Find the count of deleted numbers.

## Input

Input consists of 3 lines:
- The first line contains an integer n — the number of elements in the array
- The second line contains n integers where a[i] represents the i- th element of the array
- The third line contains an integer k: the maximum absolute difference allowed between any two consecutive elements.

## Constraints

**1 ≤ n ≤ 10^5
1 ≤ a[i] ≤ 10^9
1 ≤ k ≤ 10^5**

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
