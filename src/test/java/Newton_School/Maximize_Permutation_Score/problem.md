# [Problem: Maximize Permutation Score](https://my.newtonschool.co/playground/code/r1thq8q8v5ge)

Given three integers n, x, and y, you are to determine the maximum sum of elements at indexes divisible by both x and y in a permutation of the numbers from 1 to n. You can rearrange the permutation to maximize the score.

## Input

Input consists of three integers: n, x, y (1 ≤ n ≤ 10<sup>5</sup>, 1 ≤ x, y ≤ n).

## Output

Print a single integer representing the maximum sum.

## Sample

- Input:
```
20 2 5
```

- Output:
```
39
```

## Explanation

- For case 1: <br> **Indices divisible by both 2 ad 5 are: 10 and 20. One can have a premutation like:
[1 2 3 4 5 6 7 8 9 19 10 11 12 13 14 15 16 17 18 20], So, the maximum sum will be 20 + 19 = 39.**
