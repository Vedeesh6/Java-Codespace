# [Problem: Duplicate Distant Numbers](https://my.newtonschool.co/playground/code/2ub979wcr2by)

You're assisting your friend Apurva with some data analysis. He provides you with an integer array called `nums`, which contains `n` integers. Apurva is curious to know if the array contains any duplicate numbers that are within a specific distance of each other. <br>
More formally, he is looking for a pair of distinct indices `i` and `j` in the array such that `nums[i]` equals `nums[j]` and the absolute difference between `i` and `j` is at most `k`.
<br>
Determine whether such a pair exists in the array. Print "Yes" if such a pair exists; otherwise, print "No".

## Input

Input consists of 3 lines:
- The first line contains an integer n: The size of the array 'nums'.
- The second line contains n numbers representing the elements of nums,
- The third line contains an integer k.

## Constraints

**1 <= n <= 10<sup>5</sup>
-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup>, (1 <= i <= n)
1 <= k <= 10<sup>5</sup>**

## Output

Print "Yes" if such a pair exists; otherwise, print "No".

## Sample

- Input:
```
4
1 2 3 1
3
```

- Output:
```
Yes
```

## Explanation

- For case 1: <br> **Index 1 and index 4 have same value, also (4-1) <= 3, Hence the output is Yes.**
