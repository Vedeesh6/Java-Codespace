# [Problem: Hit the target](https://my.newtonschool.co/playground/code/gsjlqw6bsbuo)

A group of shooters is aiming their arrows at targets. The targets are numbered starting from 1 and go on indefinitely. Each **i<sup>the</sup>** shooter has a specific shooting pattern where they hit targets that are multiples of a certain number, denoted as **k[i]**. Your task is to find the smallest target that is hit by all the shooters.

## Input

The first line contains an integer **T** - the total no. of test cases. <br>
The first line of each test case contains a natural number - **N** - the number of shooters. <br>
The second line of each test case contains **N** space-separated integers, where the **i<sup>the</sup>** integer denotes the value of **k[i]** for the **i<sup>the</sup>** shooter.

## Constraints

**1 ≤ T ≤ 5 <br>
1 ≤ N ≤ 15 <br>
1 ≤ k[i] ≤ 48**

## Output

For each test case, print the smallest target that is hit by all shooters on a new line.

## Sample

- Input:
```
1
3
2 3 4
```

- Output:
```
12
```

## Explanation

- For case 1: <br> **The first shooter shoots at targets 2, 4, 6, 8, 10, 12, 14,. . <br>
The second shooter shoots at targets 3, 6, 9, 12,. . <br>
The third shooter shoots at targets 4, 8, 12, 16, 20,. . <br>
The smallest target at which all shooters shoot is 12.**
