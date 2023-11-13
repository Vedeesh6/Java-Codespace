# [Problem: Separate Digits](https://my.newtonschool.co/playground/code/qtmc5t2y54v0)

You are given an array of positive integers, nums. Your task is to create a list, answer, that contains all the digits of each integer in nums, separated and combined together in the same order they appear in nums.
<br>
To separate the digits of an integer, you need to extract all the digits it has and place them together in the same order. Print a list containing all the digits of each integer, separated and combined in the same order.

## Input

Input consists of two lines:
- The first line contains an integer n — the size of the array.
- The second line contains n positive integers nums[0], nums[1], …, nums[n-1] — the elements of the array.

## Constraints

**1 ≤ n ≤ 10<sup>6</sup> <br>
0 ≤ nums[i] ≤ 10<sup>9</sup>**

## Output

Print a list of integers, answer, where answer contains all the digits of nums combined together in the same order separated by a space.

## Sample

- Input:
```
3
123 456 789
```

- Output:
```
1 2 3 4 5 6 7 8 9
```

## Explanation

- For case 1: <br> **Make 123 as 1, 2, 3
and 456 as 4, 5, 6
and 789 as 7, 8, 9.
Hence the output is [ 1, 2, 3, 4, 5, 6, 7, 8, 9]**
