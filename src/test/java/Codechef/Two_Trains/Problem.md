# [Problem: Two Trains](https://www.codechef.com/problems/TWOTRAINS)

There are 2 trains A and B and N stations in a line from 1 to N in order. There is also an array P of length N−1 such that P<sub>i</sub> (1≤i<N) denotes the amount of time any train takes to go from the i-th station to the (i+1)-th station.

Initially, both trains are at station 1. Train A departs from station 1 and stops directly at station N. For safety purposes, it is maintained that train B cannot depart from station i unless train A has already reached station (i+1) (1≤i<N).

Find the minimum time after which train B reaches station N, once train A departs from station 1.

## Input

- The first line of input will contain a single integer T, denoting the number of test cases.
- Each test case consists of two lines of input.
  - The first line of each test case contains an integer N, denoting number of stations.
  - The next line contains N−1 space-separated integers, P<sub/>1</sub>, P<sub/>2</sub>, ...,P<sub/>N-1</sub>.

## Constraints

- 1 ≤ T ≤ 100
- 2 ≤ N ≤ 10<sup>5</sup>
- 1 ≤ P<sub>i</sub> ≤ 10<sup>3</sup> 
- The sum of N over all test cases won't exceed 10<sup>5</sup>.

## Output

For each test case, output on a new line the minimum time after which train B reaches station N.

## Sample

- Input:
```
3
2
4
3
3 5
4
5 2 6
```

- Output:
```
8
13
19
```

## Explanation

- For case 1: A reaches station 2 at t=4 and at this time B departs from station 1 and reaches station 2 at t=4+4=8.
- For case 2: Following is the timeline of two trains-
  - At t=3, A reaches station 2 and B departs from station 1.
  - At t=6, B reaches station 2 but A has not yet reached station 3, so train B will wait at station 2.
  - At t=8, A reaches station 3 and B departs from station 2.
  - At t=8+5=13, train B reaches station 3.
