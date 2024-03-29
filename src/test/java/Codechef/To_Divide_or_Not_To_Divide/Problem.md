# [Problem: To Divide or Not To Divide](https://www.codechef.com/problems/DIVAB)

Alice likes all the numbers which are divisible by A. Bob does not like the numbers which are divisible by B and likes all the remaining numbers. Determine the smallest number greater than or equal to N which is liked by both Alice and Bob. Output -1 if no such number exists.

## Input

- The first line contains a single integer T — the number of test cases. Then the test cases follow.
- The first and only line of each test case contains three space-separated integers A, B and N — the parameters mentioned in the problem statment.

## Constraints

- 1 ≤ T ≤ 1000
- 1 ≤ A, B, N ≤ 10<sup>9</sup>

## Output

For each test case, output the smallest number ≥ N which is divisible by A and is not divisible by B. Output −1 if no such number exists.

## Sample

- Input:
```
3
5 2 11
4 3 24
7 7 100
```

- Output:
```
15
28
-1
```

## Explanation

- For case 1: 15 is the smallest number ≥ 11 which is divisible by 5 and is not divisible by 2. 
- For case 2: 28 is the smallest number ≥ 24 which is divisible by 4 and is not divisible by 3.
- For case 3: There does not exist any number which is divisible by A=7 and is not divisible by B=7.
