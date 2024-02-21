# [Problem: Equal AB](https://my.newtonschool.co/playground/code/0vzuohqzxi2n)

Given two numbers a and b. In one operation you can pick any non negative integer x and either of a or b. Now if you picked a then replace a with a&x else if you picked b then replace b with b&x. <br>
Return the minimum number of operation required to make a and b equal.
<br>
**Note: Here & represents bitwise AND operation.**

## Input

Given two integers, a and b, each in a separate line.

## Constraints

**1 <= a,b <= 10^6**

## Output

Print the minimum number of operations to make a and b equal.

## Sample

- Input:
```
5
12
```

- Output:
```
2
```

## Explanation

- For case 1: <br> **In first operation replace a = a&4 = 4 after that replace b = b&6 = 4
Hence both are same after applying two operations.**
