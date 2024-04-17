# [Problem: Find sum greater than zero](https://my.newtonschool.co/playground/code/qv1ipf040tft)

You are given an array arr of length n. In one operation, you can choose any index i and either increment arr[i] by 1 or decrement arr[i] by 1. Your goal is to find the minimum number of operations required to ensure that the sum of all elements in the array is even but not zero, i. e., the sum should be divisible by 2 and greater than 0.

## Input

The first line contains an integer n, the length of the array. <br>
The second line contains n integers separated by spaces, representing the elements of the array.

## Constraints

**1 <= n <= 10^5 <br>
0 <= arr[i] <= 10^6, 0<=i<=n-1.**

## Output

Print an integer, the minimum number of operations required to ensure an even sum greater than of all elements in the array.

## Sample

- Input:
```
4
5 7 3 2
```

- Output:
```
1
```

## Explanation

- For case 1: <br> **Choose index i=0, a[i]=5 and <br>
Increment it. This will result into sum = (6+7+3+2) = 18 (Even) <br>
OR
Decrement it, This will result into sum = (4+7+3+2) = 16 (Even) <br>
Similarly, we can choose any of the number from the array and operate on it. And in 1 operation we can meet the requirements. Hence, the answer is 1.** <br>
