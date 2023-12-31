# [Problem: Distribute Chocolates](https://my.newtonschool.co/playground/code/nhbyq1ezsdvr)

For your birthday, you have a list of N children, and you initially plan to give each of them A[i] chocolates. However, the children are not happy with this initial distribution. You want to redistribute the chocolates to meet the following criteria:

1. Each child must have at least one chocolate.
2. The difference in the number of chocolates between any pair of children should not exceed K.
<br>
Can you determine if it's possible to achieve this redistributed chocolate distribution for your birthday? Print "Yes" if it's possible, "No" otherwise.

## Input

Input consists of two lines:
- The first line contains two integers N and k.
- The second line contains N integers representing A[i], (1<=i<=n).

## Constraints

**1 <= N <= 10^5 <br>
0 <= K <= 100 <br>
0 <= A[i] <= 100**

## Output

Print "Yes" if it's possible to distribute the chocolates according to the given conditions, "No" otherwise.

## Sample

- Input:
```
5 2
7 0 1 4 2
```

- Output:
```
Yes
```

## Explanation

- For case 1: <br> **A possible redistribution satisfying all conditions is [2, 4, 2, 4, 2]. Note that all children have at least 1 chocolate and the maximum difference of chocolates between any two children is 2.**
