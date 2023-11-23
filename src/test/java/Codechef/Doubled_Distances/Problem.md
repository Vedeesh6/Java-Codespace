# [Problem: Doubled Distances](https://www.codechef.com/problems/DOUBLEDDIST)

You are given N integers {A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>}. Determine whether they can be reordered such that each pair of consecutive differences differ by a factor of 2.

Formally, determine whether there exists a rearrangement of the given integers into an array 
[B<sub>1</sub>, B<sub>2</sub>, ..., B<sub>N</sub>] such that, for each 2 ≤ i ≤ N−1, at least one of the following two conditions holds:
- B<sub>i</sub> − B<sub>i−1</sub> = 2⋅(B<sub>i+1</sub> − B<sub>i</sub>), or
- 2⋅(B<sub>i</sub> - B<sub>i+1</sub>) = B<sub>i+1</sub> − B<sub>i</sub>

Note that different conditions can hold at different indices — the only restriction is that at each index, at least one of the given conditions must hold. Please see the sample tests below for examples.

## Input

- The first line of input will contain a single integer T, denoting the number of test cases. The description of T test cases follows.
- Each test case consists of two lines of input.
- The first line of each test case contains a single integer, N.
- The second line of each test case contains N space-separated integers, denoting A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>

## Constraints

- 1 ≤ T ≤ 100
- 3 ≤ N ≤ 10<sup>5</sup>
- 0 ≤ A<sub>i</sub> ≤ 10<sup>9</sup>
- The sum of N across all test cases won't exceed 10<sup>5</sup>

## Output

For each test case, output in a single line the answer — YES if a rearrangement that satisfies the given conditions exists, and NO otherwise.

The output is not case sensitive, so for example the strings YES, Yes, yES, etc. will all be treated as correct.

## Sample

- Input:
```
4
3
5 2 4
5
2 1 16 8 4
5
97 98 100 96 88
6
16 19 18 21 24 22
```

- Output:
```
Yes
Yes
No
Yes
```
