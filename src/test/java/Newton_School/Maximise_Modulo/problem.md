# [Problem: Maximise Modulo](https://my.newtonschool.co/playground/code/v0ixa6jazsma)

You are given two integers **l and r, l ≤ r**. Find the largest possible value of **a mod b** over all pairs **(a, b)** of integers for which **r ≥ a ≥ b ≥ l**. <br>
As a reminder, **a mod b** is the remainder we get when dividing a by b. For example, **26 mod 8 = 2**.

## Input

The input consists of two space- separated integers l and r.

## Constraints

**1 ≤ l ≤ r ≤ 10<sup>9</sup>**

## Output

Print the largest possible value of **a mod b** over all pairs **(a, b)** of integers for which **r ≥ a ≥ b ≥ l**.

## Sample

- Input:
```
1 1
8 26
```

- Output:
```
0
12
```

## Explanation

- For case 1: <br> **1 % 1 = 0** <br>
- For case 2: <br> **26 % 13 = 0**
