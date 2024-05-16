# [Problem: Binary Product](https://my.newtonschool.co/playground/code/brrbqaf485nz)

Given an integer n, find if it can be represented as the product of some (might be same) binary decimal numbers? <br>
Binary decimal number is if it is a positive integer and all digits in its decimal notation are either 00 or 11. For example, 10, 101, 11101, 101 is a binary decimal, while 1020110201 and 78, 77, 31 are not.

## Input

An integer n ( 1<= n <= 10^5)

## Output

Output "Yes" if it can be represented else "No".

## Sample

- Input:
```
121

12221

12421
```

- Output:
```
Yes

Yes

No
```

## Explanation

- For case 1: <br> **11 x 11 = 121** <br>
- For case 2: <br> **11 x 11 x 101 = 12221** <br>
- For case 3: <br> **We cannot represent it as a product of binary decimal**
