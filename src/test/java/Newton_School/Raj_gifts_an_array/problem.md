# [Problem: Raj gifts an array](https://my.newtonschool.co/playground/code/t9m4ktomynes)

Raj wants to present his friend with an array a1, a2,. , an. He learned that his friend measures the attractiveness of the array by calculating the sum of the differences (ai - ai-1) for all integers i from 2 to n. <br>
Raj needs assistance to determine the highest possible attractiveness of array a that he can achieve, given that he can rearrange its elements in any order.

## Input

Input consists of two lines:
1) The first line of each test case contains a single integer n (2≤n≤100) — the length of the array a.
2) The second line of each test case contains n integers a1, a2, …, an (1≤a[i]≤105) — the elements of the array a.

## Output

Output a single integer — the maximum beauty of the array a that can be obtained.

## Sample

- Input:
```
3
2 1 3
```

- Output:
```
2
```

## Explanation

- For case 1: <br> **In the first test case, the elements of the array a can be rearranged to make a=[1, 2, 3]. Then its beauty will be equal to (a2- a1) + (a3- a2) = (2-1)+(3-2) = 2.**
