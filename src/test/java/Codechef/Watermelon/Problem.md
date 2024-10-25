# [Problem: Watermelon](https://www.codechef.com/problems/WATMELON)

Let's call a sequence good if the sum of all its elements is 0.

You have a sequence of integers A<sub>1</sub>, A<sub>2</sub>,…, A<sub>N</sub>. You may perform any number of operations on this sequence (including zero). In one operation, you should choose a valid index i and decrease A<sub>i</sub> by i. Can you make the sequence good using these operations?

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer N.
- The second line contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>,…, A<sub>N</sub>.

## Constraints

- 1 ≤ T ≤ 1,000
- 1 ≤ N ≤ 10
- ∣A<sub>i</sub>∣ ≤ 100 for each valid i

## Output

For each test case, print a single line containing the string "YES" if it is possible to make the given sequence good or "NO" if it is impossible.

## Sample

- Input:
```
2
1
-1
2
1 2
```

- Output:
```
NO
YES
```

## Explanation

- For case 2: We can perform two operations ? subtract 1 from A<sub>1</sub> and 2 from A<sub>2</sub>.
