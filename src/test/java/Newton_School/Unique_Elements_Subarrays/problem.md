# [Problem: Unique Elements Subarrays](https://my.newtonschool.co/playground/code/j8a6tpvvpsaq)

You are given an array nums consisting of positive integers. A subarray is a contiguous non- empty part of an array. We call a subarray interesting if the following condition is satisfied: Condition: The number of distinct elements in the subarray is equal to the number of distinct elements in the whole array. Determine the number of interesting subarrays in the given array.

## Input

Input consists of two lines:
- The first line contains an integer n — the size of the array.
- The second line contains n positive integers nums[0], nums[1], …, nums[n-1] (1 ≤ nums[i] ≤ 1000) — the elements of the array.

## Constraints

**1 ≤ n ≤ 10<sup>6</sup> <br>
0 ≤ nums[i] ≤ 10<sup>9</sup>**

## Output

Print an integer representing the number of interesting subarrays.

## Sample

- Input:
```
5
1 3 1 2 2
```

- Output:
```
4
```

## Explanation

- For case 1: <br> **Following are the interesting subarrays:
[1, 3, 1, 2]
[1, 3, 1, 2, 2]
[3, 1, 2]
[3, 1, 2, 2]
So the count is 4.**
