# [Problem: Maximum value](https://my.newtonschool.co/playground/code/blr6fpgmlb80)

You are given a matrix of  size n x n initially all filled with 0. You can replace at most k 0's in the matrix with 1's. Your task is to find the maximum diagonal sum (Both diagonals).

## Input

Input consists of one line:
- An integer n (2 ≤ n ≤ 10^6) — the size of the n x n matrix.
- An integer k (0 ≤ k ≤ 10^9) — the maximum number of replacements allowed.

## Output

Print the maximum diagonal sum achievable by making at most k replacements.

## Sample

- Input:
```
5 8
```

- Output:
```
8
```

## Explanation

- For case 1: <br> **Initially the matrix looks like:**
```
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
```
The sum of diagonals = 0;<br>
After replacing the 0's of diagonals with 1's
```
1 0 0 0 1
0 1 0 1 0
0 0 1 0 0
0 1 0 1 0
0 0 0 0 1
```
**we can maximum do 8 replacements. so-
The sum of the main diagonal = 5
The sum of the other diagonal = 4
Total sum = (5 +4 -1) = 8**
