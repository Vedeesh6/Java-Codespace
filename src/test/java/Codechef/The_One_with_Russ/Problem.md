# [Problem: The One with Russ](https://www.codechef.com/problems/S02E10)

Rachel has a date and tells everyone she is not mad at Ross but doesn't have any feelings for him anymore either. Seeing her date for the first time, everyone notices that he looks exactly like Ross. However, Rachel refuses to believe so.

Rachel makes a list of N characteristics and assigns a score to both Ross and Russ for each of the characteristics. Ross' i<sup>th</sup> characteristic has a score equal to A<sub>i</sub> and Russ' i<sub>th</sub> characteristic has a score equal to B<sub>i</sub>. Rachel decides that Russ looks exactly like Ross if the following condition is satisfied for at least X distinct values of j, 1≤j≤N :

∣ A<sub>j</sub> − B<sub>j</sub> ∣ ≤ K.

Help Rachel in finding if both are alike.

## Input

- First line will contain T, number of testcases. Then the testcases follow.
- First line for each test case contains three integers N, X and K, denoting the number of characteristics, the minimum number of characteristics and maximum possible score difference.
- Second line for each test case contains N integers denoting array A.
- Third line for each test case contains N integers denoting array B.

## Constraints

- 1 ≤ T ≤ 10
- 1 ≤ N ≤ 10<sup>3</sup>
- 1 ≤ A<sub>i</sub> ,B<sub>i</sub> ≤10<sup>3</sup>
- 1 ≤ X ≤ n
- 0 ≤ K ≤ 10<sup>3</sup>

## Output

For each test case print "YES" if they are alike, else print "NO".
You may print each character of each string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

## Sample

- Input:
```
3
4 2 2
1 7 7 5
1 8 1 2
5 1 3
9 8 7 2 5
5 4 1 8 9
3 3 0
2 3 4
2 3 4
```

- Output:
```
YES
NO
YES
```

## Explanation

- For case 1: The values of absolute difference between scores of Ross' and Russ' characteristics 1 and 2 are 0 and 1 respectively, both these values are less than K=2. Thus, Ross and Russ are alike.
- For case 2: The values of absolute difference between the scores of ALL of the Ross' and Russ' characteristics are greater than 3.
