# [Problem: Possible GCD](https://www.codechef.com/problems/DISTGCD)

Chef has two distinct positive integers A and B.

Chef wonders how many distinct values are possible for the expression gcd(A+X,B+X), where X can take any non-negative integer value.

Help Chef find this value.

Here, gcd stands for Greatest Common Divisor.

## Input

- The first line contains a single integer T — the number of test cases. Then the test cases follow.
- The first and only line of each test case contains two distinct space separated integers A and B.

## Constraints

- 1 ≤ T ≤ 1000
- 1 ≤ A, B ≤ 10<sup>9</sup>
- A ≠ B

## Output

For each testcase, output the number of distinct values of the expression gcd(A+X,B+X), where X can take any non-negative integer value.

## Sample

- Input:
```
2
1 2
12 8
```

- Output:
```
1
3
```

## Explanation

- For case 1: Here gcd(1+X,2+X)=1 no matter what value of X you choose.
- For case 2:
  - If we take X=0, gcd(12,8) = 4.
  - If we take X=1, gcd(13,9) = 1.
  - If we take X=2, gcd(14,10) = 2. <br/>
It can be shown that no other value of gcd is possible.

