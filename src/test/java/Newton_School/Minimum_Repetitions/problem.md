# [Problem: Minimum Repetitions](https://my.newtonschool.co/playground/code/n2z9r9kxyqsg)

Given two strings A and B.  Find minimum number of times A has to be repeated such that B is a Substring of it. If B can never be a substring then print -1.

## Input

Input consists of two strings each in a new line, A and B.

## Constraints

**1 ≤ |A|, |B| ≤ 10<sup>3</sup> <br>
String A and B consists of lower case alphabets**

## Output

Print an integer, the number of repetitions or -1.

## Sample

- Input:
```
abcd
cdabcdab
```

- Output:
```
3
```

## Explanation

- For case 1: <br> **Repeating A three times (abcdabcdabcd), B is a substring of it. B is not a substring of A when it is repeated less than 3 times.**
