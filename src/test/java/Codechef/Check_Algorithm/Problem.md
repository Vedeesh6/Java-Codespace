# [Problem: Check Algorithm](https://www.codechef.com/problems/CHEALG)

One day, Saeed was teaching a string compression algorithm. This algorithm finds all maximal substrings which contains only one character repeated one or more times (a substring is maximal if it we cannot add one character to its left or right without breaking this property) and replaces each such substring by the string "cK", where K is the length of the substring and c is the only character it contains. For example, "aabaaa" is compressed to "a2b1a3".

Saeed wanted to check if the students understood the algorithm, so he wrote a string S on the board and asked the students if the algorithm is effective on S, i.e. if the string created by compressing S is strictly shorter than S. Help them answer this question.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first and only line of each test case contains a single string S.

## Constraints

- 1 ≤ T ≤ 100
- 1 ≤ ∣S∣ ≤ 10<sup>3</sup>
- S may consist of only lowercase English letters.

## Output

For each test case, print a single line containing the string "YES" if the algorithm is effective on S or "NO" if it is not.

## Sample

- Input:
```
3
bbbbbbbbbbaa
c
aaaaaaaaaabcdefgh
```

- Output:
```
YES
NO
NO
```

## Explanation

- For case 1:
  - The compressed string of "bbbbbbbbbbaa" is "b10a2", which is shorter.
  - The compressed string of "c" is "c1", which is not shorter than "c".
  - The compressed string of "aaaaaaaaaabcdefgh" is "a10b1c1d1e1f1g1h1", which is not shorter than "aaaaaaaaaabcdefgh" (both strings have length 17).
