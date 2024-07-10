# [Problem: Divide number](https://my.newtonschool.co/playground/code/v6ifukqvuq2o)

Given a really large number N, break it into 3 whole numbers such that they sum up to the original number and find the number of ways to do so. Since this number can be very large, return its modulo with 10^9+7. 

## Input

There is a single line of input that takes an integer as input representing N.

## Constraints

**1 ≤ N ≤ 10^9**

## Output

Print an integer representing the number of ways to divide a number into three whole numbers that sum up to the original number.
**NOTE: Since this number can be very large, return its modulo with 10^9+7.**

## Sample

- Input:
```
2

3
```

- Output:
```
6

10
```

## Explanation

- For case 1: <br> **N = 2
Possible ways to break the number:
0 + 0 + 2 = 2
0 + 2 + 0 = 2
2 + 0 + 0 = 2
0 + 1 + 1 = 2
1 + 1 + 0 = 2
1 + 0 + 1 = ** <br>
- For case 2: <br> **N = 3
Possible ways to break the number:
0+0+3 = 3
0+3+0 = 3
3+0+0 = 3
0+1+2 = 3
0+2+1 = 3
1+0+2 = 3
1+2+0 = 3
2+0+1 = 3
2+1+0 = 3
1+1+1 = 3**
