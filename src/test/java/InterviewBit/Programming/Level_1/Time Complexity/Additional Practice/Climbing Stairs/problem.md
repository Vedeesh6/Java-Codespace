# [Problem: Climbing Stairs](https://www.interviewbit.com/problems/climbing-stairs/)

Given an integer array **A** of length **N**. Where **A<sub>i</sub>** is the cost of stepping on the **i<sup>th</sup>** stair.
From **i<sup>th</sup>** stair, you can go to **i+1<sup>th</sup>** or **i+2<sup>th</sup>** numbered stair.
Initially, you are at **1<sup>st</sup>** stair find the minimum cost to reach **N<sup>th</sup>** stair.

## Input

The first and only argument is an integer array **A**.

## Constraints

**2 ≤ N ≤ 10<sup>5</sup>** <br>
**1 ≤ A<sub>i</sub> ≤ 10<sup>4</sup>**

## Output

Return an integer.

## Sample

- Input:
```
 A = [1, 2, 1, 3]
 A = [1, 2, 3, 4]
```

- Output:
```
5
7
```

## Explanation

- For case 1: **1 -> 3 -> 4** <br>
- For case 2: **1 -> 2 -> 4**
