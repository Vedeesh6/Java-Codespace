# [Problem: Minimum Sum Possible](https://my.newtonschool.co/playground/code/gs0mpmkil5la)

Alex and Brad are playing a game. They have two positive integers A and B.
In one operation:
- First Alex would replace exactly one of the numbers with the gcd of current numbers. In words, he would select either A or B and replace it with gcd(A, B).
- Then Brad would replace exactly one of the numbers with the lcm of current numbers.
<br>
Find the minimum sum of numbers they can achieve after K number of operations.

## Input

Input consists of three space- separated integers X, Y and K — denoting the initial numbers and the number of operations.

## Constraints

**1 <= X, Y, K <= 10^5**

## Output

Print the minimum sum of numbers they can achieve after K operations.

## Sample

- Input:
```
4 4 10
```

- Output:
```
8
```

## Explanation

- For case 1: <br> **Since both numbers are equal, both gcd and lcm would be 4. Thus, the sum of two numbers after all operations remains same, i. e., 8.**
