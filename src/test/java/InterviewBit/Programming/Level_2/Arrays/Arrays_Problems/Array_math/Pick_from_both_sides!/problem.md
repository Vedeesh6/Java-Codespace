# [Problem: Pick from both sides!](https://www.interviewbit.com/problems/pick-from-both-sides/)

Given an integer array **A** of size **N**. You have to pick exactly **B** elements from either left or right end of the array **A** to get the maximum sum. Find and return this maximum possible sum. NOTE: Suppose **B** = 4 and array **A** contains 10 elements then. <br>
You can pick the first four elements or can pick the last four elements or can pick **1** from the front and **3** from the back etc. you need to return the maximum possible sum of elements you can pick.

## Input

First argument is an integer array **A**. <br>
Second argument is an integer **B**.

## Constraints

**1 ≤ N ≤ 10<sup>5</sup>** <br>
**1 ≤ B ≤ N** <br>
**-10<sup>3</sup> ≤ N ≤ 10<sup>3</sup>** <br>

## Output

Return an integer denoting the maximum possible sum of elements you picked.

## Sample

- Input:
```
A = [5, -2, 3 , 1, 2]
B = 3

A = [1, 2]
B = 1
```

- Output:
```
8
2
```

## Explanation

- For case 1: <br> **Pick element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8** <br>
- For case 2: <br> **Pick element 2 from end as this is the maximum we can get**
