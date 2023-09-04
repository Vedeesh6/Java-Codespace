# [Problem: Bi_lindrome!](https://www.codechef.com/problems/QTOO_2523)

You are given a string S of length N. <br>
Your task is to delete a subsequence of maximum length from the string, such that, after concatenating the remaining parts of the string, it becomes a palindrome of length greater than 1. <br>
If this is possible, print the maximum length of the subsequence that can be deleted. Otherwise, print −1.

## Input

- The first line of input will contain a single integer T, denoting the number of test cases.
- Each test case consists of 2 lines of input:
  - The first line consists the a single integer N - the length of string S.
  - The second line contains string S, consisting of lowercase english alphabets.

## Constraints

- 1 ≤ T ≤ 2500
- 3 ≤ N ≤ 100
- S consists of lowercase english alphabets.

## Output

For each test case, if it is possible to delete a subsequence under the given conditions, print a single integer, denoting the maximum length of the subsequence that can be deleted. Otherwise, print −1.

## Sample

- Input:
```
3
6
babkhj
3 
abc 
4 
qtoo
```

- Output:
```
4
-1
2 
```

## Explanation

- For case 1: Possible ways to delete a subsequence are:
  - Delete subsequence khj to get palindrome bab.
  - Delete subsequence akhj to get palindrome bb. 
  
The subsequence having maximum length that can be deleted is akhj, having length 4. <br>

- For case 2: We cannot delete any subsequence under the given conditions.
