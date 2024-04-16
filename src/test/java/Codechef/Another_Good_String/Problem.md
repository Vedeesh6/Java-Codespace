# [Problem: Another Good String](https://www.codechef.com/problems/ADVITIYA4)

A string is called beautiful if all of its characters are the same. <br>
For example, "a", "bbb" and "aaaaa" are beautiful, while "ab" and "try" are not.<br><br>
You are given a string S of length N consisting of lowercase English letters.<br>
You are also given Q updates to be performed on S. Each update consists of a single character that must be appended to S (so the length of S increases by 1).<br>
After each update, and also before any updates are performed, find the length of the longest beautiful substring of S.

## Input

- The first line of input contains a single integer T, denoting the number of test cases.
- Each test case consists of multiple lines of input.
  - The first line of each test case contains two space-separated integers N and Q — the initial size of the string S and the number of queries.
  - The second line contains the string S, consisting of N lowercase letters.
  - The next Q lines each contain a single character c, which is to be appended to S.

## Constraints

- 1 ≤ T ≤ 2⋅10<sup>4</sup>
- 1≤ N ≤ 10<sup>5</sup>
- 1≤ Q ≤ 10<sup>5</sup>
- Every letter in the input (both in the string S and the updates) is a lowercase English letter.
- The sum of N and the sum of Q over all the test cases both do not exceed 10<sup>5</sup>.

## Output

- For each testcase output a single line containing Q+1 space-separated integers A<sub>0</sub>, A<sub>1</sub>, A<sub>2</sub>,..., A<sub>Q</sub>.
- A<sub>0</sub> is the answer for the initial string S, and for i≥1, A<sub>i</sub> must be the answer to the string after the i-th update.

## Sample

- Input:
```
2
6 4
annncc
c
c
c
d
9 3
ananymous
r
r
r
```

- Output:
```
3 3 4 5 5 
1 1 2 3 
```

## Explanation

- For case 1: The process is as follows:
  - Initially, the longest beautiful substring of S is "nnn", with length 3.
  - c is appended to S, so it becomes "annnccc". Its longest beautiful substring is either "nnn" or "ccc", still with length 3.
  - c is appended again, and S becomes "annncccc". Its longest beautiful substring is "cccc" with length 4.
  - c is appended again, and S becomes "annnccccc". Its longest beautiful substring is "ccccc" with length 5.
  - d is appended in S, making it "annncccccd". The longest beautiful substring remains "ccccc".
