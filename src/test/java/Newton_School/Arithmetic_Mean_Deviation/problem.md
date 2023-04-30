# [Problem: Arithmetic Mean Deviation](https://my.newtonschool.co/playground/code/o6kjl7bsqu99)

A number **a2** is said to be the arithmetic mean of two numbers **a1 and a3**, if the following condition holds: **a1+a3=2⋅a2**. <br>
We define an arithmetic mean deviation of three numbers **a1, a2 and a3** as follows: **d(a1, a2, a3)=|a1+a3−2⋅a2|**. <br>

Arithmetic means a lot to Jeevan. He has three numbers **a1, a2, and a3** and he wants to minimize the arithmetic mean deviation **d(a1, a2, a3)**.

To do so, he can perform the following operation any number of times (possibly zero):
- Choose **i, j** from **{1, 2, 3}** such that **i≠j** and increment **ai** by **1** and decrement **aj** by **1** 


Help Jeevan find out the minimum value of **d(a1, a2, a3)** that can be obtained after applying the operation any number of times.

## Input

The input consists of three space- separated integers **a1, a2 and a3**.

## Constraints

**1 ≤ a1, a2 and a3 ≤ 10<sup>8</sup>**

## Output

Print the minimum value of **d(a1, a2, a3)** that can be obtained after applying the operation any number of times.

## Sample

- Input:
```
3 4 5
2 2 6
```

- Output:
```
0
1
```
