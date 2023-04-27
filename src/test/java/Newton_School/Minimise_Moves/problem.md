# [Problem: Minimise Moves](https://my.newtonschool.co/playground/code/z6ptsursy4wz)

YunQian is standing on an infinite plane with the Cartesian coordinate system on it. In one move, she can move to the diagonally adjacent point on the top right or the adjacent point on the left. That is, if she is standing on point **(x, y)**, she can either move to point **(x+1, y+1) or point (x−1, y)**. YunQian initially stands at point **(a, b)** and wants to move to point **(c, d)**. Find the minimum number of moves she needs to make or declare that it is impossible.

## Input

The input consists of 4 space- separated integers **a, b, c and d**.

## Constraints

**-10<sup>8</sup> ≤ a,b,c,d ≤ 10<sup>8</sup>**

## Output

if it is possible to move from point **(a, b) to point (c, d)**, output the minimum number of moves. Otherwise, output **−1**.

## Sample

- Input:
```
-1 0 -1 2
0 0 4 5
```

- Output:
```
4
6
```
