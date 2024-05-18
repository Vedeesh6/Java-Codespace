# [Problem: Pair Pain](https://www.codechef.com/problems/PAIRPAIN)

You are given an array A containing N positive integers. Find the number of pairs (i,j) such that 1 ≤ i < j ≤ N and: A<sub>i</sub>+A<sub>j</sub> ≥ A<sub>i</sub>*A<sub>j</sub>

## Input

- The first line contains an integer T denoting the number of test cases. The T test cases then follow.
- The first line of each test case contains an integer N.
- The second line of each test case contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>,...., A<sub>n</sub>.

## Constraints

- 1 ≤ T ≤ 1000
- 2 ≤ N ≤ 2⋅10<sup>5</sup>
- 1 ≤ A<sub>i</sub> ≤ 10<sup>6</sup>
- Sum of N over all cases won't exceed 2⋅10<sup>5</sup>

## Output

For each test case, output on a new line the required answer.

## Sample

- Input:
```
2
3
1 3 4
5
2 3 4 5 6
```

- Output:
```
2
0
```
