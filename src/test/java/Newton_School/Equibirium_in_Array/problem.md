# [Problem: Equibirium in Array](https://my.newtonschool.co/playground/code/ix0o5csxkbtt)

You're given a binary array (1 based indexing) containing 0's and 1's. Your task is to determine whether an index K exists such that the sum of the elements till index K is same as that of the elements after K. <br>
**(i. e. a[1] + a[2] +. . a[k] = a[k+1] + a[k+2] +. . a[n] and 1 <= K <= n-1).**

## Input

The input consists of two lines:
- The first line contains an integer n, the size of array.
- The second line contains n integers (either '0' or '1').

## Constraints

**1 <= n <= 10<sup>6</sup>**

## Output

Print "Yes" if K exists, "No" otherwise.

## Sample

- Input:
```
5
1 0 0 1 0
```

- Output:
```
Yes
```

## Explanation

- For case 1: <br> **You can choose any of the indices among (1, 2, 3 ). Selecting any, would satisfy the condition.**
