# [Problem: The updated K](https://my.newtonschool.co/playground/code/it2rrcnjztyt)

You have been given an integer K and an array of operations, operation[], that contains n numbers, each of which is -1, 0, or 1. <br>
The array dictates a series of operations you need to perform on K. Specifically, if operation[I] (1 <= i <= n), is -1, you should decrement K by 1. If it's 1, you should increment K by 1. If it's 0, K remains unchanged. After performing all n operations, your task is to determine the resulting value of K.

## Input

Input consists of 3 lines:
- The first line contains an integer K — the initial value.
- An integer n — the number of operations to perform.
- An array "operation[]" of n integers, where each integer is -1, 0, or 1. The array dictates the operations to perform on K.

## Constraints

**-10<sup>9</sup> ≤ K ≤ 10<sup>9</sup> <br>
1 ≤ n ≤ 10<sup>5</sup>**

## Output

Print the final value of K after performing all n operations as dictated by the array operation[].

## Sample

- Input:
```
5
4
1 -1 0 1
```

- Output:
```
6
```

## Explanation

- For case 1: <br> **Start with K = 5.
After the first operation (1), K becomes 6.
After the second operation (-1), K becomes 5.
After the third operation (0), K remains 5.
After the fourth operation (1), K becomes 6.
<br>Thus, the final value of K is 6.**
