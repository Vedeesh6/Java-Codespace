# [Problem: Contest Time](https://my.newtonschool.co/playground/code/0vzuohqzxi2n)

Given an integer **n**, find the maximum value of integer **k** such that the following condition holds:
**n & (n−1) & (n−2) & (n−3) &. . (k) = 0** where **&** denotes the bitwise AND operation.

## Input

The input consists of an integer N.

## Constraints

**1 ≤ N ≤ 10<sup>9</sup>**

## Output

Output a single integer — the required integer **k**.

## Sample

- Input:
```
2
17
```

- Output:
```
1
15
```

## Explanation

- For case 1: **2 & 1 => 10 & 01 => 00 => 0** <br>
- For case 2: **17 & 16 & 15 => 10001 & 10000 & 01111 => 00000 => 0**
