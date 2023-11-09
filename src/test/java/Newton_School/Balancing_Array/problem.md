# [Problem: Balancing Array](https://my.newtonschool.co/playground/code/7xaug56imybh)

Given an array of size n consisting of elements that are either -1 or +1, you are allowed to perform two types of replacements:
<br>
- Change 1 to -1 at a cost of A.
- Change -1 to 1 at a cost of B.
<br>
Your task is to modify the array in such a way that the absolute value of the sum is maximum, and the total cost of the replacements is minimized.
(Note: absolute value of (4) is 4, absolute value of (-4) is 4).

## Input

- The first line of the input contains 3 space separated integers n, A, B.
- The second line of the input contains n space separated integers, representing the elements of the array (-1 or +1).

## Constraints

**1 <= n <= 10<sup>5</sup> <br>
1 <= A <= 10<sup>9</sup> <br>
1 <= B <= 10<sup>9</sup>**

## Output

Print an integer, the minimum cost required to achieve a maximum absolute sum of the modified array.

## Sample

- Input:
```
10 3 4
-1 -1 -1 -1 1 1 -1 1 -1 1
```

- Output:
```
12
```

## Explanation

- For case 1: <br> **You can convert the array into the following: 
[-1 -1 -1 -1 -1 -1 -1 -1 -1 -1] by changing all 4 +1 into -1, with a cost of (4x3) = 12.**
