# [Problem: Villages and Tribes](https://www.codechef.com/problems/VILTRIBE)

There are n villages in a line in an area. There are two kinds of tribes A and B that reside there. A village can be either empty or occupied by one of the tribes. An empty village is said to be controlled by a tribe of village A if it is surrounded by villages of tribes A from the left and from the right. Same goes for the tribe B.

Find out the number of villages that are either occupied by or controlled by tribes A and B, respectively.

## Input

- The first line of the input contains an integer T denoting the number of test cases.
- The first line of the input contains a string s denoting the configuration of the villages, each character of which can be 'A', 'B' or '.'.

## Constraints

- 1 ≤ T ≤ 20
- 1 ≤ |s| ≤ 10<sup>5</sup>

## Output

For each test case, output two space-separated integers denoting the number of villages either occupied by or controlled by tribe A and B, respectively.

## Sample

- Input:
```
4
A..A..B...B
..A..
A....A
..B..B..B..
```

- Output:
```
4 5
1 0
6 0
0 7
```
