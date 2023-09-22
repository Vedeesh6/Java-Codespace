# [Problem: Chef and String](https://www.codechef.com/problems/RECNDSTR)

Chef has a string S consisting of lowercase English characters. Chef defined functions left shift L(X) and right shift R(X) as follows.
- L(X) is defined as shifting all characters of string X one step towards left and moving the first character to the end.
- R(X) is defined as shifting all characters of string X one step towards the right and moving the last character to the beginning.
For example, L("abcd") = "bcda" and R("abcd") = "dabc". <br>
Chef wants to find out whether there exists a string V of the same length as S such that both L(V)=S and R(V)=S holds.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a string S.
  
## Constraints

- 1 ≤ T ≤ 100
- 1 ≤ ∣S∣ ≤ 10<sup>6</sup>
- S contains all lower case English alphabets.
- It's guaranteed that the total length of the strings in one test file doesn't exceed 10<sup>6</sup>

## Output

For each test case, If there exists a valid string V, print "YES", otherwise print "NO" (without the quotes).

## Sample

- Input:
```
4
a
ab
abcd
aaaaa
```

- Output:
```
YES
YES
NO
YES
```

## Explanation

- For case 1: In the first test case, Chef can choose V=S 
- For case 2: In the second test case, Chef can choose V = "ba" which satisfies both conditions. 
- For case 3: There doesn't exist any valid choice for string V in the third test case.
