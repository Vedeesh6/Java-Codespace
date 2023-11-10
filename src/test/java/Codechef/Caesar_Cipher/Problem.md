# [Problem: Caesar Cipher](https://www.codechef.com/problems/CAESAR)

In the ROT-K cipher, each character in the string is shifted a fixed number of positions down the alphabet. The value of K represents the number of positions to shift. For instance, in ROT-2, each character is shifted 2 positions. The ROT-2 cipher of the string code is eqfg.

Note that the rotation is performed in a circular manner, meaning that if the character z is shifted by one position, we obtain the character a.

You are given strings S,T, and U, each of length N, such that the ROT-K cipher of string S is string T. Find the ROT-K cipher of string U.

## Input

- The first line of input will contain a single integer Q, denoting the number of queries.
- Each query consists of multiple lines of input.
  - The first line of each query contains N — the length of the strings.
  - The second line contains the string S.
  - The third line contains the string T.
  - The fourth line contains the string U.

## Constraints

- 1 ≤ Q ≤ 100
- 1 ≤ N ≤ 1000
- S, T, and U contain lowercase english alphabets only.

## Output

Output here

## Sample

- Input:
```
3
3
abc
bcd
cde
2
bd
zb
dd
4
code
xjyz
chef
```

- Output:
```
def
bb
xcza
```

## Explanation

- For case 1: Given S= abc, and T= bcd, we can observe that each character has been shifted by 1 position. Thus, the ROT-1 cipher of string cde would be def.
- For case 2: Given S= bd, and T= zb, we can observe that each character has been shifted by 24 positions. Thus, the ROT-24 cipher of string dd would be bb. Note that since the shift is cyclic, dd becomes zz after 22 shifts and bb after the remaining 2 shifts.
