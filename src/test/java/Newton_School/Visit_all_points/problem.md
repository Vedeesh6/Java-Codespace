# [Problem: Visit all points](https://my.newtonschool.co/playground/code/uwkhkt1yqx5w)

Newton has three points, X, Y, and Z, positioned along a road. The time required to travel from X to Y or Y to X is denoted as A hours. Similarly, the time needed to travel between Y and Z, or Z and Y, is given as B hours. Additionally, the time required to travel from X to Z or Z to X is represented by C hours. Newton seeks assistance in determining the minimum time necessary to visit all three points exactly once, starting from any initial point of his choosing.

## Input

The first and only line of the input contains 3 integers, A, B, and C.

## Constraints

**1 ≤ A, B, C ≤ 1000**

## Output

Output the answer.

## Sample

- Input:
```
1 3 4

3 2 3
```

- Output:
```
4

5
```

## Explanation

- For case 1: <br> **The minimum distance to travel all 3 points can be found if he starts at A and then go to B and then to C.
A - > B - > C = 1 + 3 = 4** <br>
- For case 2: <br> **No explanation**
