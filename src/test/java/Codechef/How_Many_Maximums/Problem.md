# [Problem: How Many Maximums](https://www.codechef.com/problems/HOWMANYMAX)

From an array A containing N integers, you construct a binary string S of length (N−1) as follows. <br>
For all 1 ≤ i < N: <br>
If A<sub>i</sub> < A<sub>i+1</sub> then S<sub>i</sub>=0. <br>
If A<sub>i</sub> > A<sub>i+1</sub> then S<sub>i</sub>=1. <br>
Given the string S, determine the count of indices (1≤i≤N) such that it is possible for A<sub>i</sub> to be the maximum element of the array A.

## Input

- The first line contains a single integer T — the number of test cases. Then the test cases follow.
- The first line of each test case contains an integer N — the size of the array A.
- The second line of each test case contains the binary string S of length (N−1) containing 0s and 1s only.

## Constraints

- 1 ≤ T ≤ 10<sup>5</sup>
- 2 ≤ N ≤ 10<sup>5</sup>
- Sum of N over all test cases does not exceed 10<sup>5</sup>.

## Output

For each test case, output the count of indices (1≤i≤N) such that it is possible for A<sub>i</sub> to be the maximum element of the array A.

## Sample

- Input:
```
3
2
0
7
000111
6
11100
```

- Output:
```
1
1
2
```

## Explanation

- For case 1: Here A<sub>1</sub> < A<sub>2</sub>. Therefore clearly only A<sub>2</sub> can be the maximum element of A. <br>
- For case 2: Here A<sub>1</sub><A<sub>2</sub>, A<sub>2</sub><A<sub>3</sub>, A<sub>3</sub><A<sub>4</sub>, A<sub>4</sub>>A<sub>5</sub>, A<sub>5</sub>>A<sub>6</sub>, and A<sub>6</sub>>A<sub>7</sub>. Therefore, clearly only A<sub>4</sub> can be the maximum element of A.
