# [Problem: Find the position](https://my.newtonschool.co/playground/code/glxu90duyy5n)

You are given a **2-d** matrix where every cell has a value assigned to it denoted by **A[i][j]** (cell in the ith row from top and jth column from left ).
Find the position **(x, y)** such that the sum of all the cells **(excluding the cell (x, y) )** present in row number **x** and column number **y** is the maximum possible. <br>
If there are more than one positions for **(x, y)**, return the position where **x** is as minimum as possible. If there is more than one position with equal **x**, return the position where **y** is as minimum as possible. <br>
**Note: 1- based indexing is followed.**

## Input

The first line contains two space- separated integers denoting **N and M**. <br>
Next **N** lines contain **M** space- separated integers denoting the values of the array **A**.

## Constraints

**1 ≤ N x M ≤ 10<sup>6</sup> <br>
1 ≤ A<sub>i</sub> ≤ 10<sup>4</sup>**

## Output

Print two space- separated integers **x and y**.

## Sample

- Input:
```
2 2
4 1
3 1
```

- Output:
```
1 2
```

## Explanation

- For case 1: <br> **At (1, 2) position, the cells under consideration will be
(1, 1), (2, 2)
The sum of these cells will be
4 + 1 = 5, which is the maximum possible.**
