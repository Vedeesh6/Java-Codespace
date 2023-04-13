# [Problem: Square Sequence](https://my.newtonschool.co/playground/code/v0n6srtuz1q2)

Luis has a sequence of n+1 integers **a<sub>1</sub>, a<sub>2</sub>, …, a<sub>n+1</sub>**. For each **i=1, 2, …, n+1** it is guaranteed that **0 ≤ a<sub>i</sub> < n**, or a<sub>i</sub>=n<sup>2</sup>. He has calculated the sum of all the elements of the sequence and called this value **s**.
Luis has lost his sequence, but he remembers the values of **n and s**. Can you find the number of elements in the sequence that are equal to **n<sup>2</sup>**?

## Input

The input consists of two space separated integers **n and s**.

## Constraints

**1 ≤ n < 10<sup>6</sup>** <br>
**0 ≤ s ≤ 10<sup>18</sup>**

## Output

Print one integer — the number of elements in the sequence which are equal to n<sup>2</sup>.

## Sample

- Input:
```
7 0
2 12
```

- Output:
```
0
3
```

## Explanation

- For case 1: <br> **0 0 0 0 0 0 0** <br>
- For case 2: <br> **4 4 4 0 0 0 0 0 0 0 0 0**
