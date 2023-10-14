# [Problem: Average Permutation](https://www.codechef.com/problems/AVGPERM)

You are given an integer N.
Find a permutation P=[P<sub>1</sub>.P<sub>2</sub>, ...,P<sub>N</sub>] of the integers {1,2,…,N} such that sum of averages of all consecutive triplets is minimized, i.e. <br>
<sup>N-2</sup>∑<sub>i-1</sub>[(P<sub>i</sub>+P<sub>i+1</sub>+P<sub>i+2</sub>)/3] is minimized. <br>
If multiple permutations are possible, print any of them.

## Input

- The first line of input will contain a single integer T, denoting the number of test cases.
- The first and only line of each test case contains an integer N, the size of the permutation.

## Constraints

- 1 ≤ T ≤ 1000
- 3 ≤ N ≤ 10<sup>5</sup> 
- The sum of N over all test cases won't exceed 3⋅10<sup>5</sup>.

## Output

For each test case, output on a new line a permutation which satisfies the above conditions.

## Sample

- Input:
```
2
4
3
```

- Output:
```
3 2 1 4
3 2 1
```
