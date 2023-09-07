# [Problem: Beauty of the array](https://my.newtonschool.co/playground/code/lgrvnkg4dhez)

You're given an array of size n. You can rearrange the array to form a beautiful array. Find the maximum length of the subarray that is a beautiful after rearrangment. <br>
A beautiful array is an array in which even and odd numbers are adjacent. <br>
(i. e. [ 1, 2, 3, 4, 5] is a beautiful array of size 5, <br>
[2, 3, 4, 5, 6] is also a beautiful array of size 5, <br>
But, [1, 7, 2, 3 ] is not a beautiful array as 1 and 7 (both odd) are adjacent, similarly <br>
[2, 4, 3, 6] is not a not a beautiful array as 2 and 4 (both even) are adjacent. ) <br>

## Input

The input consists of two lines:
- The first line contains an integer n, the size of array.
- The second line contains n integers, the array elements

## Constraints

**1 <= n <= 10<sup>6</sup> <br>
1 <= array[i] <= 10<sup>9</sup>**
## Output

Print the maximum length of a subarray that is beautiful.

## Sample

- Input:
```
6
1 8 5 4 2 8 6 6 7 6
```

- Output:
```
6
```

## Explanation

- For case 1: <br> **We can rearrange the array as [ 1, 8, 5, 4, 7, 2, 6, 6, 6], In this array, subarray [1, 8, 5, 4, 7, 2] is beautiful and
Hence, the maximum length of beautiful subarray is 6.**
