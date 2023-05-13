# [Problem: Minimum Steps to 1](https://my.newtonschool.co/playground/code/fhsw3j6teh86)

You are given an integer **n**. In one move, you can either multiply **n by two** or **divide n by 6** (if it is divisible by 6 without the remainder). Your task is to find the minimum number of moves needed to obtain **1 from n** or determine if it's impossible to do that.

## Input

The input consists of an integer **n**.

## Constraints

**1 ≤ n ≤ 10<sup>9</sup>**

## Output

Print the answer — the minimum number of moves needed to obtain **1 from n** if it's possible to do that or **-1** if it's impossible to obtain **1 from n**.

## Sample

- Input:
```
12
3
```

- Output:
```
-1
2
```

## Explanation

- For case 1: <br> **not possible** <br>
- For case 2: <br> **3 * 2 = 6 => 6 / 6 = 1**
