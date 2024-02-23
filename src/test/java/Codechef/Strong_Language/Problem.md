# [Problem: Strong Language](https://www.codechef.com/problems/SSCRIPT)

A string is said to be using strong language if it contains at least K consecutive characters '*'.

You are given a string S with length N. Determine whether it uses strong language or not.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains two space-separated integers N and K.
- The second line contains a single string S with length N.

## Constraints

- 1 ≤ T ≤ 10
- 1 ≤ K ≤ N ≤ 10<sup>6</sup>
- S contains only lowercase English letters and characters '*'
- Sum of N over all testcases is atmost 10<sup>6</sup>.

## Output

Print a single line containing the string "YES" if the string contains strong language or "NO" if it does not (without quotes).

You may print each character of each string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

## Sample

- Input:
```
3
5 2
*a*b*
5 2
*a**b
5 1
abcde
```

- Output:
```
NO
YES
NO
```

## Explanation

- For case 1: Since there are no two consecutive characters '*', the string does not contain strong language.
- For case 2: There are two adjacent characters '*', so the string contains strong language.
- For case 3: Since there are no characters '*' in the string, it does not contain strong language.
