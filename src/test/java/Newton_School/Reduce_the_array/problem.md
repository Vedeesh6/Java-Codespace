# [Problem: Reduce the array](https://my.newtonschool.co/playground/code/9919blxi82k3)

Arnav visited NewtonLand recently he found an array K of n integers, such that the sum of all elements of the array equals zero. In one operation, he can choose two different indices **i and j (1 ≤ i, j ≤ n)**, decrease k[i] by one, and increase k[j] by one.<br>
Note: If **i ≤ j-1** the above operation is free, otherwise it takes one special coin. <br>
What is the minimum special coin to spend to make all elements equal to 0?

## Input

Each test contains multiple test cases. The first line contains the number of test cases t. <br>
A description of the test cases follows. <br>
The first line of each test case contains an integer n — the number of elements. <br>
The next line contains n integers a1,…, an.  

## Constraints

**1 ≤ t ≤ 5000 <br>
1 ≤ n ≤ 10<sup>5</sup> <br>
−10<sup>9</sup> ≤ a[i] ≤ 10<sup>9</sup> <br>
It is guaranteed that the sum of n over all test cases does not exceed 10<sup>5</sup>**

## Output

For each test case, print the minimum number of special coins we have to spend in order to make all elements equal to 0.

## Sample

- Input:
```
1
4
-3 5 -3 1
```

- Output:
```
3
```

## Explanation

- For case 1: <br> **A possible strategy: <br>
Do (i=2,j=3)  three times (free), a=[−3,2,0,1]. <br>
Do (i=2,j=1) two times (pay two coins), a=[−1,0,0,1]. <br>
Do (i=4,j=1)one time (pay one coin), a=[0,0,0,0].**
