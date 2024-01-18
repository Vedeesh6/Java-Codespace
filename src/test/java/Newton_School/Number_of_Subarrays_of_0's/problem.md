# [Problem: Number of Subarrays of 0's](https://my.newtonschool.co/playground/code/9brsjl59j1gg)

You are given an array arr  of length N of 0's and 1's. Find the total number of subarrays of 0's.

## Input

Input consists of two lines:
- The first line contains an integer n : the size of the array.
- The second line contains n space separated integers representing the array elements.

## Constraints

**1 <= n <= 10<sup>6</sup> <br>
0 <= arr[i] <= 1**

## Output

Output the total number of subarrays.

## Sample

- Input:
```
4
0 0 1 0
```

- Output:
```
4
```

## Explanation

- For case 1: <br> **Following are the subarrays of
length 1: {0}, {0}, {0} - 3
length 2: {0, 0} - 1
Total Subarrays: 3 + 1 = 4**
