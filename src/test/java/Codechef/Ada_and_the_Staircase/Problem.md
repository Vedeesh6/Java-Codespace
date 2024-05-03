# [Problem: Ada and the Staircase](https://www.codechef.com/problems/ADASTAIR)

There is a big staircase with N steps (numbered 1 through N) in ChefLand. Let's denote the height of the top of step i by h<sub>i</sub>. Chef Ada is currently under the staircase at height 0 and she wants to reach the top of the staircase (the top of the last step). However, she can only jump from height h<sub>i</sub> to the top of a step at height h<sub>f</sub> if h<sub>f</sub>-h<sub>i</sub> ≤ K. To help Ada, we are going to construct some intermediate steps; each of them may be constructed between any two steps, or before the first step, and have any height. What is the minimum number of steps that need to be added to the staircase so that Ada could reach the top?

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains two space-separated integers N and K.
- The second line contains N space-seperated integers h<sub>1</sub>, h<sub>2</sub>,...., h<sub>N</sub>.

## Constraints

- 1 ≤ T ≤ 64
- 1 ≤ N ≤ 128
- 1 ≤ K ≤ 1,024
- 1 ≤ h<sub>i</sub> ≤ 1,024 for each valid i
- h<sub>i</sub> < h<sub>i+1</sub> for each valid i

## Output

For each test case, print a single line containing one integer — the minimum required number of steps.

## Sample

- Input:
```
1
4 3
2 4 8 16
```

- Output:
```
3
```
