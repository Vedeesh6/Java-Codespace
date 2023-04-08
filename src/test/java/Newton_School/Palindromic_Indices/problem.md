# [Problem: Palindromic Indices](https://my.newtonschool.co/playground/code/yrqzkxpx9fwu)

You are given a palindromic string **s** of length **n**. You have to count the number of indices **i (1 ≤ i ≤ n)** such that the string after removing **s<sub>i</sub>** from **s** still remains a palindrome.

## Input

The first line of the input consists of an integer **n**. The next line consists of a string **s**.

## Constraints

**2 ≤ n ≤ 10<sup>5</sup>** <br>
**s** is a palindromic string.

## Output

Print a single integer — the number of indices **i (1 ≤ i ≤ n)** such that the string after removing **s<sub>i</sub>** from **s** still remains a palindrome.

## Sample

- Input:
```
3
aba

8
acaaaaca
```

- Output:
```
1
4
```

## Explanation

- For case 1: **Remove b** <br>
- For case 2: **Remove aaaa**
