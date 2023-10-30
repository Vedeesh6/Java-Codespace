# [Problem: The Peculiar Path of Pendleton the Penguin](https://my.newtonschool.co/playground/code/m1z0dtt1be1p)

Pendleton the Penguin is setting out on a whimsical walk along a one- dimensional ice path. The path starts at the origin, which we can denote as point 0. You are given a string directions of length n that consists solely of the characters 'L', 'R', and '_'. These characters describe Pendleton's possible moves as he ambles along:
- He can move to the left if directions[i] = 'L' or directions[i] = '_'
- He can move to the right if directions[i] = 'R' or directions[i] = '_'
<br>
Your task is to determine the maximum distance from the starting point that Pendleton can reach after making n moves.

## Input

Input consists of a string directions of length n, representing the possible moves for Pendleton. The string contains only the characters 'L', 'R', and '_'.

## Constraints

**1 ≤ n ≤ 10^5**

## Output

Print an integer representing the maximum distance from the origin that Pendleton the Penguin can reach after n moves.

## Sample

- Input:
```
L_RL__R
```

- Output:
```
3
```

## Explanation

- For case 1: <br> **The furthest point we can reach from the origin 0 is point -3 through the following sequence of moves "LLRLLLR".**
