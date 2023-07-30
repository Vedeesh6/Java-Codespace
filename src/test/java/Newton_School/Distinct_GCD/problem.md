# [Problem: Distinct GCD](https://my.newtonschool.co/playground/code/kk0iy893ov3c)

You are a genius at maths and Newton decided to check your knowledge so he gave you three integers **N, X, and Y**. You have to construct an array **a<sub1</sub>, a<sub2</sub>,... , a<subN</sub> (X ≤ a<subi</sub> ≤ Y)** such that **GCD (i, a<subi</sub>)** for **1 ≤ i ≤ N** are all distinct. Print **YES** if it is possible to do so else print **NO**.

## Input

The first line of the input contains three space-separated integers denoting **N, X, and Y**.

## Constraints

**1 ≤ N ≤ 10<sup>5</sup> <br>
1 ≤ X ≤ Y ≤ 10<sup>9</sup>**

## Output

Print **YES** if it is possible to construct the array else print **NO**.

## Sample

- Input:
```
5 1 5
```

- Output:
```
YES
```

## Explanation

- For case 1: <br> **You can choose the elements of the array as 1, 2, 3, 4, 5, therefore, GCD(i, ai) will be 1, 2, 3, 4, 5 which are all distinct.**
