# [Problem: Budget Allotment](https://www.codechef.com/problems/BUDGET25)

This year's annual budget involved a discussion on N sectors where the i<sup>th</sup>sector was initially allocated an amount A<sub>i</sub>.<br>
It was later realised that a minimum budget of X is required by each sector.<br>
Allocation can be transferred from sector i to any sector j only if the final allocation for sector i remains at least X.<br>
Find the maximum number of sectors that can meet the minimum required budget of X after possible transfers.

## Input

- The first line of input will contain a single integer T, denoting the number of test cases.
- Each test case consists of multiple lines of input.
  - The first line of each test case contains two space-separated integers N and X — the number of sectors and the minimum budget requirement of each sector, respectively.
  - The next line consists of N space-separated integers A<sub>1</sub>,A<sub>2</sub>,...,A<sub>n</sub>, denoting the initial budget allocated to each sector.

## Output

For each test case, output on a new line, the maximum number of sectors that can meet the minimum required budget of X after possible transfers.

## Sample

- Input:
```
3
3 2
2 1 3
3 3
1 1 2
4 2
2 1 3 1
```

- Output:
```
3
0
3
```

## Explanation

- For case 1:<br> The minimum requirement for each sector is 2.Since sector 3 was allocated 3 units initially, 1 unit can be transferred to sector 2, leading to a final allocation of [2,2,2]. Thus, 3 sectors have the minimum required budget.
- For case 2:<br>The minimum requirement for each sector is 3. Since no sector has surplus budget, no transfers would take place. Thus,0 sectors have the minimum required budget.
