# [Problem: Max Non Negative SubArray](https://www.interviewbit.com/problems/max-non-negative-subarray/)

Given an array of integers, **A** of length **N**, find out the maximum sum sub-array of non negative numbers from **A**. The sub-array should be contiguous i.e., a sub-array created by choosing the second and fourth element and skipping the third element is invalid. Maximum sub-array is defined in terms of the sum of the elements in the sub-array.

Find and return the required subarray.

NOTE:
- If there is a tie, then compare with segment's length and return segment which has maximum length.
- If there is still a tie, then return the segment with minimum starting index.


## Input

The first and the only argument of input contains an integer array **A**, of length **N**.

## Constraints

**1 ≤ N ≤ 10<sup>5</sup>**<br>
**-10<sup>9</sup> ≤ A<sub>i</sub> ≤ 10<sup>9</sup>**

## Output

Return an array of integers, that is a subarray of **A** that satisfies the given conditions.

## Sample

- Input:
```
A = [1, 2, 5, -7, 2, 3]
A = [10, -1, 2, 3, -4, 100]
```

- Output:
```
[1, 2, 5]
[100]
```

##Explanation
- For case 1: <br> **The two sub-arrays are [1, 2, 5], [2, 3]. <br>The answer is [1, 2, 5] as its sum is larger than [2, 3].** <br>
- For case 2: <br> **The three sub-arrays are [10], [2, 3], [100]. <br>The answer is [100] as its sum is larger than the other two.** 
