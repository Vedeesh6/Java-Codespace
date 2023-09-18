# [Problem: Parity Puzzle](https://my.newtonschool.co/playground/code/zadd3qeuo4tr)

You are given an array of integers. Your task is to determine whether it's possible to divide the array into two non- empty sets such that the sum of each set has the same parity.

## Input

The input consists of two lines:

- The first line contains an integer n, the size of array.
- The second line contains n integers, the elements of array.

## Constraints

**1 <= n <= 10<sup>5</sup> <br>
1 <= array[i] <= 10<sup>6</sup>**

## Output

Print "Yes" if it's possible to divide the array into two sets with the same parity sum, and "No" otherwise.

## Sample

- Input:
```
8
1 2 4 3 2 3 5 4
```

- Output:
```
Yes
```

## Explanation

- For case 1: <br> **Put (1, 3, 3, 5) in one part and (2, 4, 2, 4) in other part. Thus both the parts have an even sum.**
