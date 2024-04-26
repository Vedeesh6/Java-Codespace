# [Problem: Vikas and permutations](https://my.newtonschool.co/playground/code/fj5ufdsjxr6w)

Vikas is fascinated by permutations and sequences. He wants to find all permutations of size N such that each element in the permutation is between 1 and N (inclusive). The catch is that for any permutation P, P[i] should not be at the ith position. Write a program to find the total number of all such permutations.

## Input

Input contains a single integer N (2 ≤ N ≤ 10) representing the size of the permutations.

## Output

Print an integer representing the total number of permutations satisfying the above conditions.

## Sample

- Input:
```
3
```

- Output:
```
2
```

## Explanation

- For case 1: <br> **In the above example, the permutations [1, 2, 3] and [2, 1, 3] are not valid because at least one element appears at its original index. The valid permutations are [2, 3, 1] and [3, 1, 2]. Hence, the output is 2.**
