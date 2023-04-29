# [Problem: Perfect Array](https://my.newtonschool.co/playground/code/vro5fvs3wz3n)

Given an array **a** of length **n**, tell us whether it has a non-empty subsequence such that the product of its elements is not a perfect square. A sequence **b** is a subsequence of an array **a** if **b** can be obtained from **a** by deleting some (possibly zero) elements.

## Input

The first line of the input consists of an integer **n** denoting the length of the array **a**. The next line consists of **n** space- separated integers **a<sub>1</sub>, a<sub>2</sub>, …, a<sub>n</sub>** denoting the elements of the array **a**.

## Constraints

**1 ≤ n ≤ 100 <br>
1 ≤ a<sub>i</sub> ≤ 10<sup>4</sup>** <br>

## Output

If there's a subsequence of a whose product isn't a perfect square, print **"Yes"**. Otherwise, print **"No"**.

## Sample

- Input:
```
3
1 5 4

2
100 10000
```

- Output:
```
Yes
No
```

## Explanation

- For case 1: (1,5)
- For case 2: No subsequence as such
