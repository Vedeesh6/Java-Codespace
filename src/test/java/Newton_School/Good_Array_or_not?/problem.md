# [Problem: Good Array or not?](https://my.newtonschool.co/playground/code/cxlctvyfyf8u)

You are given an array of integers 'nums' of size n. Your task is to determine whether the array is good or not. An array is considered good if it meets the following criteria:
- It contains all elements from 1 to n/2.
- Each element from 1 to n/2 occurs exactly twice in the array.
<br>
Print "Yes" if the array is good, "No" otherwise.

## Input

Input consists of two lines:
- The first line contains an integer n — the size of the array.
- The second line contains n positive integers nums[0], nums[1], …, nums[n-1] — the elements of the array.

## Constraints

**1 ≤ n ≤ 10<sup>6</sup> <br>
0 ≤ nums[i] ≤ 10<sup>9</sup>**

## Output

Print "Yes" if the array is good, "No" otherwise.

## Sample

- Input:
```
6
1 3 1 2 2 3
```

- Output:
```
Yes
```

## Explanation

- For case 1: <br> **n = 6, n/2 = 3.
In the given array, each number from 1 to 3 occurs exactly twice. Hence the output is "Yes".**
