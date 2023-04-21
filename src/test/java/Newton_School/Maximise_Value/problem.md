# [Problem: Maximise Value](https://my.newtonschool.co/playground/code/v7eh8byp28rk)

You are given n integers **a<sub>1</sub>, a<sub>2</sub>, …, a<sub>n</sub>**. Find the maximum value of **max(a<sub>l</sub>, a<sub>l+1</sub>, …, a<sub>r</sub>) * min(a<sub>l</sub>, a<sub>l+1</sub>, …, a<sub>r</sub>)** over all pairs **(l, r)** of integers for which **1 ≤ l < r ≤ n**.

## Input

The first line of input contains a single integer **n**. The second line of each test case contains n integers **a<sub>1</sub>, a<sub>2</sub>, …, a<sub>n</sub>**.

## Constraints

**2 ≤ n ≤ 10<sup>5</sup>** <br>
**1 ≤ a<sub>i</sub> ≤ 10<sup>6</sup>**

## Output

Print a single integer denoting the maximum possible value of the product from the statement.

## Sample

- Input:
```
3
2 4 3

4
3 2 3 1
```

- Output:
```
12
6
```
