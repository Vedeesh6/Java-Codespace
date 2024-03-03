# [Problem: Displays](https://my.newtonschool.co/playground/code/u0880y7yst8h)

You are tasked with designing a new series of rectangular displays for a large company. The key requirement is that each display must contain exactly n pixels. Your objective is to determine the dimensions of these displays - specifically, the number of pixel rows (a) and the number of pixel columns (b), under the following conditions:

1) The display must have exactly n pixels in total.
2) The number of rows (a) should not exceed the number of columns (b), meaning a ≤ b.
3) The difference between the number of columns and the number of rows (b - a) should be as small as possible.

## Input

The first and only line contains the positive integer n (1 ≤ n ≤ 106) — the number of pixels display should have.

## Output

Print two integers — the number of rows and columns on the display.

## Sample

- Input:
```
8
```

- Output:
```
2 4
```

## Explanation

- For case 1: <br> **In this example the minimum possible difference equals 2, so on the display should be 2 rows of 4 pixels.**
