# [Problem: Maximum adjacent product II](https://my.newtonschool.co/playground/code/px90yrpo5hrx)

Given an array of integers, you have the freedom to rearrange its elements as you wish. Your goal is to determine the maximum product achievable from a pair of adjacent numbers in the modified array.

## Input

The first line of the input contains a single integer n, representing the length of array. <br>
The second line of the input contains n space separated integers, representing the elements of array

## Constraints

**2 ≤ n ≤ 10<sup>5</sup> <br>
-1000 ≤ A[i] ≤ 1000**

## Output

Print an integer representing the maximum product of adjacent pair of numbers in the array.

## Sample

- Input:
```
4
3 5 4 7
```

- Output:
```
35
```

## Explanation

- For case 1: <br> **We can rearrange the array as following :
[3, 4, 5, 7]
The products of adjacent numbers are:
[3*4, 4*5, 5*7], which is
[12, 20, 35]
Hence, the maximum product is 35.**
