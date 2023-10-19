# [Problem: Sorting Game](https://my.newtonschool.co/playground/code/0t035pc69x7v)

Ravi loves challenges involving arrays! This time, he's dealing with an array of integers a of length n. Ravi is curious to know if he can sort this array in non-decreasing order under specific conditions. The only operation Ravi can perform is swapping two elements

<br> **> Swap two elements 𝑎i and aj such that 𝑖≠𝑗, ai and aj are either both even or both odd.**
<br>
Your task is to help Ravi determine if it's possible to sort this array in non-decreasing order by applying this unique swapping operation any number of times (possibly zero).

## Input

Input consists of 2 lines: 
- The first line will contain a single integer n, indicating the length of the array.
- The second line will contain n integers A1, A2,. , An, which are the elements of the array A. 

## Constraints

**2 ≤ n ≤ 10<sup>5</sup> <br> 1 ≤ A[i] ≤ 10<sup>5</sup> <br> (1 ≤ i ≤ n)**

## Output

Print "Yes", if it's possible to sort else "No".

## Sample

- Input:
```
63
45
100
```

- Output:
```
22:03
21:45
22:40
```

## Explanation

- For case 1: <br> **Swap elements at indices 3 and 1: [7, 10, 1, 3, 2] - > [1, 10, 7, 3, 2] <br>
Parity of 1 and 7: both are odd.<br>
Swap elements at indices 2 and 5: [1, 10, 7, 3, 2] - > [1, 2, 7, 3, 10]<br>
Parity of 10 and 2: both are even.<br>
Swap elements at indices 4 and 3: [1, 2, 7, 3, 10] - > [1, 2, 3, 7, 10]<br>
Parity of 3 and 7: both are odd.<br>
After performing these swaps, the array is sorted in non- decreasing order: [1, 2, 3, 7, 10].**
