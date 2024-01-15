# [Problem: Total Cuts](https://my.newtonschool.co/playground/code/wlg78zyh6k9n)

You are given an array A of N integers and an integer K.  You have to find the total number of cuts that you can make such that for each cut these two conditions are satisfied
1. A cut divides an array into two parts equal or unequal length (non- zero).
2. Sum of the largest element in the left part and the smallest element in the right part is greater than or equal to K.

## Input

Input consists of two lines:
- The first line contains two integers- N : the size of the array and an integer: K
- The second line contains n space separated integers representing the array elements.

## Constraints

**1 <= N, K <= 10<sup>5</sup> <br>
1 <= A[i] <= 10<sup>5</sup>**

## Output

Print the total number of cuts.

## Sample

- Input:
```
3 3
1 2 3
```

- Output:
```
2
```

## Explanation

- For case 1: <br> **Two ways in which array is divided to satisfy above conditions are:**
  - {1} and {2, 3} - > 1+2>=3(satisfies the condition)
  - {1, 2} and {3} - > 2+3>=3(satisfies the condition)
