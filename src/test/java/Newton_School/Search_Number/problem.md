# [Problem: Search Number](https://my.newtonschool.co/playground/code/m5h1twsu431w)

Given an integer N, You need to find the Nth smallest number which only contains odd digits i.e. 1, 3, 5, 7, 9 means no even digits are allowed on that number (12 will not be considered). For example, the starting numbers which only contain odd digits are 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 31, 33, 35 and so on.

## Input

There is a single line of input that takes an integer as input representing N.

## Constraints

**1 ≤ N ≤ 10^12**

## Output

Print a single integer representing the Nth smallest number which only contains odd digits.

## Sample

- Input:
```
3

5
```

- Output:
```
13

35
```

## Explanation

- For case 1: <br> **N=3
The first three numbers are 1, 3, 5.
Here 5 is the 3rd number, which contains only odd digits.** <br>
- For case 2: <br> **N=13
The first 13 numbers are 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 31, 33, 35 where 35 is the answer.**
