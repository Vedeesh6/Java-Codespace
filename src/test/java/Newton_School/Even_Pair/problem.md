# [Problem: Even Pair](https://my.newtonschool.co/playground/code/bdf6ztdkisvg)

You are given a sequence A consisting of N non-negative integers. Determine if there is an even number represented as the sum of two different elements of A. If it exists, find the maximum such number.

## Input

The first line of the input consists of an integer N. The second line consists of N space separated integers.
N <br>
A<sub>1</sub> A<sub>2</sub> A<sub>3</sub>. . A<sub>N</sub>

## Constraints

**2 ≤ N ≤ 2×10^5 <br>
0 ≤ Ai ≤10^9 <br>
The elements of A are distinct. <br>
All values in the input are integers.**

## Output

Print -1 if there is no even number represented as the sum of two different elements of A. <br>
If such an even number exists, print the maximum such number.

## Sample

- Input:
```
3
2 3 4

2
1 0
```

- Output:
```
6

-1
```

## Explanation

- For case 1: <br> **From the given array of elements [2, 3, 4], the maximum even number we can form by adding two different elements is 6 (2+4). Hence, the output is 6.**
- Fpr case 2: <br> **From the given array of elements [1, 0], it's not possible to form any even number by adding two different elements. Hence, the output is -1.**
