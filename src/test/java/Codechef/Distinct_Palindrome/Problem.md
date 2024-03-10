# [Problem: Distinct Palindrome](https://www.codechef.com/problems/DISPAL)

Given integers N and X, generate a palindrome of length N consisting of lowercase English alphabets such that the number of distinct characters in the palindrome is exactly X.
If it is impossible to do so, print −1 instead.

## Input

- First line will contain T, number of test cases. Then the test cases follow.
- Each test case contains of a single line of input, two integers N, X, as mentioned in the statement. 

## Constraints

- 1 ≤ T ≤ 10<sup>4</sup>
- 1 ≤ N ≤ 10<sup>5</sup>
- 1 ≤ X ≤ min(N,26)
- Sum of N over all test cases does not exceed 3⋅10<sup>5</sup>

## Output

For each test case, output in a single line, a palindrome of length N consisting of lowercase English alphabet such that the number of distinct characters in the palindrome is X. If it is not possible to do so, print −1 instead.

## Sample

- Input:
```
4
1 1
2 1
3 3
4 2
```

- Output:
```
z
aa
-1
xyyx
```

## Explanation

- For case 1: A possible palindrome of length 1 having 1 distinct character is z.
- For case 3:  It can be proven that there exists no possible palindrome of length 3 having 3 distinct characters.
