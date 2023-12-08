# [Problem: Sum of Elements with K Set Bits](https://my.newtonschool.co/playground/code/mzo7u3qx6whl)

You are given a 0- indexed integer array nums and an integer k. Determine the sum of elements in nums whose corresponding indices have exactly k set bits in their binary representation.
<br>
The set bits in an integer are the 1's present when it is written in binary.

## Input

Input consists of three lines:
- First line contains an integer N, size of the array 'nums'
- Second line contains N integers representing array 'nums'
- Third line contains an integer K.

## Constraints

**1 ≤ N ≤ 10<sup>5</sup> <br>
0 <= nums[i] <= 10<sup>5</sup> <br>
0 <= K <= 31**

## Output

Print an integer denoting the sum of the required elements.

## Sample

- Input:
```
10
1 2 3 4 5 6 7 8 9 10
2
```

- Output:
```
27
```

## Explanation

- For case 1: <br> **In this example, the indices with exactly 2 set bits in their binary representation are 3 (0011), 5 (0101), 6 (0110) and 9 (1001). So adding all the values of indices gives : 4 + 6 + 7 + 10 = 27.**
