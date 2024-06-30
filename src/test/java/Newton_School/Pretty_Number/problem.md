# [Problem: Pretty Number](https://my.newtonschool.co/playground/code/jzdpr3sdplb1)

Given a positive number, X. Find the largest Pretty Number that is smaller than or equal to X. 
Pretty Number: A number is called a Pretty Number if all adjacent digits in it differ by only 1. All single-digit numbers are considered Pretty Numbers. For example, 7, 8987, and 4343456 are Pretty numbers but 796, 677, and 89098 are not.<br>
NOTE: Input number X is very large.

## Input

There is a single line of input that will take an integer that represents number X.

## Constraints

**1 ≤ X ≤ 10^12**

## Output

Print a single integer representing the largest Pretty Number that is smaller than or equal to X.

## Sample

- Input:
```
10

50
```

- Output:
```
10

45
```

## Explanation

- For case 1: <br> **10 is the largest Jumping Number possible for X = 10.
The difference between adjacent digits of 10 is 1.** <br>
- For case 2: <br> **45 is the largest Jumping Number possible for X = 50.
The difference between adjacent digits of 45 is 1.**
