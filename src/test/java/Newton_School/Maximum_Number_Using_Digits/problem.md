# [Problem: Maximum Number Using Digits](https://my.newtonschool.co/playground/code/5tmchwx5j8cy)

You have a set of digits, and your goal is to create the largest possible integer using all these digits. However. there are specific rules:
- The integer you create must be divisible by 2 and 5 without any remainder.
- You can use any of the digits in the set, but you cannot use leading zeroes (e.g. , 012 is not allowed).
- You're allowed to use each digit in the set same number of times it appears in the original set.

<br>
Your task is to find the maximum integer that satisfies these conditions.

## Input

Input consists of two lines:
- The first line contains an integer - n (The number of digits in a set).
- The second line contains n digits (space separated).

## Constraints

**1 <= n <= 10^3**
Each digit in the set will be between [0, 9]
Final integer containing all zeroes will also not be considered a valid integer and you have to print -1 in such a case as well.

## Output

On a single line print the answer to the problem. If such number does not exist, then you should print -1.

## Sample

- Input:
```
11
3 4 5 4 5 3 5 3 4 4 0
```

- Output:
```
55544443330
```

## Explanation

- For case 1: <br> **55544443330 is divisible by 2 and 5. Also, it's the largest number out of these digits.**
