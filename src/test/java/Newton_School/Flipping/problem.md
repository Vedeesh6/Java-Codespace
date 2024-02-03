# [Problem: Contest Time](https://my.newtonschool.co/playground/code/0vzuohqzxi2n)

You are given a string s of length n consisting of characters A and B. You are allowed to do the following operation:
- Choose an index 1 ≤ i ≤ n−1 such that s[i] = A and s[i+1] = B.
- Then, swap s[i] and s[i+1].
<br>
You are only allowed to do the operation at most once for each index 1 ≤ i ≤ n−1. However, you can do it in any order you want. Find the maximum number of operations that you can carry out.

## Input

Input consists of two lines -
- The first line of each test case contains a single integer n (2 ≤ n ≤ 105 ) — the length of string s.
- The second line of each test case contains the string s (s[i]=A or s[i]=B ).

## Output

Print a single integer containing the maximum number of operations that you can carry out.

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

- For case 1: <br> **we can do an operation on i=2 to form ABAB, then another operation on i=3 to form ABBA, and finally another operation on i=1 to form BABA.
Note that even though at the end, s[2]=A and s[3]=B, we cannot do an operation on i=2 again as we can only do the operation at most once for each index.**
