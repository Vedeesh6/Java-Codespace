# [Problem: Distinct Binary Strings](https://www.codechef.com/problems/BINSTRING)

You are given a binary string S of length N.

You have to perform the following operation exactly once:

Select an index (1≤i≤N) and delete S<sub>i</sub> from S. The remaining parts of S are concatenated in the same order.
How many distinct binary strings of length N−1 can you get after applying this operation?

## Input

The first line of input contains a single integer T - the number of test cases. The description of T test cases follow.
The first line of each test case contains N - the length of the binary string S.
The second line contains the binary string S.

## Constraints

- 1 ≤ T ≤ 10<sup>5</sup>
- 2 ≤ N ≤ 10<sup>5</sup>
- Sum of N does not exceed 2⋅10<sup>5</sup> over all testcases.

## Output

For each test case, output the number of distinct binary strings that you can get after applying the operation exactly once.

## Sample

- Input:
```
3
3
100
4
1111
5
10110
```

- Output:
```
2
1
4
```

## Explanation

- For case 1: We have S=100. Now, we can get 00 (on deleting S<sub>1</sub>), 10 (on deleting S<sub>2</sub>) and 10 (on deleting S<sub>3</sub>). Therefore, we can get 2 distinct strings.
- For case 2: We have S=1111. Now, we will always get 111 irrespective of the index i on which we apply the operation. Therefore, we can get 1 distinct string.
