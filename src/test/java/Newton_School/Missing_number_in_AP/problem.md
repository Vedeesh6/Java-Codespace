# [Problem: Missing number in AP](https://my.newtonschool.co/playground/code/y91kcanr4org)

You are given an arithmetic series(AP) having n numbers. However, one number from this series is missing. Write a program to find and print the missing number. If there's no missing number, print the next number in the series.
<br>
Note: An arithmetic series is defined as a sequence of numbers in which the difference between any two consecutive terms is constant. In this problem, you can assume that the series is given in ascending order. (Given that the common difference can not be 0)

## Input

The first line of the input contains a single integer representing the size of the arithmetic series.<br>
The second line of the input contains n space separated numbers representing the AP series

## Constraints

**5 ≤ n ≤ 10<sup>5</sup> <br>
1 ≤ AP[i] ≤ 10<sup>9</sup>**

## Output

You're required to return an integer representing the missing number in the series.

## Sample

- Input:
```
5
1 3 5 9 11
```

- Output:
```
7
```

## Explanation

- For case 1: <br> **In the above arithmetic progression, The common difference is 2.
So, the series looks like: 1 3 5 7 9 11 13..
Hence the missing number in the series is 7.**
