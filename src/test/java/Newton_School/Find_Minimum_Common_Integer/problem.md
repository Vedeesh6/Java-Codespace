# [Problem: Find Minimum Common Integer](https://my.newtonschool.co/playground/code/wo9imgwd5mse)

You are given two arrays, nums1 and nums2, both sorted in non- decreasing order. Your task is to find the minimum integer that is common to both arrays. If there is no common integer between nums1 and nums2, print -1.
<br>
A common integer is defined as an integer that appears in both nums1 and nums2 at least once.

## Input

Input consists of 4 lines :
- The first line contains an integer n: The size of array1.
- The second line contains n integers: representing the array1.
- The third line contains an integer m: The size of array2.
- The forth line contains m integers: representing the array2.

## Constraints

**1 ≤ n, m ≤ 10<sup>3</sup> <br>
0 ≤ array1[i], array2[i] ≤ 10<sup>6</sup>**

## Output

Print the minimum common integer found in both arrays. If there is no common integer, return -1.

## Sample

- Input:
```
6
1 1 2 2 3 3
3
3 4 5
```

- Output:
```
3
```

## Explanation

- For case 1: <br> **3 is the smallest common in both the array.**
