# [Problem: String and game](https://my.newtonschool.co/playground/code/tfink6qpkzux)

Given a string 's' composed of lowercase letters and an integer 'k', the task is to compute the minimum value of the string following the removal of 'k' characters. The value of the string is defined as the sum of the squared counts of each distinct character in the string.

## Input

Input consists of 2 lines,
First line contains a string s, and second line contains an integer k.

## Constraints

**1 <= |s| <= 1e5**
**1 <= k <= |s|**

## Output

Print the squared sum as described in the question.

## Sample

- Input:
```
abcabcc
1
```

- Output:
```
12
```

## Explanation

- For case 1: <br> **Remove 1 c to get <22 +<22+ <22 = 12.** <br>
