# [Problem: Maximum Diagonal Sum](https://my.newtonschool.co/playground/code/wxorssvgfgsp)

You are given the size of an n x n matrix. You have the option to replace at most k 0's in the matrix with 1's. Your task is to find the maximum diagonal sum (Both diagnoals) you can achieve by making optimal replacements.

## Input

Input consists of two lines:
- An integer n (2 ≤ n ≤ 10<sup>6</sup>) — the size of the n x n matrix.
- An integer k (0 ≤ k ≤ 10<sup>9</sup>) — the maximum number of replacements allowed.

## Output

Print the maximum diagonal sum achievable by making at most k replacements.

## Sample

- Input:
```
63
45
100
```

- Output:
```
22:03
21:45
22:40
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
**The sum of diagonals = 0;
<br>
After replacing the 0's of diagonals with 1's**
```
1 0 0 0 1
0 1 0 1 0
0 0 1 0 0
0 1 0 1 0
0 0 0 0 1
```
**we can maximum do 8 replacements. so- The sum of the main diagonal = 5 and The sum of the other diagonal = 4 <br>
Total sum = (5 +4 -1) = 8**
