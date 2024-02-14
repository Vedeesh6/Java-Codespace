# [Problem: Favourite String of Chef](https://www.codechef.com/problems/CHEFFAV)

A string S is called Chef's favourite if every substring chef in S must have a substring code before it.

You are given a string S of size N that contains both code and chef as a substring. Please determine if S is Chef's favourite.

Note: A substring is a continuous part of string which can be obtained by deleting some (may be none) character's from the beginning and some (may be none) character's from the end.

## Input

- The first line of the input contains an integer T - the number of test cases. The test cases then follow.
- The first line of each test contains an integer N - the size of the string.
- The second line of each test contains a string S.

## Constraints

- 1 ≤ T ≤ 10
- 1 ≤ N ≤ 10<sup>4</sup>
- ∣S∣=N
- S consists only of lowercase English characters
- Both code and chef appear as a substring at least once in S

## Output

For each test case, output on a single line AC if S is Chef's favourite, or WA otherwise.

## Sample

- Input:
```
4
8
codechef
8
chefcode
14
sxycodeghychef
21
sxychefvsvcodehghchef
```

- Output:
```
AC
WA
AC
WA
```

## Explanation

- For case 1: Substring code is present before chef.
- For case 2: Substring code is not present before chef.
- For case 3: Substring code is present before chef.
- For case 4: There is no code substring present before the first occurrence of chef.
