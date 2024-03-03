# [Problem: Find Maximum Sum](https://my.newtonschool.co/playground/code/f38irgzj2nhv)

A number n can be broken into three parts n/2,  n/3,  and n/4 (take the integer part only). Each number obtained in this process can be divided further recursively.  Find the maximum sum that can be obtained by summing up the divided parts together. We stop dividing when we cannpot further divide.

## Input

An integer n ( 0 <= n <= 10^6)

## Output

Print an integer the maximum sum as described in the problem.

## Sample

- Input:
```
12

24
```

- Output:
```
13

27
```

## Explanation

- For case 1: <br> **Break n = 12 in three parts {12/2, 12/3, 12/4} = {6, 4, 3}, now current sum is = (6 + 4 + 3) = 13. Further breaking 6, 4 and 3 into parts will produce sum less than or equal to 6, 4 and 3 respectively.** <br>
- For case 2: <br> **Break n = 24 in three parts {24/2, 24/3, 24/4} = {12, 8, 6}, now current sum is = (12 + 8 + 6) = 26. But recursively breaking 12 would produce value 13. So our maximum sum is 13 + 8 + 6 = 27.**
