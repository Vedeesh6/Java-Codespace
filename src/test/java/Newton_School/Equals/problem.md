# [Problem: Equals](https://my.newtonschool.co/playground/code/dfbyvptj6cjg)

Ram is stuck with an interesting math problem, help Ram to solve it. Given k, l two magic positive integers. Ram can apply one of the following moves at once, plus he can use the following moves any number of times.
1. Select any positive even integer p and replace k with k- p;
2. Select any positive odd integer q and replace k with k+q;
<br>
You can choose the same numbers a and b in different moves. Your task is to find the minimum number of moves required to obtain l from k.

## Input

The first line contains two space-separated integers k and l.

## Constraints

**1≤ k, l ≤10^9**

## Output

A single integer, the minimum number of moves.

## Sample

- Input:
```
9 3
```

- Output:
```
1
```

## Explanation

- For case 1: <br> **We can choose 6 (even) and (9-6) equals 3, which is our desired answer.**
