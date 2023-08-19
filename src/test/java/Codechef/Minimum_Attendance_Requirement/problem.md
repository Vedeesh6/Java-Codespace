# [Problem: Minimum Attendance Requirement](https://www.codechef.com/problems/ATTENDU)

## Problem

A semester in Chef's University has 120 working days. The University's requirement is that a student should be present for at least 75% of the working days in the semester. If not, the student is failed. <br>
Chef has been taking a lot of holidays, and is now concerned whether he can pass the attendance requirement or not. N working days have already passed, and you are given N bits - B<sub>1</sub>,B<sub>2</sub>,...,B<sub>N</sub>. <br>
B<sub>i</sub>=0 denotes that Chef was absent on the i<sup>th</sup> day, and B<sub>i</sub>=1 denotes that Chef was present on that day. <br>
Can Chef hope to pass the requirement by the end of the semester?

## Input

- First line will contain T, the number of testcases. Then the testcases follow.
- Each testcase contains two lines of input.
- The first line of each testcase contains a single integer, N, the number of days till now.
- The second line of each testcase contains a string B of length N where B<sub>i</sub> represents the status of the i<sup>th</sup> day.

## Constraints

- 1 ≤ T ≤ 10
- 1 ≤ N ≤ 120
- 0 ≤ B<sub>i</sub> ≤ 1

## Output

 For each testcase, output the answer in a single line - "YES" if Chef can pass the attendance requirement and "NO" if not.

## Sample

- Input:
```
3
50
00000000000000000000000000000000000000000000000000
50
01010101010101010101010101010101010101010101010101
2
01
```

- Output:
```
NO
YES
YES
```

## Explanation

- For case 1: Even if Chef attends all the remaining 70 days, he'll only have an attendance percentage of 70/120 = 58.33% which is less than 75%.
- For case 2: Maximum attendance possible is 79.167% which is more than 75%.
- For case 3: maximum attendance possible is 99.167% which is more than 75%.
