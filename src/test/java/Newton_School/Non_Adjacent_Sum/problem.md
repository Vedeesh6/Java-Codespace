# [Problem: Non Adjacent Sum](https://my.newtonschool.co/playground/code/tu04kuged3du)

You're given an array containing n integers. You've to find the maximum sum of the elements of the array, but there must not be any adjacent element contributing to the sum.

## Input

Input consists of two lines:
- The first line contains an integer n : the size of the array.
- The second line contains n space separated integers representing the array elements.

## Constraints

**1 <= n <= 10^5 <br>
1 <= arr[i] <= 10^6**

## Output

Print the maximum sum adhering to the given condition.

## Sample

- Input:
```
5
3 2 4 6 5
```

- Output:
```
12
```

## Explanation

- For case 1: <br> **take 3, 4, 5 (3 + 4 + 5 = 12). Any other combination will lead to a lesser sum.**
