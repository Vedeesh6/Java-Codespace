# [Problem: Gift Hunter](https://my.newtonschool.co/playground/code/aswn19fgbi5n)

Rahul is a gift lover he is currently located at **{0, 0}** in an **n x m** grid and the gift is located at **{k, l}**, given a string that contains characters **{L, R, D, U}**, the string represents path taken by Rahul, tell whether he will reach **{k, l}** at any point of time. **L means left, R means right, U means up and D means down.**
Assuming **(x,y)** is the initial point, here's how L,R, D, and U works in a grid:
- L (Left): moves to (x-1, y)
- R (Right): moves to (x+1, y)
- D (Down): moves to (x, y-1)
- U (Up): moves to (x, y+1)

## Input

The first line contains two integers **k, l** the position of the gift.
The second line contains the string, path taken by Rahul.

## Constraints

**0 ≤ {k, l} ≤ 10<sup>5</sup>**
**2 ≤ |s| ≤ 10<sup>3</sup>**

## Output

Output a single string **"YES"** or **"NO"**.

## Sample

- Input:
```
1 1
UR
```

- Output:
```
YES
```

## Explanation

- For case 1: <br> **U => {0,1} R => {1,1}**
