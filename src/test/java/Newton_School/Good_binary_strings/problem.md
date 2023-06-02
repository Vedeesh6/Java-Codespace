# [Problem: Good binary strings](https://my.newtonschool.co/playground/code/mohqr52bish5)

There are **N** binary strings consisting of only **0's and 1's**. A pair of strings is considered "good" if they share at least one common character. <br>
The task is to determine the count of good pairs of strings. <br>
**Note: The common character in two strings may or may not be at same index.**

## Input

The first line contains an integer **T** denoting the number of test cases. <br>
The first line of each test case contains an integer **N** denoting the number of strings on the table. Next **N** lines of each test case contain the strings present on the table.

## Constraints

**1 ≤ T ≤ 10<sup>4</sup> <br>
1 ≤ N ≤ 10<sup>5</sup> <br>
1 ≤ length of string ≤ 5**

## Output

For each test case print an integer denoting the total pair of "good" strings in a single line.

## Sample

- Input:
```
2
3
11
00
00000
5
01
1111
0001
11
01
```

- Output:
```
1
10
```

## Explanation

- For case 1: <br> **Strings 2 and 3 have the character 0 in common** <br>
- For case 2: <br> **All strings have 1 in common so the answer is the number of pairs, which is 10**
