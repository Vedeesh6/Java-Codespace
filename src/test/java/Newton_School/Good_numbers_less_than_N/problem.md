# [Problem: Good numbers less than N](https://my.newtonschool.co/playground/code/6enq1tyh5irg)

You are given an integer **N**. You have to find the number of integers less than equal to **N** that are good. <br>
A number **x** is said to be good if **F(x+1) < F(x)**, where **F(x)= the sum of digits of x**. For example **F(14)=5, F(7)=7.**

## Input

The first line contains a single integer **N**.

## Constraints

**1 ≤ N ≤ 10<sup>9</sup>**

## Output

Print the number of good integers less than equal to **N**.

## Sample

- Input:
```
9
5
```

- Output:
```
1
0
```

## Explanation

- For case 1: <br> **Only 9 is a good number, as F(9+1) = F(10) = 1 < F(9) = 9** <br>
- For case 2: <br> **There are no good numbers less than or equal to 5.**
