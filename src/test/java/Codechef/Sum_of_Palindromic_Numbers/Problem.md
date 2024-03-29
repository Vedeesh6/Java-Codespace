# [Problem: Sum of Palindromic Numbers](https://www.codechef.com/problems/SPALNUM)

A number is called palindromic if its decimal representation is a palindrome. You are given a range, described by a pair of integers L and R. Find the sum of all palindromic numbers lying in the range [L, R], inclusive of both the extrema.

## Input

- The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a pair of space separated integers L and R denoting the range for which you are required to find the sum of the palindromic numbers.

## Constraints

- 1 ≤ T ≤ 100
- 1 ≤ L ≤ R ≤ 10<sup>5</sup>

## Output

For each test case, output a single line containing the sum of all the palindromic numbers in the given range.

## Sample

- Input:
```
2
1 10
123 150
```

- Output:
```
45
272
```

## Explanation

- For case 1: The palindromic numbers between 1 and 10 are all numbers except the number 10. Their sum is 45.
- For case 2: The palindromic numbers between 123 and 150 are 131 and 141 and their sum is 272.
