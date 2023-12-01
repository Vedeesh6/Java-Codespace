# [Problem: Magic Pairs](https://www.codechef.com/problems/ALEXNUMB)

Alexandra has some distinct integer numbers a1,a2...an. Count number of pairs (i,j) such that:
1≤ i ≤ n, 1≤ j ≤ n, a<sub>i</sub> < a<sub>j</sub>

## Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.The first line of each test case contains a single integer n denoting the number of numbers Alexandra has. The second line contains n space-separated distinct integers a<sub>1</sub>, a<sub>2</sub>, ...,a<sub>n</sub> denoting these numbers.

## Constraints

- 1 ≤ T ≤ 4
- 1 ≤ n ≤ 100000
- 0 ≤ a<sub>i</sub> ≤ 10<sup>9</sup>
- All the a<sub>i</sub> are distinct

## Output

For each test case, output a single line containing number of pairs for corresponding test case.

## Sample

- Input:
```
2
2
12 11
3
13 11 12
```

- Output:
```
1
3
```

## Explanation

- For case 1: Only one such pair of (i, j) indices exists: (2,1), since a<sub>2</sub> < a<sub>1</sub>.
- For case 2: 3 possible pairs of indices: (2,1), (2,3), (3,1)
