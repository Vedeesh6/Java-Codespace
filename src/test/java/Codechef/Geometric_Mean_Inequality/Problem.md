# [Problem: Geometric Mean Inequality](https://www.codechef.com/problems/GMINEQ)

You are given an array A of length N containing the elements −1 and 1 only. Determine if it is possible to rearrange the array A in such a way that A<sub>i</sub> is not the geometric mean of A<sub>i−1</sub> and A<sub>i+1</sub>, for all i such that 2 ≤ i ≤ N−1.

Y is said to be the geometric mean of X and Z if Y<sup>2</sup> = X⋅Z.

## Input

- The first line contains a single integer T - the number of test cases. Then the test cases follow.
- The first line of each test case contains an integer N - the size of the array A.
- The second line of each test case contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>,…, A<sub>N</sub> denoting the array A.

## Constraints

- 1 ≤ T ≤ 200
- 3 ≤ N ≤ 1000
- A<sub>i</sub> ∈ {−1,1}

## Output

For each test case, output Yes if it is possible to rearrange A in such a way that A<sub>i</sub> is not the geometric mean of A<sub>i−1</sub> and A<sub>i+1</sub>, where 2 ≤ i ≤ N−1. Otherwise output No.

You may print each character of Yes and No in uppercase or lowercase (for example, yes, yEs, YES will be considered identical).

## Sample

- Input:
```
3
5
1 1 1 -1 -1
3
1 1 1
6
1 -1 -1 -1 -1 1
```

- Output:
```
Yes
No
Yes
```

## Explanation

- For case 1: We can rearrange the array A to [1,1,−1,−1,1]. One can see that (A<sub>i</sub>)A<sup>2</sup> != A<sub>i-1</sub>⋅A<sub>i+1</sub>, for any 2 ≤ i ≤ N−1.
- For case 2: None of the rearrangements of A satisy the given condition.
