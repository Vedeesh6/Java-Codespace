# [Problem: Longest Common Pattern](https://www.codechef.com/problems/LCPESY)

As we all know, Chef is cooking string for long days, his new discovery on string is the longest common pattern length. The longest common pattern length between two strings is the maximum number of characters that both strings have in common. Characters are case sensitive, that is, lower case and upper case characters are considered as different. Note that characters can repeat in a string and a character might have one or more occurrence in common between two strings. For example, if Chef has two strings A = "Codechef" and B = "elfedcc", then the longest common pattern length of A and B is 5 (common characters are c, d, e, e, f).

Chef wants to test you with the problem described above. He will give you two strings of Latin alphabets and digits, return him the longest common pattern length.

## Input

- The first line of the input contains an integer T, denoting the number of test cases. Then the description of T test cases follows.
- The first line of each test case contains a string A. The next line contains another character string B.

## Constraints

- 1 ≤ T ≤ 100
- 1 ≤ |A|, |B| ≤ 10000, where |S| denotes the length of the string S
- Both of A and B can contain only alphabet characters (both lower and upper case) and digits.

## Output

For each test case, output a single line containing a single integer, the longest common pattern length between A and B.

## Sample

- Input:
```
4
abcd
xyz
abcd
bcda
aabc
acaa
Codechef
elfedcc
```

- Output:
```
0
4
3
5
```

## Explanation

- For case 1: There is no common character.
- For case 2: All the characters are same.
- For case 3: Three characters (a, a and c) are same.
- For case 4: This sample is mentioned by the statement.
