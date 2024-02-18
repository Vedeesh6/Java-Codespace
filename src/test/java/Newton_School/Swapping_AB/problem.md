# [Problem: Swapping AB](https://my.newtonschool.co/playground/code/ro4r5kll8qqv)

You are given a string s of length n which consists of characters A and B. You can do the following operation: <br>
A. Choose an index 1 ≤ i ≤ n−1 such that s[i] = A and s[i+1] = B. Then, swap s[i] and s[i+1].
(You are only allowed to do the operation at most once for each index 1 ≤ i ≤ n−1. However, you can do it in any order you want. )
<br>
Find the maximum number of operations that you can carry out.

## Input

Input consists of two lines:
First line contains an integer n : the size of string ( 1 <= n <= 10^5)
Second line contains the string s. (s[i] == A || s[i] == B, for each i)

## Output

Print an integer, the answer to the problem

## Sample

- Input:
```
4
AABB
```

- Output:
```
3
```

## Explanation

- For case 1: <br> **In this case, we can do an operation on i=2 to form ABAB, then another operation on i=3 to form ABBA, and finally another operation on i=1 to form BABA. Note that even though at the end, s2=A and s3=B, we cannot do an operation on i=2 again as we can only do the operation at most once for each index.**
