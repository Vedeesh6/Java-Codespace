# [Problem: Rotated Number](https://my.newtonschool.co/playground/code/6r2ulspzred2)

Alice has an array of integers, containing n distinct elements sorted in ascending order. She loves playing around with it. One of her favourite games is to rotate the array- anti-clockwise. In one rotation operation, she moves the last element of the array to the beginning and shifts all the remaining elements to the right.
<br>
She performs this rotation operation k times and then wonders: What would be the index of the first element from the original array in the rotated array? Determine the index of the first element from the original array.

## Input

Input consists of three lines:
- The first line contains an integer n (1 ≤ n ≤ 10^5) — the size of the array.
- The second line contains n integers arr[1], arr[2],. , arr[n] (1 ≤ arr[i] ≤ 10^9) — the elements of the array in ascending order.
- The third line contains a single integer k (0 ≤ k ≤ 10^5) — the number of rotations.

## Constraints

**1 ≤ K ≤ 100** <br>
**K** is an integer.

## Output

Print a single integer — the index of the first element from the original array in the rotated array.

## Sample

- Input:
```
5
1 2 3 4 5
2
```

- Output:
```
3
```

## Explanation

- For case 1: <br> **In this example, the initial array is [1, 2, 3, 4, 5]. After 2 rotations, the array becomes [4, 5, 1, 2, 3]. The first element of the original array, which is 1, is now at index 3 (1- Based indexed). Therefore, the output is 3.**
